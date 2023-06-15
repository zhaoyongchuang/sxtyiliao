package com.ruoyi.project.his.mapper;

import com.ruoyi.project.his.domain.ProjectFee;
import org.omg.CORBA.DynAnyPackage.Invalid;

import java.util.List;

/**
 * 项目收费Mapper接口
 *
 */
public interface ProjectFeeMapper {


    int insertPojectFee(ProjectFee projectFee);

    public int updatePojectFee(ProjectFee projectFee);

    //删除功能
    public int deletePojectFee(Long[] projectIds);

    List<ProjectFee> selectPojectFeeList(ProjectFee projectFee);


    public ProjectFee selectProjectFeeById(Long projectId);

    //修改功能
    public int updateProjectFee(ProjectFee projectFee);


//修改这个问题 Invalid bound statement (not found): com.ruoyi.project.his.mapper.ProjectFeeMapper.selectFeeList





}