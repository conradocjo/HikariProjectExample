package br.com.conexao.model.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;

@Getter
public class PropertiesPoolConnection {

    @Value(value = "${hikari.datasource.jdbc.url}")
    private String url;

    @Value(value = "${hikari.datasource.username}")
    private String username;

    @Value(value = "${hikari.datasource.password}")
    private String password;

    @Value(value = "${hikari.datasource.driver}")
    private String driver;

    @Value(value = "${hikari.datasource.connection-timeout}")
    private String connectionTimeOut;

    @Value(value = "${hikari.datasource.minimum-idle}")
    private String minimumIdle;

    @Value(value = "${hikari.datasource.maximum-pool-size}")
    private Integer maximumPoolSize;

    @Value(value = "${hikari.datasource.idle-timeout}")
    private Integer maximumIdleTimeForConnection;

    @Value(value = "${hikari.datasource.max-lifetime}")
    private String maxLifeTime;

    @Value(value = "${hikari.datasource.auto-commit}")
    private Boolean autoCommit;

}
