package com.ruoyi.project.pill.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.project.pill.domain.PillFactory;
import com.ruoyi.project.pill.mapper.PillFactoryMapper;
import com.ruoyi.project.pill.service.IPillFactoryService;
import com.ruoyi.project.pill.domain.PillFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 生产厂家信息Service业务层处理
 * 
 * @author izumi
 * @date 2023-05-13
 */
@Service
public class PillFactoryServiceImpl implements IPillFactoryService
{
    @Autowired
    private PillFactoryMapper pillFactoryMapper;

    /**
     * 查询生产厂家信息
     * 
     * @param factoryId 生产厂家信息主键
     * @return 生产厂家信息
     */
    @Override
    public PillFactory selectPillFactoryByFactoryId(Long factoryId)
    {
        return pillFactoryMapper.selectPillFactoryByFactoryId(factoryId);
    }

    /**
     * 查询生产厂家信息列表
     * 
     * @param pillFactory 生产厂家信息
     * @return 生产厂家信息
     */
    @Override
    public List<PillFactory> selectPillFactoryList(PillFactory pillFactory)
    {
        return pillFactoryMapper.selectPillFactoryList(pillFactory);
    }

    /**
     * 新增生产厂家信息
     * 
     * @param pillFactory 生产厂家信息
     * @return 结果
     */
    @Override
    public int insertPillFactory(PillFactory pillFactory)
    {
        pillFactory.setCreateTime(DateUtils.getNowDate());
        return pillFactoryMapper.insertPillFactory(pillFactory);
    }

    /**
     * 修改生产厂家信息
     * 
     * @param pillFactory 生产厂家信息
     * @return 结果
     */
    @Override
    public int updatePillFactory(PillFactory pillFactory)
    {
        pillFactory.setUpdateTime(DateUtils.getNowDate());
        return pillFactoryMapper.updatePillFactory(pillFactory);
    }

    /**
     * 批量删除生产厂家信息
     * 
     * @param factoryIds 需要删除的生产厂家信息主键
     * @return 结果
     */
    @Override
    public int deletePillFactoryByFactoryIds(Long[] factoryIds)
    {
        return pillFactoryMapper.deletePillFactoryByFactoryIds(factoryIds);
    }

    /**
     * 删除生产厂家信息信息
     * 
     * @param factoryId 生产厂家信息主键
     * @return 结果
     */
    @Override
    public int deletePillFactoryByFactoryId(Long factoryId)
    {
        return pillFactoryMapper.deletePillFactoryByFactoryId(factoryId);
    }
}
