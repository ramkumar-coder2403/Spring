package com.nic.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nic.dbcon.MyDataSource;
import com.nic.model.TestModel;

import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

@Repository
public class TestDao {
	
//	@Autowired
    
    private DataSource dataSource=MyDataSource.getDataSource();
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
	
    public List<TestModel> findAll() {

        List<TestModel> result = jdbcTemplate.query(
                "SELECT id, name, email, created_date FROM srouser.zstudents",
                (rs, rowNum) -> new TestModel(rs.getInt("id"),
                        rs.getString("name"), rs.getString("email"), rs.getDate("created_date"))
        );

        return result;

    }

	

	// Add new customer
    public void addCustomer(String name, String email) {

        jdbcTemplate.update("INSERT INTO zstudents(name, email, created_date) VALUES (?,?,?)",
                name, email, new Date());

    }
    

}
