package com.ruoyi.project.his.mapper;

import com.ruoyi.project.his.domain.HisDept;
import com.ruoyi.project.system.domain.SysPost;

import java.util.List;

/**
 * @author lhp
 * @create 2021-09-08 14:39
 */
public interface HisDeptMapper {

    /**
     * 批量删除科室信息
     *
     * @param deptIds 需要删除的科室ID
     * @return 结果
     */
    public int deleteDeptByIds(Long[] deptIds);

    /**
     * 通过科室ID查询科室信息
     *
     * @param deptId 科室ID
     * @return 角色对象信息
     */
    public HisDept selectDeptById(Long deptId);

    /**
     * 修改科室信息
     *
     * @param dept 科室信息
     * @return 结果
     */
    public int updateDept(HisDept dept);

    /**
     * 新增科室信息
     *
     * @param dept 科室信息
     * @return 结果
     */
    int insertDept(HisDept dept);


    /**
     * 查询科室数据集合
     *
     * @param dept 科室信息
     * @return 科室数据集合
     */
    List<HisDept> selectDeptList(HisDept dept);


}
