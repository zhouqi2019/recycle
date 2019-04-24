package com.qianfeng.vo;

public class DiscountVo {

    private Long damageId;
    private String damageInfo;
    private String infoDamage;
    private Long discountRate;

    public Long getDamageId() {
        return damageId;
    }

    public void setDamageId(Long damageId) {
        this.damageId = damageId;
    }

    public String getDamageInfo() {
        return damageInfo;
    }

    public void setDamageInfo(String damageInfo) {
        this.damageInfo = damageInfo;
    }

    public String getInfoDamage() {
        return infoDamage;
    }

    public void setInfoDamage(String infoDamage) {
        this.infoDamage = infoDamage;
    }

    public Long getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Long discountRate) {
        this.discountRate = discountRate;
    }

    public DiscountVo() {
    }

    public DiscountVo(Long damageId, String damageInfo, String infoDamage, Long discountRate) {
        this.damageId = damageId;
        this.damageInfo = damageInfo;
        this.infoDamage = infoDamage;
        this.discountRate = discountRate;
    }
}
