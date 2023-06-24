package com.ruoyi.project.pill.domain;



import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import com.ruoyi.project.dis.domain.DrugsProducer;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 药品信息对象 pill_drug
 * 
 * @author izumi
 * @date 2023-05-13
 */
public class PillDrug extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    private Long durgId;

    /** 药品名称 */
    @Excel(name = "药品名称")
    private String durgName;

    /** 药品编码 */
    @Excel(name = "药品编码")
    private String durgCode;

    /** 生产厂家（外键ID） */
    @Excel(name = "生产厂家", readConverterExp = "外=键ID")
    private Long durgProducer;

    /** 药品类型 */
    @Excel(name = "药品类型")
    private String durgType;

    /** 处方类型 */
    @Excel(name = "处方类型")
    private String durgOtcType;

    /** 单位g */
    @Excel(name = "单位g")
    private String durgUnit;

    /** 处方价格 */
    @Excel(name = "处方价格")
    private Long durgOtcPrice;

    /** 库存量 */
    @Excel(name = "库存量")
    private Long durgNumber;

    /** 预警值（超过这个值变红） */
    @Excel(name = "预警值", readConverterExp = "超=过这个值变红")
    private Long durgNumberMin;

    /** 换算量 */
    @Excel(name = "换算量")
    private Long durgConvert;

    /** 状态（0正常,1警告） */
    @Excel(name = "状态", readConverterExp = "0=正常,1警告")
    private String durgStatus;

    private PillFactory PillFactory;

    public PillFactory getPillFactory() {
        return PillFactory;
    }

    public void setPillFactory(PillFactory pillFactory) {
        PillFactory = pillFactory;
    }

    public Long getDurgId() {
        return durgId;
    }

    public void setDurgId(Long durgId) {
        this.durgId = durgId;
    }

    public String getDurgName() {
        return durgName;
    }

    public void setDurgName(String durgName) {
        this.durgName = durgName;
    }

    public String getDurgCode() {
        return durgCode;
    }

    public void setDurgCode(String durgCode) {
        this.durgCode = durgCode;
    }

    public Long getDurgProducer() {
        return durgProducer;
    }

    public void setDurgProducer(Long durgProducer) {
        this.durgProducer = durgProducer;
    }

    public String getDurgType() {
        return durgType;
    }

    public void setDurgType(String durgType) {
        this.durgType = durgType;
    }

    public String getDurgOtcType() {
        return durgOtcType;
    }

    public void setDurgOtcType(String durgOtcType) {
        this.durgOtcType = durgOtcType;
    }

    public String getDurgUnit() {
        return durgUnit;
    }

    public void setDurgUnit(String durgUnit) {
        this.durgUnit = durgUnit;
    }

    public Long getDurgOtcPrice() {
        return durgOtcPrice;
    }

    public void setDurgOtcPrice(Long durgOtcPrice) {
        this.durgOtcPrice = durgOtcPrice;
    }

    public Long getDurgNumber() {
        return durgNumber;
    }

    public void setDurgNumber(Long durgNumber) {
        this.durgNumber = durgNumber;
    }

    public Long getDurgNumberMin() {
        return durgNumberMin;
    }

    public void setDurgNumberMin(Long durgNumberMin) {
        this.durgNumberMin = durgNumberMin;
    }

    public Long getDurgConvert() {
        return durgConvert;
    }

    public void setDurgConvert(Long durgConvert) {
        this.durgConvert = durgConvert;
    }

    public String getDurgStatus() {
        return durgStatus;
    }

    public void setDurgStatus(String durgStatus) {
        this.durgStatus = durgStatus;
    }


    @Override
    public String toString() {
        return "PillDrug{" +
                "durgId=" + durgId +
                ", durgName='" + durgName + '\'' +
                ", durgCode='" + durgCode + '\'' +
                ", durgProducer=" + durgProducer +
                ", durgType='" + durgType + '\'' +
                ", durgOtcType='" + durgOtcType + '\'' +
                ", durgUnit='" + durgUnit + '\'' +
                ", durgOtcPrice=" + durgOtcPrice +
                ", durgNumber=" + durgNumber +
                ", durgNumberMin=" + durgNumberMin +
                ", durgConvert=" + durgConvert +
                ", durgStatus='" + durgStatus + '\'' +
                '}';
    }
}
