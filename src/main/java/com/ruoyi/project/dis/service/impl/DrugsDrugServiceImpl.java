package com.ruoyi.project.dis.service.impl;

import com.ruoyi.project.dis.domain.DrugsDurg;
import com.ruoyi.project.dis.mapper.DrugsDrugMapper;
import com.ruoyi.project.dis.service.DrugsDrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DrugsDrugServiceImpl implements DrugsDrugService {

    @Autowired
    private DrugsDrugMapper drugsDrugMapper;

    @Override
    public List<DrugsDurg> selectBySupportId(Integer supportId) {
        return drugsDrugMapper.selectBySupportId(supportId);
    }

    @Override
    public List<DrugsDurg> listDurgdurg(DrugsDurg drugsDurg) {
        return drugsDrugMapper.listDurgdurg(drugsDurg);
    }


    @Override
    public int addDurgdurg(DrugsDurg drugsDurg) {
        return drugsDrugMapper.addDurgdurg(drugsDurg);
    }

    @Override
    public int updateDrugsDurg(DrugsDurg drugsDurg) {
        return drugsDrugMapper.updateDrugsDurg(drugsDurg);
    }

    @Override
    public int deleteDrugsDurgById(Long durgId) {
        return drugsDrugMapper.deleteDrugsDurgById(durgId);
    }


}
