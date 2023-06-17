package com.ruoyi.project.his.domain;

import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * durgdurg对象 drugs_durg
 *
 * @author yc
 * @date 2023-06-18
 */
public class DrugsDurg extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 药品ID */
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

    /** $table.subTable.functionName信息 */
    private List<DrugsProducer> drugsProducerList;

    public void setDurgId(Long durgId)
    {
        this.durgId = durgId;
    }

    public Long getDurgId()
    {
        return durgId;
    }
    public void setDurgName(String durgName)
    {
        this.durgName = durgName;
    }

    public String getDurgName()
    {
        return durgName;
    }
    public void setDurgCode(String durgCode)
    {
        this.durgCode = durgCode;
    }

    public String getDurgCode()
    {
        return durgCode;
    }
    public void setDurgProducer(Long durgProducer)
    {
        this.durgProducer = durgProducer;
    }

    public Long getDurgProducer()
    {
        return durgProducer;
    }
    public void setDurgType(String durgType)
    {
        this.durgType = durgType;
    }

    public String getDurgType()
    {
        return durgType;
    }
    public void setDurgOtcType(String durgOtcType)
    {
        this.durgOtcType = durgOtcType;
    }

    public String getDurgOtcType()
    {
        return durgOtcType;
    }
    public void setDurgUnit(String durgUnit)
    {
        this.durgUnit = durgUnit;
    }

    public String getDurgUnit()
    {
        return durgUnit;
    }
    public void setDurgOtcPrice(Long durgOtcPrice)
    {
        this.durgOtcPrice = durgOtcPrice;
    }

    public Long getDurgOtcPrice()
    {
        return durgOtcPrice;
    }
    public void setDurgNumber(Long durgNumber)
    {
        this.durgNumber = durgNumber;
    }

    public Long getDurgNumber()
    {
        return durgNumber;
    }
    public void setDurgNumberMin(Long durgNumberMin)
    {
        this.durgNumberMin = durgNumberMin;
    }

    public Long getDurgNumberMin()
    {
        return durgNumberMin;
    }
    public void setDurgConvert(Long durgConvert)
    {
        this.durgConvert = durgConvert;
    }

    public Long getDurgConvert()
    {
        return durgConvert;
    }
    public void setDurgStatus(String durgStatus)
    {
        this.durgStatus = durgStatus;
    }

    public String getDurgStatus()
    {
        return durgStatus;
    }

    public List<DrugsProducer> getDrugsProducerList()
    {
        return drugsProducerList;
    }

    public void setDrugsProducerList(List<DrugsProducer> drugsProducerList)
    {
        this.drugsProducerList = drugsProducerList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("durgId", getDurgId())
                .append("durgName", getDurgName())
                .append("durgCode", getDurgCode())
                .append("durgProducer", getDurgProducer())
                .append("durgType", getDurgType())
                .append("durgOtcType", getDurgOtcType())
                .append("durgUnit", getDurgUnit())
                .append("durgOtcPrice", getDurgOtcPrice())
                .append("durgNumber", getDurgNumber())
                .append("durgNumberMin", getDurgNumberMin())
                .append("durgConvert", getDurgConvert())
                .append("durgStatus", getDurgStatus())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("remark", getRemark())
                .append("drugsProducerList", getDrugsProducerList())
                .toString();
    }
}