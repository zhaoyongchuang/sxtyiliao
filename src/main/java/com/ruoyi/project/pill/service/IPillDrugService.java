package com.ruoyi.project.pill.service;



import com.ruoyi.project.dis.domain.DrugsDurg;
import com.ruoyi.project.pill.domain.PillDrug;

import java.util.List;

/**
 * 药品信息Service接口
 * 
 * @author izumi
 * @date 2023-05-13
 */
public interface IPillDrugService
{



    List<PillDrug> selectBySupportId(Integer supportId);
    /**
     * 查询药品信息
     * 
     * @param drugId 药品信息主键
     * @return 药品信息
     */
    public PillDrug selectPillDrugByDrugId(Long drugId);

    /**
     * 查询药品信息列表
     * 
     * @param pillDrug 药品信息
     * @return 药品信息集合
     */
    public List<PillDrug> selectPillDrugList(PillDrug pillDrug);

    /**
     * 新增药品信息
     * 
     * @param pillDrug 药品信息
     * @return 结果
     */
    public int insertPillDrug(PillDrug pillDrug);

    /**
     * 修改药品信息
     * 
     * @param pillDrug 药品信息
     * @return 结果
     */
    public int updatePillDrug(PillDrug pillDrug);

    /**
     * 批量删除药品信息
     * 
     * @param drugIds 需要删除的药品信息主键集合
     * @return 结果
     */
    public int deletePillDrugByDrugIds(Long[] drugIds);

    /**
     * 删除药品信息信息
     * 
     * @param drugId 药品信息主键
     * @return 结果
     */
    public int deletePillDrugByDrugId(Long drugId);
}
