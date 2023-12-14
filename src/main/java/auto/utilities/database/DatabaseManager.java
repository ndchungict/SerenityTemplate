package auto.utilities.database;

import lombok.extern.log4j.Log4j2;

import java.sql.*;

@Log4j2
public class DatabaseManager {
    String dbUrl;
    String dbUser;
    String dbPass;
    DatabaseDriver databaseDriver;
    Connection connection = null;
    Statement statement = null;

    public DatabaseManager(String dbUrl, String dbUser, String dbPass, DatabaseDriver databaseDriver){
        this.dbUrl = dbUrl;
        this.dbUser = dbUser;
        this.dbPass = dbPass;
        this.databaseDriver = databaseDriver;
        createConnection();
        createStatement();
    }


    public void createConnection(){
        log.info("Database Url: "+dbUrl);
        try {
            Class.forName(databaseDriver.getDriver());
            this.connection = DriverManager.getConnection(dbUrl,dbUser,dbPass);
            log.info("Connect successfully!");
        } catch (ClassNotFoundException e) {
            log.info(databaseDriver.getName() + " Database Driver Class Not Found!");
            throw new RuntimeException(e);
        }catch (SQLException e) {
            log.info("Connect failure!");
            throw new RuntimeException(e);
        }
    }

    public void createStatement(){
        try {
            this.statement = this.connection.createStatement();
        } catch (SQLException e) {
            log.info("Create Statement Fail!");
            throw new RuntimeException(e);
        }
    }

    public void executeUpdate(String query) {
        log.info("Update Query: "+query);
        try {
            int rs = this.statement.executeUpdate(query);
            if(rs>0){
                log.info("Updated successfully!");
            }else {
                log.info("Updated Fail!");
            }
        } catch (SQLException e) {
            log.info("Execute Query Fail!");
            throw new RuntimeException(e);
        }
    }

    public ResultSet executeQuery(String query) {
        log.info("Query: "+query);
        ResultSet rs;
        try {
            rs = this.statement.executeQuery(query);
        } catch (SQLException e) {
            log.info("Execute Query Fail!");
            throw new RuntimeException(e);
        }
        return rs;
    }
}
