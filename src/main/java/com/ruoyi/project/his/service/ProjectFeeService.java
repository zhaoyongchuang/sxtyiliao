package com.ruoyi.project.his.service;

import com.ruoyi.project.his.domain.ProjectFee;

import java.util.List;

public interface ProjectFeeService
{
    /**
     * 查询ProjectFee
     *
     * @param projectId ProjectFeeID
     * @return ProjectFee
     */
    public ProjectFee selectProjectFeeById(Long projectId);

    /**
     * 查询ProjectFee列表
     *
     * @param projectFee ProjectFee
     * @return ProjectFee集合
     */
    public List<ProjectFee> selectProjectFeeList(ProjectFee projectFee);

    /**
     * 新增ProjectFee
     *
     * @param projectFee ProjectFee
     * @return 结果
     */
    public int insertProjectFee(ProjectFee projectFee);

    /**
     * 修改ProjectFee
     *
     * @param projectFee ProjectFee
     * @return 结果
     */
    public int updateProjectFee(ProjectFee projectFee);

    /**
     * 批量删除ProjectFee
     *
     * @param projectIds 需要删除的ProjectFeeID
     * @return 结果
     */
    public int deleteProjectFeeByIds(Long[] projectIds);

    /**
     * 删除ProjectFee信息
     *
     * @param projectId ProjectFeeID
     * @return 结果
     */
    public int deleteProjectFeeById(Long projectId);
}
