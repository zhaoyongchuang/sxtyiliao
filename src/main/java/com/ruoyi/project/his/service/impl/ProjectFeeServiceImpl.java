package com.ruoyi.project.his.service.impl;

import com.ruoyi.project.his.domain.ProjectFee;
import com.ruoyi.project.his.mapper.ProjectFeeMapper;
import com.ruoyi.project.his.service.ProjectFeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectFeeServiceImpl implements ProjectFeeService {

    @Autowired
    private ProjectFeeMapper projectFeeMapper;

    @Override
    public List<ProjectFee>  selectPojectFeeList(ProjectFee projectFee) {
        return projectFeeMapper.selectPojectFeeList(projectFee);
    }



    @Override
    public int insertPojectFee(ProjectFee projectFee) {
        return projectFeeMapper.insertPojectFee(projectFee);
    }


    @Override
    public ProjectFee selectProjectFeeById(Long projectId) {
        return projectFeeMapper.selectProjectFeeById(projectId);
    }

    @Override
    public int updateProjectFee(ProjectFee projectFee) {
        return projectFeeMapper.updateProjectFee(projectFee);
    }

    @Override
    public int deletePojectFee(Long[] projectIds) {
        return projectFeeMapper.deletePojectFee(projectIds);
    }








}