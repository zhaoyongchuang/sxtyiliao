package com.ruoyi.project.his.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.project.his.domain.ProjectFee;
import com.ruoyi.project.his.mapper.ProjectFeeMapper;
import com.ruoyi.project.his.service.ProjectFeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectFeeServiceImpl implements ProjectFeeService
{
    @Autowired
    private ProjectFeeMapper projectFeeMapper;

    /**
     * 查询ProjectFee
     *
     * @param projectId ProjectFeeID
     * @return ProjectFee
     */
    @Override
    public ProjectFee selectProjectFeeById(Long projectId)
    {
        return projectFeeMapper.selectProjectFeeById(projectId);
    }

    /**
     * 查询ProjectFee列表
     *
     * @param projectFee ProjectFee
     * @return ProjectFee
     */
    @Override
    public List<ProjectFee> selectProjectFeeList(ProjectFee projectFee)
    {
        return projectFeeMapper.selectProjectFeeList(projectFee);
    }

    /**
     * 新增ProjectFee
     *
     * @param projectFee ProjectFee
     * @return 结果
     */
    @Override
    public int insertProjectFee(ProjectFee projectFee)
    {
        projectFee.setCreateTime(DateUtils.getNowDate());
        return projectFeeMapper.insertProjectFee(projectFee);
    }

    /**
     * 修改ProjectFee
     *
     * @param projectFee ProjectFee
     * @return 结果
     */
    @Override
    public int updateProjectFee(ProjectFee projectFee)
    {
        projectFee.setUpdateTime(DateUtils.getNowDate());
        return projectFeeMapper.updateProjectFee(projectFee);
    }

    /**
     * 批量删除ProjectFee
     *
     * @param projectIds 需要删除的ProjectFeeID
     * @return 结果
     */
    @Override
    public int deleteProjectFeeByIds(Long[] projectIds)
    {
        return projectFeeMapper.deleteProjectFeeByIds(projectIds);
    }

    /**
     * 删除ProjectFee信息
     *
     * @param projectId ProjectFeeID
     * @return 结果
     */
    @Override
    public int deleteProjectFeeById(Long projectId)
    {
        return projectFeeMapper.deleteProjectFeeById(projectId);
    }
}