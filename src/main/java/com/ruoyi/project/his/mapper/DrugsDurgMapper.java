package com.ruoyi.project.his.mapper;

import java.util.List;
import com.ruoyi.project.his.domain.DrugsDurg;
import com.ruoyi.project.his.domain.DrugsProducer;

/**
 * durgdurgMapper接口
 *
 * @author yc
 * @date 2023-06-18
 */
public interface DrugsDurgMapper
{
    /**
     * 查询durgdurg
     *
     * @param durgId durgdurgID
     * @return durgdurg
     */
    public DrugsDurg selectDrugsDurgById(Long durgId);

    /**
     * 查询durgdurg列表
     *
     * @param drugsDurg durgdurg
     * @return durgdurg集合
     */
    public List<DrugsDurg> selectDrugsDurgList(DrugsDurg drugsDurg);

    /**
     * 新增durgdurg
     *
     * @param drugsDurg durgdurg
     * @return 结果
     */
    public int insertDrugsDurg(DrugsDurg drugsDurg);

    /**
     * 修改durgdurg
     *
     * @param drugsDurg durgdurg
     * @return 结果
     */
    public int updateDrugsDurg(DrugsDurg drugsDurg);

    /**
     * 删除durgdurg
     *
     * @param durgId durgdurgID
     * @return 结果
     */
    public int deleteDrugsDurgById(Long durgId);

    /**
     * 批量删除durgdurg
     *
     * @param durgIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteDrugsDurgByIds(Long[] durgIds);

    /**
     * 批量删除${subTable.functionName}
     *
     * @param durgIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteDrugsProducerByProIds(Long[] durgIds);

    /**
     * 批量新增${subTable.functionName}
     *
     * @param drugsProducerList ${subTable.functionName}列表
     * @return 结果
     */
    public int batchDrugsProducer(List<DrugsProducer> drugsProducerList);


    /**
     * 通过durgdurgID删除${subTable.functionName}信息
     *
     * @param durgId 角色ID
     * @return 结果
     */
    public int deleteDrugsProducerByProId(Long durgId);

    List<DrugsDurg> selectDrugsDurgListByProId(Long proId,String durgName,String durgType,String durgCode ,String durgDosage,String durgStatu );
}
