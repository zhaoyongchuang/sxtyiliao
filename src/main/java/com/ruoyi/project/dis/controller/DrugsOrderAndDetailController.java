package com.ruoyi.project.dis.controller;

import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.dis.domain.DrugsOrderAndDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.project.dis.service.DrugsOrderAndDetailService;

@RestController
@RequestMapping("/dis/order")
public class DrugsOrderAndDetailController extends BaseController {
    @Autowired
    private DrugsOrderAndDetailService DrugsOrderAndDetailService;
    @GetMapping("/list")
    @PreAuthorize("@ss.hasPermi('dis:order:list')")
    public TableDataInfo ListDrugsOrderAndDetail(DrugsOrderAndDetail drugsOrderAndDetail) {
        startPage();
        return getDataTable(DrugsOrderAndDetailService.selectList(drugsOrderAndDetail));
    }

}
