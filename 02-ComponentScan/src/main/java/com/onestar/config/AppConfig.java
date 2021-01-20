package com.onestar.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.core.type.filter.TypeFilter;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @ClassName: AppConfig
 * @Description: TODO
 * @Author ONESTAR
 * @Date: 2021/1/20 9:44
 * @QQ群：530311074
 * @URL：https://onestar.newstar.net.cn/
 * @Version 1.0
 */
@Configuration
// 指定不被扫描的包
// @ComponentScan(value = "com.onestar",excludeFilters = {@Filter(type = FilterType.ANNOTATION,classes = {Controller.class, Service.class})})
// 指定被扫描的包
// @ComponentScan(value = "com.onestar",includeFilters = {@Filter(type = FilterType.ANNOTATION,classes = {Controller.class, Service.class})},useDefaultFilters = false)
// 自定义扫描规则
@ComponentScan(value = "com.onestar",includeFilters = {@Filter(type = FilterType.CUSTOM,classes = {MyTypeFilter.class})},useDefaultFilters = false)
public class AppConfig {
}
