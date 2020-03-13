package com.ric.controller;

import com.ric.config.*;
import com.ric.model.DataSource;
import com.ric.util.BeanCopy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DataSourceController {
    @Autowired
    protected H2DataSource h2DataSource;
    @Autowired
    protected HsqldbDataSource hsqldbDataSource;
    @Autowired
    protected MysqlDataSource mysqlDataSource;


    @RequestMapping(value = "h2DataSource", method = RequestMethod.GET)
    public DataSource readH2DataSource() {
        return (DataSource) BeanCopy.copy(h2DataSource, DataSource.class);
    }

    @RequestMapping(value = "h2DataSource", method = RequestMethod.POST)
    public DataSource loadH2DataSource(@RequestBody DataSource dataSouce) {
        BeanCopy.copy(dataSouce, h2DataSource);
        return (DataSource) BeanCopy.copy(h2DataSource, DataSource.class);
    }

    @RequestMapping(value = "hsqldbDataSource", method = RequestMethod.GET)
    public DataSource readHsqldbDataSource() {
        return (DataSource) BeanCopy.copy(hsqldbDataSource, DataSource.class);
    }

    @RequestMapping(value = "hsqldbDataSource", method = RequestMethod.POST)
    public DataSource loadHsqldbDataSource(@RequestBody DataSource dataSouce) {
        BeanCopy.copy(dataSouce, hsqldbDataSource);
        return (DataSource) BeanCopy.copy(hsqldbDataSource, DataSource.class);
    }

    @RequestMapping(value = "mysqlDataSource", method = RequestMethod.GET)
    public DataSource readMysqlDataSource() {
        return (DataSource) BeanCopy.copy(mysqlDataSource, DataSource.class);
    }

    @RequestMapping(value = "mysqlDataSource", method = RequestMethod.POST)
    public DataSource loadMysqlDataSource(@RequestBody DataSource dataSouce) {
        BeanCopy.copy(dataSouce, mysqlDataSource);
        return (DataSource) BeanCopy.copy(mysqlDataSource, DataSource.class);

    }


}
