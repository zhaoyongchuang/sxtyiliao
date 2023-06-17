package com.ruoyi.project.his.service;

import java.util.List;
import com.ruoyi.project.his.domain.DrugsDurg;

/**
 * durgdurgService接口
 *
 * @author yc
 * @date 2023-06-18
 */
public interface IDrugsDurgService
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
     * 批量删除durgdurg
     *
     * @param durgIds 需要删除的durgdurgID
     * @return 结果
     */
    public int deleteDrugsDurgByIds(Long[] durgIds);

    /**
     * 删除durgdurg信息
     *
     * @param durgId durgdurgID
     * @return 结果
     */
    public int deleteDrugsDurgById(Long durgId);
}
