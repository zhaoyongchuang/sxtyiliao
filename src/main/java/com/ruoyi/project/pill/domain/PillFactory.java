package com.ruoyi.project.pill.domain;


import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 生产厂家信息对象 pill_factory
 * 
 * @author izumi
 * @date 2023-05-13
 */
public class PillFactory extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 厂家id */
    private Long proId;

    /** 厂家名称 */
    @Excel(name = "厂家名称")
    private String proName;

    /** 厂家编码 */
    @Excel(name = "厂家编码")
    private String proCode;

    /** 联系人 */
    @Excel(name = "联系人")
    private String proBoss;

    /** 手机号 */
    @Excel(name = "手机号")
    private String proPhone;

    /** 关键字 */
    @Excel(name = "关键字")
    private String proKeywords;

    /** 状态（0正常,1禁用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1禁用")
    private String proStatus;

    /** 厂家地址 */
    @Excel(name = "厂家地址")
    private String proAddress;

    public void setProId(Long proId)
    {
        this.proId = proId;
    }

    public Long getProId()
    {
        return proId;
    }
    public void setProName(String proName)
    {
        this.proName = proName;
    }

    public String getProName()
    {
        return proName;
    }
    public void setProCode(String proCode)
    {
        this.proCode = proCode;
    }

    public String getProCode()
    {
        return proCode;
    }
    public void setProBoss(String proBoss)
    {
        this.proBoss = proBoss;
    }

    public String getProBoss()
    {
        return proBoss;
    }
    public void setProPhone(String proPhone)
    {
        this.proPhone = proPhone;
    }

    public String getProPhone()
    {
        return proPhone;
    }
    public void setProKeywords(String proKeywords)
    {
        this.proKeywords = proKeywords;
    }

    public String getProKeywords()
    {
        return proKeywords;
    }
    public void setProStatus(String proStatus)
    {
        this.proStatus = proStatus;
    }

    public String getProStatus()
    {
        return proStatus;
    }
    public void setProAddress(String proAddress)
    {
        this.proAddress = proAddress;
    }

    public String getProAddress()
    {
        return proAddress;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("proId", getProId())
                .append("proName", getProName())
                .append("proCode", getProCode())
                .append("proBoss", getProBoss())
                .append("proPhone", getProPhone())
                .append("proKeywords", getProKeywords())
                .append("proStatus", getProStatus())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("remark", getRemark())
                .append("proAddress", getProAddress())
                .toString();
    }
}
