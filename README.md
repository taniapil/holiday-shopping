# Applitools Holiday Shopping Hackathon

[Hackathon instructions](https://applitools.com/hackathon-v20-3-instructions/)

## Part 1
Imagine you are an engineer assigned to test a retail application, AppliFashion, before the busy holiday season. Your job is to automate the tests below against the [V1 production version](http://demo.applitools.com/tlcHackathonMasterV1.html) of this application.

For each test, use Applitools Eyes as your verification tool along with one of the following browser automation frameworks and programming languages:

#### Eligible Testing Frameworks
- Selenium WebDriver
- Cypress
- TestCafe
- WebdriverIO

#### Eligible programming languages
- Java
- JavaScript
- Python
- C#

Set Eyes to run each of the three tests on Chrome (1200 x 800) using [Applitools Ultrafast Grid](http://demo.applitools.com/tlcHackathonMasterV1.html).

### Tests
Include the following tests within an Applitools batch called “Holiday Shopping”.

#### Main Page
Check the [main page](https://demo.applitools.com/tlcHackathonMasterV1.html) of the app by using Applitools Eyes to [take a screenshot of the entire page](https://applitools.com/docs/api/eyes-sdk/classes-gen/class_eyes/method-eyes-checkwindow-selenium-java.html).
Please use the following information for your visual check:
- App Name: “AppliFashion”
- Test name: “Test 1”
- Step name: “main page”

#### Filtered Product Grid
On the left side of the [main page](https://demo.applitools.com/tlcHackathonMasterV1.html), check Black under the colors filter and click the Filter button.

Use Applitools Eyes’ [Check Region](https://applitools.com/docs/api/eyes-sdk/classes-gen/class_eyes/method-eyes-checkregion-selenium-java.html) feature to only capture a screenshot of the shoes grid (id=product_grid) and verify that only two black shoes appear.

Please use the following information for your visual check:
- App Name: “AppliFashion”
- Test name: “Test 2”
- Step name: “filter by color”

#### Product Details
Without filtering, click on the Appli Air x Night shoe

Use Applitools to take a screenshot of the entire page to verify all of the details about the product.

Please use the following information for your visual check:
- Use: App Name: “AppliFashion”
- Test name: “Test 3”
- Step name: “product details”

Important: Make a note of the URL for your batch test results from the Applitools Dashboard. This is what you will submit upon completion for Part 1.

## Part 2
Run the same tests against the [dev-branch version](http://demo.applitools.com/tlcHackathonDev.html), which contains bugs.

For bugs found, use the Applitools Dashboard to:
- Mark the tests as failed
- Add [Bug Region](https://applitools.com/docs/topics/test-manager/viewers/tm-viewer-test-editor.html#Add) annotations for bugs found. Don’t forget to save your results in the dashboard after failing the tests.
- In Test 3, find the cause of the bug by using the [Root Cause Analysis](https://applitools.com/docs/topics/test-manager/viewers/root-cause-analysis.html) (RCA) feature and provide comments in the bug region annotations explaining the exact cause of the failures, as indicated by RCA.

Important: Make a note of the URL for the Root Cause Analysis (RCA) view of the Applitools Dashboard for failed Test 3. To get this URL, open the RCA pane and click the share icon. This is what you will submit upon completion for Part 2.

![](https://applitools.com/wp-content/uploads/2020/11/RCA-hackathon-instructions-e1604678247895.png)

## Part 3
All of the bugs have been fixed! Run your tests again in the [final production version](https://demo.applitools.com/tlcHackathonMasterV2.html) of the app but first update your configurations to set Eyes to run each of the three tests across the following configurations using [Applitools Ultrafast Grid](https://applitools.com/docs/topics/sdk/vg-configuration.html?Highlight=grid):
- Chrome (1200 x 800)
- Firefox (1200 x 800)
- Edge Chromium (1200 x 800)
- Safari (1200 x 800)
- iPhone X

Yay, your tests have passed. To see what would have happened if you used a pixel-to-pixel visual validation tool as opposed to Applitools AI-based approach, choose the passed Chrome Desktop run for Test 1 and [preview it in Exact mode](https://applitools.com/docs/topics/test-manager/viewers/tm-viewer-step-editor.html#Preview).

Notice the tests would have failed for a simple pixel shift, which is sometimes common in browser updates. Good thing you now know better than to trust a pixel-based visual testing tool! :sunglasses: 

Important: Make a note of the URL for your batch test results from the Applitools Dashboard. This is what you will submit upon completion for Part 3.

## Submission
Ready to submit? Awesome! Add your code to a private GitHub repo and add [hackathonjudges@applitools.com](hackathonjudges@applitools.com) as a contributor.

Finally, complete the [submission form](https://applitools.com/hackathon-v20-3-submit/).

## Applifashion App Versions
- [V1 production version](https://demo.applitools.com/tlcHackathonMasterV1.html)
- [Dev-branch version](https://demo.applitools.com/tlcHackathonDev.html)
- [Final production version](https://demo.applitools.com/tlcHackathonMasterV2.html)

