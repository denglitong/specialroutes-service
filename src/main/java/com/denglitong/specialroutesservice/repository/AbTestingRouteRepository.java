package com.denglitong.specialroutesservice.repository;

import com.denglitong.specialroutesservice.model.AbTestingRouteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author litong.deng@foxmail.com
 * @date 2021/11/4
 */
public interface AbTestingRouteRepository extends JpaRepository<AbTestingRouteEntity, String> {

    AbTestingRouteEntity findByServiceName(String serviceName);
}
