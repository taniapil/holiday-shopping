package com.applitools.hackathon.holidayshopping.enums;

public enum Product {
    APPLI_AIR_X_NIGHT("product_1"),
    APPLI_OKWAHN_II("product_2"),
    APPLI_AIR_WILDWOOD_ACG("product_3"),
    APPLI_ACG_REACT_TERRA("product_4"),
    APPLI_AIR_ZOOM_ALPHA("product_5"),
    APPLI_AIR_ALPHA("product_6"),
    APPLI_AIR_98("product_7"),
    APPLI_AIR_720("product_8"),
    APPLI_720("product_9");

    private final String productId;

    Product(String productId) {
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }

}
