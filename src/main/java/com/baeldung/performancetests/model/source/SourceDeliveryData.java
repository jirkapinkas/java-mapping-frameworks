package com.baeldung.performancetests.model.source;

import com.googlecode.jmapper.annotations.JMapAccessor;

public class SourceDeliveryData {
    private SourceAddress deliveryAddress;
    @JMapAccessor(get = "isPrePaid", set = "setPrePaid")
    private boolean isPrePaid;
    private String trackingCode;
    private int expectedDeliveryTimeInDays;

    public SourceDeliveryData() {
    }

    public SourceAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(SourceAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public boolean isPrePaid() {
        return isPrePaid;
    }

    public void setPrePaid(boolean prePaid) {
        isPrePaid = prePaid;
    }

    public String getTrackingCode() {
        return trackingCode;
    }

    public void setTrackingCode(String trackingCode) {
        this.trackingCode = trackingCode;
    }

    public int getExpectedDeliveryTimeInDays() {
        return expectedDeliveryTimeInDays;
    }

    public void setExpectedDeliveryTimeInDays(int expectedDeliveryTimeInDays) {
        this.expectedDeliveryTimeInDays = expectedDeliveryTimeInDays;
    }

    public SourceDeliveryData(SourceAddress deliveryAddress, boolean isPrePaid, String trackingCode, int expectedDeliveryTimeInDays) {
        this.deliveryAddress = deliveryAddress;
        this.isPrePaid = isPrePaid;
        this.trackingCode = trackingCode;
        this.expectedDeliveryTimeInDays = expectedDeliveryTimeInDays;
    }
}
