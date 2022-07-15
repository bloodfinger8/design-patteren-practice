package me.awakedev.designpatterns._02_structural_patterns._09_decorate._03_java;

import org.springframework.beans.factory.xml.BeanDefinitionDecorator;
import org.springframework.http.server.reactive.ServerHttpRequestDecorator;
import org.springframework.http.server.reactive.ServerHttpResponseDecorator;
import org.springframework.web.server.WebFilter;

public class DecorateInSpring {
    //빈설정 데코레이터
    BeanDefinitionDecorator beanDefinitionDecorator;

    //web flux Http 요청 / 응답 데코레이터
    ServerHttpRequestDecorator serverHttpRequestDecorator;
    ServerHttpResponseDecorator serverHttpResponseDecorator;
}
