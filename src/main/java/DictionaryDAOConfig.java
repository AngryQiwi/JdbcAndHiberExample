import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.naming.NamingException;
import javax.sql.DataSource;

@Configuration
public class DictionaryDAOConfig {
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource("jdbc:postgresql://localhost:5432/postgres", "postgres", "ianeho4u");
        dataSource.setDriverClassName("org.postgresql.Driver");
        return dataSource;
    }
    @Bean
    public JdbcTemplate getJdbcTemplate() throws NamingException{
        return new JdbcTemplate(dataSource());
    }
    @Bean
    public JDBCTemplateDictionaryDAO jdbcTemplateDictionaryDAO() throws NamingException {
        return new JDBCTemplateDictionaryDAO(dataSource());
    }
    @Bean
    public LocalSessionFactoryBean sessionFactory(){
        LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
        localSessionFactoryBean.setConfigLocation(new ClassPathResource("hibernate.cfg.xml"));
        return localSessionFactoryBean;
    }
    @Bean
    public HibernateDictionaryDAO hibernateDictionaryDAO(){
        return new HibernateDictionaryDAO();
    }
}
