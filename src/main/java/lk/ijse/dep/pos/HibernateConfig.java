package lk.ijse.dep.pos;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.DriverManager;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
@PropertySource("classpath:application.properties")
public class HibernateConfig {

    @Autowired
    private Environment env;

    @Bean
    public static PersistenceExceptionTranslationPostProcessor persistenceExceptionTranslationPostProcessor(){
        return new PersistenceExceptionTranslationPostProcessor();
    }

@Bean
    public LocalSessionFactoryBean sessionFactory(DataSource ds){
    LocalSessionFactoryBean lsfb = new LocalSessionFactoryBean();
    lsfb.setDataSource(ds);
    lsfb.setPackagesToScan("lk.ijse.dep.pos.entity");
    lsfb.setHibernateProperties(hibernateProperties());
    return lsfb;
}

@Bean
    public DataSource dataSource(){
    DriverManagerDataSource ds = new DriverManagerDataSource();
    ds.setDriverClassName(env.getRequiredProperty("hibernate.connection.driver_class"));
    ds.setUsername(env.getRequiredProperty("hibernate.connection.username"));
    ds.setPassword(env.getRequiredProperty("hibernate.connection.password"));
    ds.setUrl(env.getRequiredProperty("hibernate.connection.url"));
    return ds;
    }

    private Properties hibernateProperties(){
        Properties properties = new Properties();
        properties.put("hibernate.dialect",env.getRequiredProperty("hibernate.dialect"));
        properties.put("hibernate.show_sql",env.getRequiredProperty("hibernate.show_sql"));
        properties.put("hibernate.hbm2ddl.auto",env.getRequiredProperty("hibernate.hbm2ddl.auto"));
        properties.put("hibernate.allow_refresh_detached_entity",env.getRequiredProperty("hibernate.allow_refresh_detached_entity"));
        return properties;
    }

@Bean
    public PlatformTransactionManager transactionManager(SessionFactory sf){
    return new HibernateTransactionManager(sf);
    }

}
