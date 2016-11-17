package com.sudheer.drools.poc;

/**
 * Created by Sudheer Babu Gutha.
 */
public class Phone {

    private int phoneId;
    private String phoneName;
    private String phoneModel;
    private int phoneCost;
    private int offerPercentage;


    public Phone() {
    }

    public Phone(int phoneId, String phoneName, String phoneModel, int phoneCost) {
        this.phoneId = phoneId;
        this.phoneName = phoneName;
        this.phoneModel = phoneModel;
        this.phoneCost = phoneCost;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    public int getPhoneCost() {
        return phoneCost;
    }

    public void setPhoneCost(int phoneCost) {
        this.phoneCost = phoneCost;
    }

    public int getOfferPercentage() {
        return offerPercentage;
    }

    public void setOfferPercentage(int offerPercentage) {
        this.offerPercentage = offerPercentage;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneId=" + phoneId +
                ", phoneName='" + phoneName + '\'' +
                ", phoneModel='" + phoneModel + '\'' +
                ", phoneCost=" + phoneCost +
                ", offerPercentage=" + offerPercentage +
                '}';
    }
}
