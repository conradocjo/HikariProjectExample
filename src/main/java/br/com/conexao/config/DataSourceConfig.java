package br.com.conexao.config;

import br.com.conexao.model.config.PropertiesPoolConnection;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;

@Slf4j
@Configuration
public class DataSourceConfig extends PropertiesPoolConnection {

    private static HikariDataSource dataSource = new HikariDataSource();

    @Bean(name = "customDataSource")
    @ConfigurationProperties("spring.datasource")
    public DataSource customDataSource() throws SQLException {
        dataSource = new HikariDataSource(getHikariConfig());
        return dataSource;
    }

    private HikariConfig getHikariConfig() {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName(getDriver());
        config.setJdbcUrl(getUrl());
        config.setUsername(getUsername());
        config.setPassword(getPassword());
        config.setAutoCommit(getAutoCommit());
        config.setMaximumPoolSize(getMaximumPoolSize());
        return config;
    }


    public void teste() {
        try {
            dataSource.getConnection();
        } catch (Exception e) {
            log.error(e.getMessage());
        } finally {
//            dataSource.close();
        }
    }

}
