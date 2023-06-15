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


import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.his.domain.ProjectFee;
import com.ruoyi.project.his.service.ProjectFeeService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;
@RestController
@RequestMapping("/his/projectFee")
public class ProjectFeeController extends BaseController
{
    @Autowired
    private ProjectFeeService projectFeeService;

    /**
     * 查询ProjectFee列表
     */
    @PreAuthorize("@ss.hasPermi('his:projectFee:list')")
    @GetMapping("/list")
    public TableDataInfo list(ProjectFee projectFee)
    {
        startPage();
        List<ProjectFee> list = projectFeeService.selectProjectFeeList(projectFee);
        return getDataTable(list);
    }

    /**
     * 导出ProjectFee列表
     */
    @PreAuthorize("@ss.hasPermi('his:projectFee:export')")
    @Log(title = "ProjectFee", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(ProjectFee projectFee)
    {
        List<ProjectFee> list = projectFeeService.selectProjectFeeList(projectFee);
        ExcelUtil<ProjectFee> util = new ExcelUtil<ProjectFee>(ProjectFee.class);
        return util.exportExcel(list, "fee");
    }

    /**
     * 获取ProjectFee详细信息
     */
    @PreAuthorize("@ss.hasPermi('his:projectFee:query')")
    @GetMapping(value = "/{projectId}")
    public AjaxResult getInfo(@PathVariable("projectId") Long projectId)
    {
        return AjaxResult.success(projectFeeService.selectProjectFeeById(projectId));
    }

    /**
     * 新增ProjectFee
     */
    @PreAuthorize("@ss.hasPermi('his:projectFee:add')")
    @Log(title = "ProjectFee", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ProjectFee projectFee)
    {
        return toAjax(projectFeeService.insertProjectFee(projectFee));
    }

    /**
     * 修改ProjectFee
     */
    @PreAuthorize("@ss.hasPermi('his:projectFee:edit')")
    @Log(title = "ProjectFee", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ProjectFee projectFee)
    {
        return toAjax(projectFeeService.updateProjectFee(projectFee));
    }

    /**
     * 删除ProjectFee
     */
    @PreAuthorize("@ss.hasPermi('his:projectFee:remove')")
    @Log(title = "ProjectFee", businessType = BusinessType.DELETE)
    @DeleteMapping("/{projectIds}")
    public AjaxResult remove(@PathVariable Long[] projectIds)
    {
        return toAjax(projectFeeService.deleteProjectFeeByIds(projectIds));
    }
}
