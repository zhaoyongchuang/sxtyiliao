package com.ruoyi.project.pill.domain;

import com.ruoyi.framework.web.domain.BaseEntity;

//供应商表格
public class DrugsSupport extends BaseEntity {
    private static final long serialVersionUID = 1L;

    private Integer supportId;
    private String supportName;

    private String supportBoss;
    private String supportPhone;

    private String supportCard;

    private String supportAddress;
    private String supportStatus;

    public String getSupportCard() {
        return supportCard;
    }

    public void setSupportCard(String supportCard) {
        this.supportCard = supportCard;
    }

    public Integer getSupportId() {
        return supportId;
    }

    public void setSupportId(Integer supportId) {
        this.supportId = supportId;
    }

    public String getSupportName() {
        return supportName;
    }

    public void setSupportName(String supportName) {
        this.supportName = supportName;
    }

    public String getSupportBoss() {
        return supportBoss;
    }

    public void setSupportBoss(String supportBoss) {
        this.supportBoss = supportBoss;
    }

    public String getSupportPhone() {
        return supportPhone;
    }

    public void setSupportPhone(String supportPhone) {
        this.supportPhone = supportPhone;
    }

    public String getSupportAddress() {
        return supportAddress;
    }

    public void setSupportAddress(String supportAddress) {
        this.supportAddress = supportAddress;
    }

    public String getSupportStatus() {
        return supportStatus;
    }

    public void setSupportStatus(String supportStatus) {
        this.supportStatus = supportStatus;
    }

    @Override
    public String toString() {
        return "DrugsSupport{" +
                "supportId=" + supportId +
                ", supportName='" + supportName + '\'' +
                ", supportBoss='" + supportBoss + '\'' +
                ", supportPhone='" + supportPhone + '\'' +
                ", supportCard='" + supportCard + '\'' +
                ", supportAddress='" + supportAddress + '\'' +
                ", supportStatus='" + supportStatus + '\'' +
                '}';
    }

}
