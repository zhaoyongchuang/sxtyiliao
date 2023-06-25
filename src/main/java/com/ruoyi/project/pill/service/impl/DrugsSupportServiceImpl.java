package com.ruoyi.project.pill.service.impl;

import com.ruoyi.project.pill.domain.DrugsSupport;
import com.ruoyi.project.pill.mapper.DrugsSupportMapper;
import com.ruoyi.project.pill.service.DrugsSupportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugsSupportServiceImpl implements DrugsSupportService {
    @Autowired
    private DrugsSupportMapper drugsSupportMapper;
    @Override
    public List<DrugsSupport> selectAll() {
        return drugsSupportMapper.selectAll();
    }
}
