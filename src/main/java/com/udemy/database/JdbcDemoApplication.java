package com.udemy.database;

import com.udemy.database.jdbc.PersonJdbcDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcDemoApplication implements CommandLineRunner {

    @Autowired
    PersonJdbcDAO personJdbcDAO;
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {
        SpringApplication.run(JdbcDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        personJdbcDAO.findAll();
        logger.info("All users {}", personJdbcDAO.findAll());
    }
}
