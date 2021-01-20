package com.onestar.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @ClassName: MyTypeFilter
 * @Description: 自定义过滤规则，实现TypeFilter实现类
 * @Author ONESTAR
 * @Date: 2021/1/20 14:28
 * @微信：YXK-ONESTAR
 * @URL：https://onestar.newstar.net.cn/
 * @Version 1.0
 */
public class MyTypeFilter implements TypeFilter {
    /**
     * @description TODO
     * @author ONESTAR
     * @date 2021/1/20 14:29
     * @param metadataReader:读取到当前正在扫描的类的信息
     * @param metadataReaderFactory：可以获取到其他任何类的信息
     * @throws
     * @return boolean
     */
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        // 获取当前类注解的信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        // 获取当前正在扫描的类的信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        // 获取当前类资源
        Resource resource = metadataReader.getResource();
        String className = classMetadata.getClassName();
        // 指定包含“serv”的组件进行扫描
        if(className.contains("serv")){
            return true;
        }
        return false;
    }
}
