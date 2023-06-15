package com.ruoyi.project.his.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

import java.math.BigDecimal;

public class ProjectFee extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 检查项目ID */
    private Long projectId;

    /** 项目名称 */
    @Excel(name = "项目名称")
    private String projectName;

    /** 关键字 */
    @Excel(name = "关键字")
    private String keyword;

    /** 项目费用 */
    @Excel(name = "项目费用")
    private BigDecimal projectUnitprice;

    /** 项目成本 */
    @Excel(name = "项目成本")
    private BigDecimal projectCost;

    /** 项目单位 */
    @Excel(name = "项目单位")
    private String projectTimes;

    /** 项目类型 */
    @Excel(name = "项目类型")
    private String projectType;

    /** 所属部门的id（外键） */
    @Excel(name = "所属部门的id", readConverterExp = "外=键")
    private Long projectDeptId;

    /** 执行状态（0正常 1失败） */
    @Excel(name = "执行状态", readConverterExp = "0=正常,1=失败")
    private String status;

    /** 扩展字段1 */
    @Excel(name = "扩展字段1")
    private String ext01;

    /** 扩展字段2 */
    @Excel(name = "扩展字段2")
    private String ext02;

    public void setProjectId(Long projectId)
    {
        this.projectId = projectId;
    }

    public Long getProjectId()
    {
        return projectId;
    }
    public void setProjectName(String projectName)
    {
        this.projectName = projectName;
    }

    public String getProjectName()
    {
        return projectName;
    }
    public void setKeyword(String keyword)
    {
        this.keyword = keyword;
    }

    public String getKeyword()
    {
        return keyword;
    }
    public void setProjectUnitprice(BigDecimal projectUnitprice)
    {
        this.projectUnitprice = projectUnitprice;
    }

    public BigDecimal getProjectUnitprice()
    {
        return projectUnitprice;
    }
    public void setProjectCost(BigDecimal projectCost)
    {
        this.projectCost = projectCost;
    }

    public BigDecimal getProjectCost()
    {
        return projectCost;
    }
    public void setProjectTimes(String projectTimes)
    {
        this.projectTimes = projectTimes;
    }

    public String getProjectTimes()
    {
        return projectTimes;
    }
    public void setProjectType(String projectType)
    {
        this.projectType = projectType;
    }

    public String getProjectType()
    {
        return projectType;
    }
    public void setProjectDeptId(Long projectDeptId)
    {
        this.projectDeptId = projectDeptId;
    }

    public Long getProjectDeptId()
    {
        return projectDeptId;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
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
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("projectId", getProjectId())
                .append("projectName", getProjectName())
                .append("keyword", getKeyword())
                .append("projectUnitprice", getProjectUnitprice())
                .append("projectCost", getProjectCost())
                .append("projectTimes", getProjectTimes())
                .append("projectType", getProjectType())
                .append("projectDeptId", getProjectDeptId())
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