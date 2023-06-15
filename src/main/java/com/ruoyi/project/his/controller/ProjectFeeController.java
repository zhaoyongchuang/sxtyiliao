package com.ruoyi.project.his.controller;

import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.his.domain.HisDept;
import com.ruoyi.project.his.domain.ProjectFee;
import com.ruoyi.project.his.service.IHisDeptService;
import com.ruoyi.project.his.service.ProjectFeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/his/projectFee")
public class ProjectFeeController extends BaseController {
    @Autowired
    private ProjectFeeService projectFeeService;
    /*
     * 查询全部的操作
     * */

    @PreAuthorize("@ss.hasPermi('his:projectFee:list')")
    @GetMapping("/list")
    public TableDataInfo list(ProjectFee projectFee) {
        startPage();
        List<ProjectFee> list = projectFeeService.selectPojectFeeList(projectFee);
        return getDataTable(list);
    }


    /*
     * 添加的操作
     * */
    @PreAuthorize("@ss.hasPermi('his:projectFee:add')")
    @PostMapping
    public AjaxResult add(@Validated @RequestBody ProjectFee projectFee)
    {
        projectFee.setCreateBy(SecurityUtils.getUsername());  //获得当前认证用户的名称 保存到对应的实体类中
        return toAjax(projectFeeService.insertPojectFee(projectFee));
    }

    /**
     * 修改
     */
    @PreAuthorize("@ss.hasPermi('his:projectFee:edit')")
    @PutMapping
    public AjaxResult edit(@Validated @RequestBody ProjectFee projectFee)
    {

        projectFee.setUpdateBy(SecurityUtils.getUsername());
        projectFee.setUpdateTime(new Date());
        return toAjax(projectFeeService.updateProjectFee(projectFee));
    }


    /*
     * 删除的操作
     * */
    @PreAuthorize("@ss.hasPermi('his:projectFee:remove')")
    @Log(title = "费用查询设置", businessType = BusinessType.DELETE)    //记录日志的
    @DeleteMapping("/{projectIds}")
    //AjaxResult底层都是封装好的报文不同的操作使用的不同的报文来进行
    public AjaxResult remove(@PathVariable Long[] projectIds) {  //PathVariable表示使用rush风格传输
        return toAjax(projectFeeService.deletePojectFee(projectIds));
    }


    /*
     * 导出的操作
     * */
    @PreAuthorize("@ss.hasPermi('his:projectFee:export')")
    @Log(title = "项目管理", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(ProjectFee projectFee)
    {
        List<ProjectFee> list = projectFeeService.selectPojectFeeList(projectFee);
        ExcelUtil<ProjectFee> util = new ExcelUtil<ProjectFee>(ProjectFee.class);
        return util.exportExcel(list, "项目数据");
    }


    /*
     * 查询单个的操作
     * */
    @PreAuthorize("@ss.hasPermi('his:projectFee:query')")
    @GetMapping(value = "/{projectId}")
    public AjaxResult getInfo(@PathVariable Long projectId)
    {
        return AjaxResult.success(projectFeeService.selectProjectFeeById(projectId));
    }










}
