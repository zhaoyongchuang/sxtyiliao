package com.ruoyi.project.his.domain;

import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

public class ProjectFee extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @Excel(name = "项目序号", cellType = Excel.ColumnType.NUMERIC)
    private Long projectId;

    @Excel(name = "项目名称")
    private String projectName;

    @Excel(name = "项目编码")
    private String projectCode;

    @Excel(name = "项目类型")
    private String projectType;

    @Excel(name = "项目价格")
    private String projectPrice;

    @Excel(name = "项目单位")
    private String projectUnitprice;

    @Excel(name = "项目状态", readConverterExp = "0=正常,1=停用")
    private String status;

//    keyword

    @Excel(name = "关键字")
    private String keyword;

//    cost
    private String projectCost;

    public ProjectFee(Long projectId) {
        this.projectId = projectId;
    }


    public Long getProjectId() {
        return projectId;
    }



    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getProjectPrice() {
        return projectPrice;
    }

    public void setProjectPrice(String projectPrice) {
        this.projectPrice = projectPrice;
    }

    public String getProjectUnitprice() {
        return projectUnitprice;
    }

    public void setProjectUnitprice(String projectUnitprice) {
        this.projectUnitprice = projectUnitprice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getProjectCost() {
        return projectCost;
    }

    public void setProjectCost(String projectCost) {
        this.projectCost = projectCost;
    }


    @Override
    public String toString() {
        return "ProjectFee{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", keyword='" + keyword + '\'' +
                ", projectUnitprice='" + projectUnitprice + '\'' +
                ", projectCost='" + projectCost + '\'' +
                ", projectCode='" + projectCode + '\'' +
                ", projectType='" + projectType + '\'' +
                ", projectPrice='" + projectPrice + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
