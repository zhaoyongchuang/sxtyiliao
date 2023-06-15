package com.ruoyi.project.his.mapper;

import com.ruoyi.project.his.domain.ProjectFee;
import org.omg.CORBA.DynAnyPackage.Invalid;

import java.util.List;

/**
 * 项目收费Mapper接口
 *
 */
public interface ProjectFeeMapper
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
     * 删除ProjectFee
     *
     * @param projectId ProjectFeeID
     * @return 结果
     */
    public int deleteProjectFeeById(Long projectId);

    /**
     * 批量删除ProjectFee
     *
     * @param projectIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteProjectFeeByIds(Long[] projectIds);
}