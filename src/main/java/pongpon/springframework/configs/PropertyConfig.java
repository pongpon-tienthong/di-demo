package pongpon.springframework.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import pongpon.springframework.fakes.FakeDataSource;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Value("${pongpon.username}")
    private String username;

    @Value("${pongpon.password}")
    private String password;

    @Value("${pongpon.dburl}")
    private String dbUrl;


    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(this.username);
        fakeDataSource.setPassword(this.password);
        fakeDataSource.setDbUrl(this.dbUrl);

        return fakeDataSource;
    }

//    @Bean
//    public PropertyPlaceholderConfigurer propertyPlaceholderConfigurer() {
//        PropertyPlaceholderConfigurer propertyPlaceholderConfigurer = new PropertyPlaceholderConfigurer();
//        return propertyPlaceholderConfigurer;
//    }
}
