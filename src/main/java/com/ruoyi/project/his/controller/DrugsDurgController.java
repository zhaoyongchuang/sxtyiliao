package com.ruoyi.project.his.controller;

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
import com.ruoyi.project.his.domain.DrugsDurg;
import com.ruoyi.project.his.service.IDrugsDurgService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * durgdurgController
 *
 * @author yc
 * @date 2023-06-18
 */
@RestController
@RequestMapping("/his/durgdurg")
public class DrugsDurgController extends BaseController
{
    @Autowired
    private IDrugsDurgService drugsDurgService;

    /**
     * 查询durgdurg列表
     */
    @PreAuthorize("@ss.hasPermi('his:durgdurg:list')")
    @GetMapping("/list")
    public TableDataInfo list(DrugsDurg drugsDurg)
    {
        startPage();
        List<DrugsDurg> list = drugsDurgService.selectDrugsDurgList(drugsDurg);
        return getDataTable(list);
    }

    /**
     * 导出durgdurg列表
     */
    @PreAuthorize("@ss.hasPermi('his:durgdurg:export')")
    @Log(title = "durgdurg", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(DrugsDurg drugsDurg)
    {
        List<DrugsDurg> list = drugsDurgService.selectDrugsDurgList(drugsDurg);
        ExcelUtil<DrugsDurg> util = new ExcelUtil<DrugsDurg>(DrugsDurg.class);
        return util.exportExcel(list, "durgdurg");
    }

    /**
     * 获取durgdurg详细信息
     */
    @PreAuthorize("@ss.hasPermi('his:durgdurg:query')")
    @GetMapping(value = "/{durgId}")
    public AjaxResult getInfo(@PathVariable("durgId") Long durgId)
    {
        return AjaxResult.success(drugsDurgService.selectDrugsDurgById(durgId));
    }

    /**
     * 新增durgdurg
     */
    @PreAuthorize("@ss.hasPermi('his:durgdurg:add')")
    @Log(title = "durgdurg", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DrugsDurg drugsDurg)
    {
        return toAjax(drugsDurgService.insertDrugsDurg(drugsDurg));
    }

    /**
     * 修改durgdurg
     */
    @PreAuthorize("@ss.hasPermi('his:durgdurg:edit')")
    @Log(title = "durgdurg", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DrugsDurg drugsDurg)
    {
        return toAjax(drugsDurgService.updateDrugsDurg(drugsDurg));
    }

    /**
     * 删除durgdurg
     */
    @PreAuthorize("@ss.hasPermi('his:durgdurg:remove')")
    @Log(title = "durgdurg", businessType = BusinessType.DELETE)
    @DeleteMapping("/{durgIds}")
    public AjaxResult remove(@PathVariable Long[] durgIds)
    {
        return toAjax(drugsDurgService.deleteDrugsDurgByIds(durgIds));
    }
}