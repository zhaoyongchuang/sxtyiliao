package com.ruoyi.project.dis.service.impl;

import com.ruoyi.project.dis.domain.DrugsOrderAndDetail;
import com.ruoyi.project.dis.mapper.DrugsOrderAndDetailMapper;
import com.ruoyi.project.dis.service.DrugsOrderAndDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DrugsOrderAndDetailServiceImpl implements DrugsOrderAndDetailService {
    @Autowired
    private DrugsOrderAndDetailMapper drugsOrderAndDetailMapper;
    @Override
    public List<DrugsOrderAndDetail> selectList(DrugsOrderAndDetail drugsOrderAndDetail) {
        return drugsOrderAndDetailMapper.selectList(drugsOrderAndDetail);
    }
}
