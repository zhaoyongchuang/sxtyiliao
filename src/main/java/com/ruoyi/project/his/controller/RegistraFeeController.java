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
import com.ruoyi.project.his.domain.RegistraFee;
import com.ruoyi.project.his.service.IRegistraFeeService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * RegistraFeeController
 *
 * @author yc
 * @date 2023-06-17
 */
@RestController
@RequestMapping("/his/RegistraFee")
public class RegistraFeeController extends BaseController
{
    @Autowired
    private IRegistraFeeService registraFeeService;

    /**
     * 查询RegistraFee列表
     */
    @PreAuthorize("@ss.hasPermi('his:RegistraFee:list')")
    @GetMapping("/list")
    public TableDataInfo list(RegistraFee registraFee)
    {
        startPage();
        List<RegistraFee> list = registraFeeService.selectRegistraFeeList(registraFee);
        return getDataTable(list);
    }

    /**
     * 导出RegistraFee列表
     */
    @PreAuthorize("@ss.hasPermi('his:RegistraFee:export')")
    @Log(title = "RegistraFee", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(RegistraFee registraFee)
    {
        List<RegistraFee> list = registraFeeService.selectRegistraFeeList(registraFee);
        ExcelUtil<RegistraFee> util = new ExcelUtil<RegistraFee>(RegistraFee.class);
        return util.exportExcel(list, "RegistraFee");
    }

    /**
     * 获取RegistraFee详细信息
     */
    @PreAuthorize("@ss.hasPermi('his:RegistraFee:query')")
    @GetMapping(value = "/{registraId}")
    public AjaxResult getInfo(@PathVariable("registraId") Long registraId)
    {
        return AjaxResult.success(registraFeeService.selectRegistraFeeById(registraId));
    }

    /**
     * 新增RegistraFee
     */
    @PreAuthorize("@ss.hasPermi('his:RegistraFee:add')")
    @Log(title = "RegistraFee", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RegistraFee registraFee)
    {
        return toAjax(registraFeeService.insertRegistraFee(registraFee));
    }

    /**
     * 修改RegistraFee
     */
    @PreAuthorize("@ss.hasPermi('his:RegistraFee:edit')")
    @Log(title = "RegistraFee", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RegistraFee registraFee)
    {
        return toAjax(registraFeeService.updateRegistraFee(registraFee));
    }

    /**
     * 删除RegistraFee
     */
    @PreAuthorize("@ss.hasPermi('his:RegistraFee:remove')")
    @Log(title = "RegistraFee", businessType = BusinessType.DELETE)
    @DeleteMapping("/{registraIds}")
    public AjaxResult remove(@PathVariable Long[] registraIds)
    {
        return toAjax(registraFeeService.deleteRegistraFeeByIds(registraIds));
    }
}