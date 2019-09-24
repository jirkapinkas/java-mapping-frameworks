package com.baeldung.performancetests.model.source;

import java.util.List;

public class Shop {

    private String shopName;
    private SourceAddress shopAddres;

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public SourceAddress getShopAddres() {
        return shopAddres;
    }

    public void setShopAddres(SourceAddress shopAddres) {
        this.shopAddres = shopAddres;
    }

    public Shop() {
    }

    public String getShopUrl() {
        return shopUrl;
    }

    public void setShopUrl(String shopUrl) {
        this.shopUrl = shopUrl;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public Shop(String shopName, SourceAddress shopAddres, String shopUrl, List<Review> reviews) {

        this.shopName = shopName;
        this.shopAddres = shopAddres;
        this.shopUrl = shopUrl;
        this.reviews = reviews;
    }

    private String shopUrl;
    private List<Review> reviews;
}
