package com.ruoyi.project.his.service;

import com.ruoyi.project.his.domain.HisDept;
import com.ruoyi.project.system.domain.SysPost;

import java.util.List;

/**
 * @author lhp
 * @create 2021-09-08 14:46
 */
public interface IHisDeptService {

    /**
     * 批量删除科室信息
     *
     * @param deptIds 需要删除的科室ID
     * @return 结果
     * @throws Exception 异常
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
     * 新增保存科室信息
     *
     * @param dept 科室信息
     * @return 结果
     */
    public int insertDept(HisDept dept);

    /**
     * 查询科室信息集合
     *
     * @param dept 科室信息
     * @return 科室列表
     */
    public List<HisDept> selectDeptList(HisDept dept);

    /**
     * 修改保存科室信息
     *
     * @param dept 科室信息
     * @return 结果
     */
    public int updateDept(HisDept dept);

//    String selectHisDeptList(HisDept hisDept);
}
