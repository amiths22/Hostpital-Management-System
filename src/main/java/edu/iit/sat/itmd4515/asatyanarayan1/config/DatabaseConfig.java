/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.iit.sat.itmd4515.asatyanarayan1.config;

import javax.annotation.sql.DataSourceDefinition;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author amith
 */
@ApplicationScoped
@DataSourceDefinition(
        name="java:app/jdbc/itmd4515DS",
        className="com.mysql.cj.jdbc.MysqlDataSource",
        serverName="127.0.0.1",
        portNumber=3306,
        databaseName="itmd4515",
        user="itmd4515",
        password="itmd4515",
        properties={
            "useSSL=false"
        }
)

public class DatabaseConfig {
    
}
