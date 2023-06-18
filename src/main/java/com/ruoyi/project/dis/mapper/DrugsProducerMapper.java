package com.ruoyi.project.dis.mapper;

import java.util.List;
import com.ruoyi.project.dis.domain.DrugsProducer;

/**
 * DrugsProducerMapper接口
 *
 * @author zyc
 * @date 2023-06-21
 */
public interface DrugsProducerMapper
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
     * 删除DrugsProducer
     *
     * @param proId DrugsProducerID
     * @return 结果
     */
    public int deleteDrugsProducerById(Long proId);

    /**
     * 批量删除DrugsProducer
     *
     * @param proIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteDrugsProducerByIds(Long[] proIds);
}