package com.ruoyi.project.his.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.project.his.domain.DrugsProducer;
import com.ruoyi.project.his.mapper.DrugsDurgMapper;
import com.ruoyi.project.his.domain.DrugsDurg;
import com.ruoyi.project.his.service.IDrugsDurgService;

/**
 * durgdurgService业务层处理
 *
 * @author yc
 * @date 2023-06-18
 */
@Service
public class DrugsDurgServiceImpl implements IDrugsDurgService
{
    @Autowired
    private DrugsDurgMapper drugsDurgMapper;

    /**
     * 查询durgdurg
     *
     * @param durgId durgdurgID
     * @return durgdurg
     */
    @Override
    public DrugsDurg selectDrugsDurgById(Long durgId)
    {
        return drugsDurgMapper.selectDrugsDurgById(durgId);
    }

    /**
     * 查询durgdurg列表
     *
     * @param drugsDurg durgdurg
     * @return durgdurg
     */
    @Override
    public List<DrugsDurg> selectDrugsDurgList(DrugsDurg drugsDurg)
    {
        return drugsDurgMapper.selectDrugsDurgList(drugsDurg);
    }

    /**
     * 新增durgdurg
     *
     * @param drugsDurg durgdurg
     * @return 结果
     */
    @Transactional
    @Override
    public int insertDrugsDurg(DrugsDurg drugsDurg)
    {
        drugsDurg.setCreateTime(DateUtils.getNowDate());
        int rows = drugsDurgMapper.insertDrugsDurg(drugsDurg);
        insertDrugsProducer(drugsDurg);
        return rows;
    }

    /**
     * 修改durgdurg
     *
     * @param drugsDurg durgdurg
     * @return 结果
     */
    @Transactional
    @Override
    public int updateDrugsDurg(DrugsDurg drugsDurg)
    {
        drugsDurg.setUpdateTime(DateUtils.getNowDate());
        drugsDurgMapper.deleteDrugsProducerByProId(drugsDurg.getDurgId());
        insertDrugsProducer(drugsDurg);
        return drugsDurgMapper.updateDrugsDurg(drugsDurg);
    }

    /**
     * 批量删除durgdurg
     *
     * @param durgIds 需要删除的durgdurgID
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteDrugsDurgByIds(Long[] durgIds)
    {
        drugsDurgMapper.deleteDrugsProducerByProIds(durgIds);
        return drugsDurgMapper.deleteDrugsDurgByIds(durgIds);
    }

    /**
     * 删除durgdurg信息
     *
     * @param durgId durgdurgID
     * @return 结果
     */
    @Override
    public int deleteDrugsDurgById(Long durgId)
    {
        drugsDurgMapper.deleteDrugsProducerByProId(durgId);
        return drugsDurgMapper.deleteDrugsDurgById(durgId);
    }

    /**
     * 新增${subTable.functionName}信息
     *
     * @param drugsDurg durgdurg对象
     */
    public void insertDrugsProducer(DrugsDurg drugsDurg)
    {
        List<DrugsProducer> drugsProducerList = drugsDurg.getDrugsProducerList();
        Long durgId = drugsDurg.getDurgId();
        if (StringUtils.isNotNull(drugsProducerList))
        {
            List<DrugsProducer> list = new ArrayList<DrugsProducer>();
            for (DrugsProducer drugsProducer : drugsProducerList)
            {
                drugsProducer.setProId(durgId);
                list.add(drugsProducer);
            }
            if (list.size() > 0)
            {
                drugsDurgMapper.batchDrugsProducer(list);
            }
        }
    }
}
