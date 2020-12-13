package com.applitools.hackathon.holidayshopping.enums;

public enum Filter {
    TYPE_SOCCER("LABEL__containerc__79"),
    TYPE_BASKETBALL("LABEL__containerc__84"),
    TYPE_RUNNING("LABEL__containerc__89"),
    TYPE_TRAINING("LABEL__containerc__94"),
    COLOR_BLACK("LABEL__containerc__104"),
    COLOR_WHITE("LABEL__containerc__109"),
    COLOR_BLUE("LABEL__containerc__114"),
    COLOR_GREEN("LABEL__containerc__119"),
    COLOR_YELLOW("LABEL__containerc__124"),
    BRAND_ADIBAS("LABEL__containerc__134"),
    BRAND_MYKEY("LABEL__containerc__139"),
    BRAND_BANS("LABEL__containerc__144"),
    BRAND_OVER_ARMOUR("LABEL__containerc__149"),
    BRAND_IMBALANCE("LABEL__containerc__154"),
    PRICE_0_50("LABEL__containerc__164"),
    PRICE_50_100("LABEL__containerc__169"),
    PRICE_100_150("LABEL__containerc__174"),
    PRICE_150_500("LABEL__containerc__179");

    private final String filterId;

    Filter(String filterId) {
        this.filterId = filterId;
    }

    public String getFilterId() {
        return filterId;
    }

}
