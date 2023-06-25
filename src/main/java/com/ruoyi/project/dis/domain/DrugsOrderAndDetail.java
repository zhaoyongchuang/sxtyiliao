package com.ruoyi.project.dis.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.framework.web.domain.BaseEntity;

import java.util.Date;
import java.util.Objects;

/**
 * 采购入库相关实体
 * 包含多张表格中的部分字段信息
 * 药品表格，采购入库表格，单据明细表格，供应商表格
 */


public class DrugsOrderAndDetail extends BaseEntity {
    private static final long serialVersionUID = 1L;
// 单据主键
    private Integer orderId;
//    供应商主键
    private Integer supportId;
//    供应商名称
    private String supportName;
//    药品主键
    private Integer durgId;
    private String durgName;
    private Integer detailBathNum;
    private Integer detailTotalPrice;
    private Integer detailStatus;// 6-申请中 1-待审核 2-审核失败 3-审核通过 4-已入库，5-作废状态
//   入库操作员
    private String detailOperator;
    // 申请人
    private String orderMan;
    private String detailDate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    private Integer detailId;

    @Override
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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

    public Integer getDurgId() {
        return durgId;
    }

    public void setDurgId(Integer durgId) {
        this.durgId = durgId;
    }

    public String getDurgName() {
        return durgName;
    }

    public void setDurgName(String durgName) {
        this.durgName = durgName;
    }

    public Integer getDetailBathNum() {
        return detailBathNum;
    }

    public void setDetailBathNum(Integer detailBathNum) {
        this.detailBathNum = detailBathNum;
    }

    public Integer getDetailTotalPrice() {
        return detailTotalPrice;
    }

    public void setDetailTotalPrice(Integer detailTotalPrice) {
        this.detailTotalPrice = detailTotalPrice;
    }

    public Integer getDetailStatus() {
        return detailStatus;
    }

    public void setDetailStatus(Integer detailStatus) {
        this.detailStatus = detailStatus;
    }

    public String getDetailOperator() {
        return detailOperator;
    }

    public void setDetailOperator(String detailOperator) {
        this.detailOperator = detailOperator;
    }

    public String getOrderMan() {
        return orderMan;
    }

    public void setOrderMan(String orderMan) {
        this.orderMan = orderMan;
    }

    public String getDetailDate() {
        return detailDate;
    }

    public void setDetailDate(String detailDate) {
        this.detailDate = detailDate;
    }


    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    @Override
    public String toString() {
        return "DrugsOrderAndDetail{" +
                "orderId=" + orderId +
                ", supportId=" + supportId +
                ", supportName='" + supportName + '\'' +
                ", durgId=" + durgId +
                ", durgName='" + durgName + '\'' +
                ", detailBathNum=" + detailBathNum +
                ", detailTotalPrice=" + detailTotalPrice +
                ", detailStatus=" + detailStatus +
                ", detailOperator='" + detailOperator + '\'' +
                ", orderMan='" + orderMan + '\'' +
                ", detailDate='" + detailDate + '\'' +
                ", createDate='" + createTime + '\'' +
                ", detailId=" + detailId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DrugsOrderAndDetail that = (DrugsOrderAndDetail) o;
        return Objects.equals(orderId, that.orderId) && Objects.equals(supportId, that.supportId) && Objects.equals(supportName, that.supportName) && Objects.equals(durgId, that.durgId) && Objects.equals(durgName, that.durgName) && Objects.equals(detailBathNum, that.detailBathNum) && Objects.equals(detailTotalPrice, that.detailTotalPrice) && Objects.equals(detailStatus, that.detailStatus) && Objects.equals(detailOperator, that.detailOperator) && Objects.equals(orderMan, that.orderMan) && Objects.equals(detailDate, that.detailDate) && Objects.equals(createTime, that.createTime) && Objects.equals(detailId, that.detailId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, supportId, supportName, durgId, durgName, detailBathNum, detailTotalPrice, detailStatus, detailOperator, orderMan, detailDate, createTime, detailId);
    }
}
