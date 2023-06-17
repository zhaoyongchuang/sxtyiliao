package com.ruoyi.project.his.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.his.mapper.RegistraFeeMapper;
import com.ruoyi.project.his.domain.RegistraFee;
import com.ruoyi.project.his.service.IRegistraFeeService;

/**
 * RegistraFeeService业务层处理
 *
 * @author yc
 * @date 2023-06-17
 */
@Service
public class RegistraFeeServiceImpl implements IRegistraFeeService
{
    @Autowired
    private RegistraFeeMapper registraFeeMapper;

    /**
     * 查询RegistraFee
     *
     * @param registraId RegistraFeeID
     * @return RegistraFee
     */
    @Override
    public RegistraFee selectRegistraFeeById(Long registraId)
    {
        return registraFeeMapper.selectRegistraFeeById(registraId);
    }

    /**
     * 查询RegistraFee列表
     *
     * @param registraFee RegistraFee
     * @return RegistraFee
     */
    @Override
    public List<RegistraFee> selectRegistraFeeList(RegistraFee registraFee)
    {
        return registraFeeMapper.selectRegistraFeeList(registraFee);
    }

    /**
     * 新增RegistraFee
     *
     * @param registraFee RegistraFee
     * @return 结果
     */
    @Override
    public int insertRegistraFee(RegistraFee registraFee)
    {
        registraFee.setCreateTime(DateUtils.getNowDate());
        return registraFeeMapper.insertRegistraFee(registraFee);
    }

    /**
     * 修改RegistraFee
     *
     * @param registraFee RegistraFee
     * @return 结果
     */
    @Override
    public int updateRegistraFee(RegistraFee registraFee)
    {
        registraFee.setUpdateTime(DateUtils.getNowDate());
        return registraFeeMapper.updateRegistraFee(registraFee);
    }

    /**
     * 批量删除RegistraFee
     *
     * @param registraIds 需要删除的RegistraFeeID
     * @return 结果
     */
    @Override
    public int deleteRegistraFeeByIds(Long[] registraIds)
    {
        return registraFeeMapper.deleteRegistraFeeByIds(registraIds);
    }

    /**
     * 删除RegistraFee信息
     *
     * @param registraId RegistraFeeID
     * @return 结果
     */
    @Override
    public int deleteRegistraFeeById(Long registraId)
    {
        return registraFeeMapper.deleteRegistraFeeById(registraId);
    }
}
