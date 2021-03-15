package config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * @ClassName: AppConfig
 * @Description: 配置类,将数据源组件注入进容器
 * @Author ONESTAR
 * @微信：YXK-ONESTAR
 * @URL：https://onestar.newstar.net.cn/
 * @Date: 2021/3/15 16:41
 * @Version 1.0
 */
@Configuration
public class AppConfig {

    // 测试环境
    @Profile("test")
    @Bean("testDataSource")
    public DataSource dataSourceTest() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("806188");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/vhr");
        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
        return dataSource;
    }

    // 开发环境
    @Profile("dev")
    @Bean("devDataSource")
    public DataSource dataSourceDev() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("806188");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/vhr");
        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
        return dataSource;
    }

    // 生产环境
    @Profile("pro")
    @Bean("proDataSource")
    public DataSource dataSourcePro() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("806188");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/vhr");
        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
        return dataSource;
    }
}