package com.ruoyi.project.his.service.impl;

import com.ruoyi.project.his.domain.HisDept;
import com.ruoyi.project.his.mapper.HisDeptMapper;
import com.ruoyi.project.his.service.IHisDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lhp
 * @create 2021-09-08 14:48
 */
@Service
public class HisDeptServiceImpl implements IHisDeptService {

    @Autowired
    private HisDeptMapper hisDeptMapper;

    @Override
    public int deleteDeptByIds(Long[] deptIds) {
        return hisDeptMapper.deleteDeptByIds(deptIds);
    }

    @Override
    public HisDept selectDeptById(Long deptId) {
        return hisDeptMapper.selectDeptById(deptId);
    }

    @Override
    public int insertDept(HisDept dept) {
        return hisDeptMapper.insertDept(dept);
    }

    @Override
    public List<HisDept> selectDeptList(HisDept dept) {
        return hisDeptMapper.selectDeptList(dept);
    }

    @Override
    public int updateDept(HisDept dept) {
        return hisDeptMapper.updateDept(dept);
    }
}
