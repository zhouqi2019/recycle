package com.qianfeng.vo;

public class InfoVo {
    private String brandName;
    private String phoneName;
    private String phoneImg;
    private String phonePrice;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getPhoneImg() {
        return phoneImg;
    }

    public void setPhoneImg(String phoneImg) {
        this.phoneImg = phoneImg;
    }

    public String getPhonePrice() {
        return phonePrice;
    }

    public void setPhonePrice(String phonePrice) {
        this.phonePrice = phonePrice;
    }

    public InfoVo() {
    }

    public InfoVo(String brandName, String phoneName, String phoneImg, String phonePrice) {
        this.brandName = brandName;
        this.phoneName = phoneName;
        this.phoneImg = phoneImg;
        this.phonePrice = phonePrice;
    }

    @Override
    public String toString() {
        return "InfoVo{" +
                "brandName='" + brandName + '\'' +
                ", phoneName='" + phoneName + '\'' +
                ", phoneImg='" + phoneImg + '\'' +
                ", phonePrice='" + phonePrice + '\'' +
                '}';
    }
}
