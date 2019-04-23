package com.qianfeng.po;


public class TbPhone {

  private long phoneId;
  private long brandId;
  private String phoneName;
  private String phoneImg;
  private long phonePrice;


  public long getPhoneId() {
    return phoneId;
  }

  public void setPhoneId(long phoneId) {
    this.phoneId = phoneId;
  }


  public long getBrandId() {
    return brandId;
  }

  public void setBrandId(long brandId) {
    this.brandId = brandId;
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


  public long getPhonePrice() {
    return phonePrice;
  }

  public void setPhonePrice(long phonePrice) {
    this.phonePrice = phonePrice;
  }

}
