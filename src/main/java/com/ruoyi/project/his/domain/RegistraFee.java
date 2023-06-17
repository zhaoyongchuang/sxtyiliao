package com.ruoyi.project.his.domain;

import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import java.math.BigDecimal;

public class RegistraFee extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 挂号费ID */
    private Long registraId;

    /** 挂号费名称 */
    @Excel(name = "挂号费名称")
    private String registraName;

    /** 挂号费 */
    @Excel(name = "挂号费")
    private BigDecimal registraUnitprice;

    /** 执行状态（0正常 1失败） */
    @Excel(name = "执行状态", readConverterExp = "0=正常,1=失败")
    private Long status;

    /** 扩展字段1 */
    @Excel(name = "扩展字段1")
    private String ext01;

    /** 扩展字段2 */
    @Excel(name = "扩展字段2")
    private String ext02;

    public void setRegistraId(Long registraId)
    {
        this.registraId = registraId;
    }

    public Long getRegistraId()
    {
        return registraId;
    }
    public void setRegistraName(String registraName)
    {
        this.registraName = registraName;
    }

    public String getRegistraName()
    {
        return registraName;
    }
    public void setRegistraUnitprice(BigDecimal registraUnitprice)
    {
        this.registraUnitprice = registraUnitprice;
    }

    public BigDecimal getRegistraUnitprice()
    {
        return registraUnitprice;
    }
    public void setStatus(Long status)
    {
        this.status = status;
    }

    public Long getStatus()
    {
        return status;
    }
    public void setExt01(String ext01)
    {
        this.ext01 = ext01;
    }

    public String getExt01()
    {
        return ext01;
    }
    public void setExt02(String ext02)
    {
        this.ext02 = ext02;
    }

    public String getExt02()
    {
        return ext02;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("registraId", getRegistraId())
                .append("registraName", getRegistraName())
                .append("registraUnitprice", getRegistraUnitprice())
                .append("status", getStatus())
                .append("ext01", getExt01())
                .append("ext02", getExt02())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("remark", getRemark())
                .toString();
    }
}
