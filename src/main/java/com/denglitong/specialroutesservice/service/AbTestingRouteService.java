package com.denglitong.specialroutesservice.service;

import com.denglitong.specialroutesservice.exception.NoRouteFound;
import com.denglitong.specialroutesservice.model.AbTestingRouteEntity;
import com.denglitong.specialroutesservice.repository.AbTestingRouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author litong.deng@foxmail.com
 * @date 2021/11/4
 */
@Service
public class AbTestingRouteService {

    private AbTestingRouteRepository abTestingRouteRepository;

    @Autowired
    public void setAbTestingRouteRepository(AbTestingRouteRepository abTestingRouteRepository) {
        this.abTestingRouteRepository = abTestingRouteRepository;
    }

    public AbTestingRouteEntity getRoute(String serviceName) {
        AbTestingRouteEntity route = abTestingRouteRepository.findByServiceName(serviceName);
        if (route == null) {
            throw new NoRouteFound();
        }
        return route;
    }

    public void save(AbTestingRouteEntity route) {
        abTestingRouteRepository.save(route);
    }

    public void update(AbTestingRouteEntity route) {
        abTestingRouteRepository.save(route);
    }

    public void delete(AbTestingRouteEntity route) {
        abTestingRouteRepository.deleteById(route.getServiceName());
    }

    public List<AbTestingRouteEntity> list() {
        return abTestingRouteRepository.findAll();
    }
}
