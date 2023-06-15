package com.ruoyi.project.his.controller;

import com.ruoyi.common.constant.UserConstants;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.his.domain.HisDept;
import com.ruoyi.project.his.service.IHisDeptService;
import com.ruoyi.project.his.service.impl.HisDeptServiceImpl;
import com.ruoyi.project.system.domain.SysPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lhp
 * @create 2021-09-08 14:48
 */
@RestController
@RequestMapping("/his/dept")
public class HisDeptController extends BaseController {

    @Autowired
    private IHisDeptService hisDeptService;

    @Log(title = "科室管理", businessType = BusinessType.EXPORT)
    @PreAuthorize("@ss.hasPermi('his:dept:export')")
    @GetMapping("/export")
    public AjaxResult export(HisDept dept)
    {
        List<HisDept> list = hisDeptService.selectDeptList(dept);

        ExcelUtil<HisDept> util = new ExcelUtil<HisDept>(HisDept.class);
        return util.exportExcel(list, "科室数据");
    }


    /**
     * 删除科室
     */
    @PreAuthorize("@ss.hasPermi('his:dept:remove')")
    @Log(title = "科室管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{deptIds}")
    public AjaxResult remove(@PathVariable Long[] deptIds) {
        return toAjax(hisDeptService.deleteDeptByIds(deptIds));
    }

    /**
     * 修改科室
     */
    @PreAuthorize("@ss.hasPermi('his:dept:edit')")
    @Log(title = "科室管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@Validated @RequestBody HisDept dept) {

        dept.setUpdateBy(SecurityUtils.getUsername());
        return toAjax(hisDeptService.updateDept(dept));
    }


    /**
     * 根据科室编号获取详细信息
     */
    @PreAuthorize("@ss.hasPermi('his:dept:query')")
    @GetMapping(value = "/{deptId}")
    public AjaxResult getInfo(@PathVariable Long deptId) {
        return AjaxResult.success(hisDeptService.selectDeptById(deptId));
    }


    /**
     * 新增科室
     */
    @PreAuthorize("@ss.hasPermi('his:dept:add')")
    @Log(title = "科室管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@Validated @RequestBody HisDept dept) {
        dept.setCreateBy(SecurityUtils.getUsername());
        return toAjax(hisDeptService.insertDept(dept));
    }

    /**
     * 获取岗位列表
     */
    @PreAuthorize("@ss.hasPermi('his:dept:list')")
    @GetMapping("/list")
    public TableDataInfo list(HisDept dept) {
        startPage();
        List<HisDept> list = hisDeptService.selectDeptList(dept);
        return getDataTable(list);
    }

    /**
     * 获取科室选择框列表
     */
    @GetMapping("/optionselect")
public AjaxResult optionselect()
    {
        List<HisDept> depts = hisDeptService.selectDeptList(new HisDept());
        return AjaxResult.success(depts);
    }


}
