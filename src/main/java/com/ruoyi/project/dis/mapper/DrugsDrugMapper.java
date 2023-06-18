package com.ruoyi.project.dis.mapper;

import com.ruoyi.project.dis.domain.DrugsDurg;

import java.util.List;

public interface DrugsDrugMapper {
    List<DrugsDurg> listDurgdurg(DrugsDurg drugsDurg);

    int addDurgdurg(DrugsDurg drugsDurg);

    int updateDrugsDurg(DrugsDurg drugsDurg);

    int deleteDrugsDurgById(Long durgId);


}
