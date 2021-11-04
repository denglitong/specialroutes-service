package com.denglitong.specialroutesservice.controller;

import com.denglitong.specialroutesservice.model.AbTestingRouteEntity;
import com.denglitong.specialroutesservice.service.AbTestingRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author litong.deng@foxmail.com
 * @date 2021/11/4
 */
@RestController
@RequestMapping(value = "/v1/route")
public class SpecialRoutesController {

    AbTestingRouteService routeService;

    @Autowired
    public void setRouteService(AbTestingRouteService routeService) {
        this.routeService = routeService;
    }

    @GetMapping("/abtesting/{serviceName}")
    public AbTestingRouteEntity get(@PathVariable("serviceName") String serviceName) {
        return routeService.getRoute(serviceName);
    }

    @GetMapping("/list")
    public List<AbTestingRouteEntity> list() {
        return routeService.list();
    }
}
