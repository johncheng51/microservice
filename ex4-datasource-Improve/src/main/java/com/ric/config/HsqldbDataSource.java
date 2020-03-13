package com.ric.config;

import com.ric.model.DataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
@Configuration
@ConfigurationProperties("hsqldb.datasource")
public class HsqldbDataSource extends DataSource{
    
}
