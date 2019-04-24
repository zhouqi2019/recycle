package com.qianfeng.vo;


import java.util.List;

public class DamageVo {

    private Long typeId;
    private String typeName;
    private Integer typePage;

    private List<DiscountVo> discountVos;

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getTypePage() {
        return typePage;
    }

    public void setTypePage(Integer typePage) {
        this.typePage = typePage;
    }

    public List<DiscountVo> getDiscountVos() {
        return discountVos;
    }

    public void setDiscountVos(List<DiscountVo> discountVos) {
        this.discountVos = discountVos;
    }

    public DamageVo() {
    }


    public DamageVo(Long typeId, String typeName, Integer typePage, List<DiscountVo> discountVos) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.typePage = typePage;
        this.discountVos = discountVos;
    }
}
