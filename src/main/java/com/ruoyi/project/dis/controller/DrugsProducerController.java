package com.ruoyi.project.dis.controller;

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
import com.ruoyi.project.dis.domain.DrugsProducer;
import com.ruoyi.project.dis.service.IDrugsProducerService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * DrugsProducerController
 *
 * @author zyc
 * @date 2023-06-21
 */
@RestController
@RequestMapping("/dis/DrugsProducer")
public class DrugsProducerController extends BaseController
{
    @Autowired
    private IDrugsProducerService drugsProducerService;

    /**
     * 查询DrugsProducer列表
     */
    @PreAuthorize("@ss.hasPermi('dis:DrugsProducer:list')")
    @GetMapping("/list")
    public TableDataInfo list(DrugsProducer drugsProducer)
    {
        startPage();
        List<DrugsProducer> list = drugsProducerService.selectDrugsProducerList(drugsProducer);
        return getDataTable(list);
    }

    /**
     * 导出DrugsProducer列表
     */
    @PreAuthorize("@ss.hasPermi('dis:DrugsProducer:export')")
    @Log(title = "DrugsProducer", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(DrugsProducer drugsProducer)
    {
        List<DrugsProducer> list = drugsProducerService.selectDrugsProducerList(drugsProducer);
        ExcelUtil<DrugsProducer> util = new ExcelUtil<DrugsProducer>(DrugsProducer.class);
        return util.exportExcel(list, "DrugsProducer");
    }

    /**
     * 获取DrugsProducer详细信息
     */
    @PreAuthorize("@ss.hasPermi('dis:DrugsProducer:query')")
    @GetMapping(value = "/{proId}")
    public AjaxResult getInfo(@PathVariable("proId") Long proId)
    {
        return AjaxResult.success(drugsProducerService.selectDrugsProducerById(proId));
    }

    /**
     * 新增DrugsProducer
     */
    @PreAuthorize("@ss.hasPermi('dis:DrugsProducer:add')")
    @Log(title = "DrugsProducer", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DrugsProducer drugsProducer)
    {
        return toAjax(drugsProducerService.insertDrugsProducer(drugsProducer));
    }

    /**
     * 修改DrugsProducer
     */
    @PreAuthorize("@ss.hasPermi('dis:DrugsProducer:edit')")
    @Log(title = "DrugsProducer", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DrugsProducer drugsProducer)
    {
        return toAjax(drugsProducerService.updateDrugsProducer(drugsProducer));
    }

    /**
     * 删除DrugsProducer
     */
    @PreAuthorize("@ss.hasPermi('dis:DrugsProducer:remove')")
    @Log(title = "DrugsProducer", businessType = BusinessType.DELETE)
    @DeleteMapping("/{proIds}")
    public AjaxResult remove(@PathVariable Long[] proIds)
    {
        return toAjax(drugsProducerService.deleteDrugsProducerByIds(proIds));
    }
}