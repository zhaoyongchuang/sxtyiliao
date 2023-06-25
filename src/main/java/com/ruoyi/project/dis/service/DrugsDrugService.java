package com.ruoyi.project.dis.service;

import com.ruoyi.project.dis.domain.DrugsDurg;

import java.util.List;

public interface DrugsDrugService {
    List<DrugsDurg> selectBySupportId(Integer supportId);
    List<DrugsDurg> listDurgdurg(DrugsDurg drugsDurg);

    int addDurgdurg(DrugsDurg drugsDurg);


    int updateDrugsDurg(DrugsDurg drugsDurg);


    int deleteDrugsDurgById(Long durgId);
}
