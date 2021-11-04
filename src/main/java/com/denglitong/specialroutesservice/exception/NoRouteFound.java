package com.denglitong.specialroutesservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author litong.deng@foxmail.com
 * @date 2021/11/4
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NoRouteFound extends RuntimeException {
}
