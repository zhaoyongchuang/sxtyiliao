package com.ruoyi.project.pill.controller;

import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.project.pill.service.DrugsSupportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pill/support")
public class DrugsSupportController {
    @Autowired
    private DrugsSupportService drugsSupportService;
    @GetMapping("/all")
//    @PreAuthorize("@ss.hasPermission('dis:support:all')")
    public AjaxResult getAll(){
        return AjaxResult.success(drugsSupportService.selectAll());
    }

}
