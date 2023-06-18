package com.ruoyi.project.dis.controller;

import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.dis.domain.DrugsDurg;
import com.ruoyi.project.dis.service.DrugsDrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dis/durgdurg")
public class DrugsDrugController extends BaseController {
    @Autowired
    private DrugsDrugService drugsDrugService;

    //    按条件查询
    //    @PreAuthorize("@ss.hasPermi('system:post:list')")
    @GetMapping("/list")
    public TableDataInfo list(DrugsDurg drugsDurg) {
        startPage();
        List<DrugsDurg> list = drugsDrugService.listDurgdurg(drugsDurg);
        System.out.println(list);
        return getDataTable(list);
    }


    @PreAuthorize("@ss.hasPermi('dis:durgdurg:add')")
    public AjaxResult add(@Validated @RequestBody DrugsDurg drugsDurg) {
        drugsDurg.setCreateBy(SecurityUtils.getUsername());
        return toAjax(drugsDrugService.addDurgdurg(drugsDurg));
    }


    // 修改药品
    @PreAuthorize("@ss.hasPermi('dis:durgdurg:edit')")
    @PutMapping
    public AjaxResult edit(@Validated @RequestBody DrugsDurg drugsDurg) {
        drugsDurg.setUpdateBy(SecurityUtils.getUsername());
        return toAjax(drugsDrugService.updateDrugsDurg(drugsDurg));
    }

    @PreAuthorize("@ss.hasPermi('dis:durgdurg:remove')")
    @Log(title = "厂家管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{postIds}")
    public AjaxResult remove(@PathVariable Long postIds) {
        return toAjax(drugsDrugService.deleteDrugsDurgById(postIds));
    }







}
