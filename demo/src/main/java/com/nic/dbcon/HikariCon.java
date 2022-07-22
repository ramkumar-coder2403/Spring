package com.nic.dbcon;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

//@RunWith(SpringRunner.class)
//@SpringBootTest(
//    properties = "spring.datasource.type=com.zaxxer.hikari.HikariDataSource"
//)
public class HikariCon {

    @Autowired
    private DataSource dataSource;

//    @Test
//    public void hikariConnectionPoolIsConfigured() {
//        assertEquals("com.zaxxer.hikari.HikariDataSource", dataSource.getClass().getName());
//    }
}