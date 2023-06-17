package com.ruoyi.project.his.mapper;

import java.util.List;
import com.ruoyi.project.his.domain.RegistraFee;

/**
 * RegistraFeeMapper接口
 *
 * @author yc
 * @date 2023-06-17
 */
public interface RegistraFeeMapper
{
    /**
     * 查询RegistraFee
     *
     * @param registraId RegistraFeeID
     * @return RegistraFee
     */
    public RegistraFee selectRegistraFeeById(Long registraId);

    /**
     * 查询RegistraFee列表
     *
     * @param registraFee RegistraFee
     * @return RegistraFee集合
     */
    public List<RegistraFee> selectRegistraFeeList(RegistraFee registraFee);

    /**
     * 新增RegistraFee
     *
     * @param registraFee RegistraFee
     * @return 结果
     */
    public int insertRegistraFee(RegistraFee registraFee);

    /**
     * 修改RegistraFee
     *
     * @param registraFee RegistraFee
     * @return 结果
     */
    public int updateRegistraFee(RegistraFee registraFee);

    /**
     * 删除RegistraFee
     *
     * @param registraId RegistraFeeID
     * @return 结果
     */
    public int deleteRegistraFeeById(Long registraId);

    /**
     * 批量删除RegistraFee
     *
     * @param registraIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteRegistraFeeByIds(Long[] registraIds);
}