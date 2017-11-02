package pongpon.springframework.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import pongpon.springframework.fakes.FakeDataSource;
import pongpon.springframework.fakes.JmsFakeDataSource;

@Configuration
//@PropertySource("classpath:datasource.properties")
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

    @Value("${pongpon.username}")
    private String username;

    @Value("${pongpon.password}")
    private String password;

    @Value("${pongpon.dburl}")
    private String dbUrl;

    @Value("${jms.username}")
    private String jmsUsername;

    @Value("${jms.password}")
    private String jmsPassword;

    @Value("${jms.dburl}")
    private String jmsDbUrl;


    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(this.username);
        fakeDataSource.setPassword(this.password);
        fakeDataSource.setDbUrl(this.dbUrl);

        return fakeDataSource;
    }

    @Bean
    public JmsFakeDataSource fakeJmsDataSource() {
        JmsFakeDataSource fakeDataSource = new JmsFakeDataSource();
        fakeDataSource.setUsername(this.jmsUsername);
        fakeDataSource.setPassword(this.jmsPassword);
        fakeDataSource.setDbUrl(this.jmsDbUrl);

        return fakeDataSource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
