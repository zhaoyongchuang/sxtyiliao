package com.ruoyi.project.dis.service;

import java.util.List;
import com.ruoyi.project.dis.domain.DrugsProducer;

/**
 * DrugsProducerService接口
 *
 * @author zyc
 * @date 2023-06-21
 */
public interface IDrugsProducerService
{
    /**
     * 查询DrugsProducer
     *
     * @param proId DrugsProducerID
     * @return DrugsProducer
     */
    public DrugsProducer selectDrugsProducerById(Long proId);

    /**
     * 查询DrugsProducer列表
     *
     * @param drugsProducer DrugsProducer
     * @return DrugsProducer集合
     */
    public List<DrugsProducer> selectDrugsProducerList(DrugsProducer drugsProducer);

    /**
     * 新增DrugsProducer
     *
     * @param drugsProducer DrugsProducer
     * @return 结果
     */
    public int insertDrugsProducer(DrugsProducer drugsProducer);

    /**
     * 修改DrugsProducer
     *
     * @param drugsProducer DrugsProducer
     * @return 结果
     */
    public int updateDrugsProducer(DrugsProducer drugsProducer);

    /**
     * 批量删除DrugsProducer
     *
     * @param proIds 需要删除的DrugsProducerID
     * @return 结果
     */
    public int deleteDrugsProducerByIds(Long[] proIds);

    /**
     * 删除DrugsProducer信息
     *
     * @param proId DrugsProducerID
     * @return 结果
     */
    public int deleteDrugsProducerById(Long proId);
}