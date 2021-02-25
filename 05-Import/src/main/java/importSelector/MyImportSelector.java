package importSelector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName: MyImportSelector
 * @Description: 自定义逻辑返回需要导入的组件
 * @Author ONESTAR
 * @微信：YXK-ONESTAR
 * @URL：https://onestar.newstar.net.cn/
 * @Date: 2021/2/25 15:38
 * @Version 1.0
 */
public class MyImportSelector implements ImportSelector {
    /**
     * @description 获取要导入到容器的组件全类名
     * @author ONESTAR
     * @date 2021/2/25 15:49
     * @param annotationMetadata：当前标注@Import注解类的所有注解信息
     * @throws
     * @return java.lang.String[]
     */
    public String[] selectImports(AnnotationMetadata annotationMetadata) {

        return new String[]{"bean.Person"};
    }
}