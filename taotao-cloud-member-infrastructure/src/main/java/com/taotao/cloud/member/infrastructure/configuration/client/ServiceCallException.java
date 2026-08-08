package com.taotao.cloud.member.infrastructure.configuration.client;

public class ServiceCallException extends RuntimeException {
    public ServiceCallException(String message) {
        super(message);
    }
}
