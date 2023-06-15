package com.ruoyi.project.his.service;

import com.ruoyi.project.his.domain.ProjectFee;

import java.util.List;

public interface ProjectFeeService {
    //查询功能
    List<ProjectFee> selectPojectFeeList(ProjectFee projectFee);

    //添加的操作
    int insertPojectFee(ProjectFee projectFee);

    //修改操作中的查询操作，（回显数据！）
    ProjectFee selectProjectFeeById(Long projectId);

    //修改功能
    int updateProjectFee(ProjectFee projectFee);

    //删除功能
    public int deletePojectFee(Long[] projectIds);






}
