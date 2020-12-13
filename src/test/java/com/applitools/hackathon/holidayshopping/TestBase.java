package com.applitools.hackathon.holidayshopping;

import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.TestResultsSummary;
import com.applitools.eyes.selenium.BrowserType;
import com.applitools.eyes.selenium.Configuration;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.fluent.Target;
import com.applitools.eyes.visualgrid.model.DeviceName;
import com.applitools.eyes.visualgrid.model.ScreenOrientation;
import com.applitools.eyes.visualgrid.services.VisualGridRunner;
import com.applitools.hackathon.holidayshopping.enums.Checkpoint;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static com.applitools.hackathon.holidayshopping.enums.Checkpoint.WINDOW;

public class TestBase {
    protected WebDriver driver;
    protected Eyes eyes;
    private VisualGridRunner runner;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        loadProperties();
        initiateDriver();
        initiateEyes();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
        eyes.abortAsync();
        TestResultsSummary allTestResults = runner.getAllTestResults(false);
        System.out.println(allTestResults);
    }

    private void loadProperties() {
        Properties props = System.getProperties();
        try {
            props.load(new FileInputStream("resources/properties/test.properties"));
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

    private void initiateDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    private void initiateEyes() {
        Configuration config = new Configuration();
        config.setApiKey(System.getProperty("applitools.api.key"));
        config.setBatch(new BatchInfo("Holiday Shopping"));
        config.addBrowser(1200, 800, BrowserType.CHROME);
        /*
         the following configurations are used only in Part 3, that's why these lines are commented out

         config.addBrowser(1200, 800, BrowserType.FIREFOX);
         config.addBrowser(1200, 800, BrowserType.EDGE_CHROMIUM);
         config.addBrowser(1200, 800, BrowserType.SAFARI);
         config.addDeviceEmulation(DeviceName.iPhone_X, ScreenOrientation.PORTRAIT);
        */
        runner = new VisualGridRunner(1);
        eyes = new Eyes(runner);
        eyes.setConfiguration(config);
    }

    public void validate(String appName, String testName, String stepName) {
        validate(appName, testName, stepName, WINDOW, null);
    }

    public void validate(String appName, String testName, String stepName, Checkpoint checkpoint, WebElement element) {
        eyes.open(driver, appName, testName);
        switch (checkpoint) {
            case REGION:
                eyes.check(Target.region(element).fully().withName(stepName));
                break;
            case FRAME:
                eyes.check(Target.frame(element).fully().withName(stepName));
                break;
            case WINDOW:
            default:
                eyes.check(Target.window().fully().withName(stepName));
                break;
        }
        eyes.closeAsync();
    }

}
