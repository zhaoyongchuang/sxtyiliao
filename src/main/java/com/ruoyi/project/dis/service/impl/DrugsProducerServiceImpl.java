package com.ruoyi.project.dis.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.dis.mapper.DrugsProducerMapper;
import com.ruoyi.project.dis.domain.DrugsProducer;
import com.ruoyi.project.dis.service.IDrugsProducerService;

/**
 * DrugsProducerService业务层处理
 *
 * @author zyc
 * @date 2023-06-21
 */
@Service
public class DrugsProducerServiceImpl implements IDrugsProducerService
{
    @Autowired
    private DrugsProducerMapper drugsProducerMapper;

    /**
     * 查询DrugsProducer
     *
     * @param proId DrugsProducerID
     * @return DrugsProducer
     */
    @Override
    public DrugsProducer selectDrugsProducerById(Long proId)
    {
        return drugsProducerMapper.selectDrugsProducerById(proId);
    }

    /**
     * 查询DrugsProducer列表
     *
     * @param drugsProducer DrugsProducer
     * @return DrugsProducer
     */
    @Override
    public List<DrugsProducer> selectDrugsProducerList(DrugsProducer drugsProducer)
    {
        return drugsProducerMapper.selectDrugsProducerList(drugsProducer);
    }

    /**
     * 新增DrugsProducer
     *
     * @param drugsProducer DrugsProducer
     * @return 结果
     */
    @Override
    public int insertDrugsProducer(DrugsProducer drugsProducer)
    {
        drugsProducer.setCreateTime(DateUtils.getNowDate());
        return drugsProducerMapper.insertDrugsProducer(drugsProducer);
    }

    /**
     * 修改DrugsProducer
     *
     * @param drugsProducer DrugsProducer
     * @return 结果
     */
    @Override
    public int updateDrugsProducer(DrugsProducer drugsProducer)
    {
        drugsProducer.setUpdateTime(DateUtils.getNowDate());
        return drugsProducerMapper.updateDrugsProducer(drugsProducer);
    }

    /**
     * 批量删除DrugsProducer
     *
     * @param proIds 需要删除的DrugsProducerID
     * @return 结果
     */
    @Override
    public int deleteDrugsProducerByIds(Long[] proIds)
    {
        return drugsProducerMapper.deleteDrugsProducerByIds(proIds);
    }

    /**
     * 删除DrugsProducer信息
     *
     * @param proId DrugsProducerID
     * @return 结果
     */
    @Override
    public int deleteDrugsProducerById(Long proId)
    {
        return drugsProducerMapper.deleteDrugsProducerById(proId);
    }
}