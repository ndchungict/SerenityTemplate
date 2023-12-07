package auto.utilities.database;

import lombok.AllArgsConstructor;
import lombok.Getter;


/**
 * @author chungnd1
 * JDBC drivers information
 */
@Getter
@AllArgsConstructor
public enum DatabaseDriver {
    ORACLE("Oracle", "oracle.jdbc.pool.OracleDataSource"),
    MYSQL("MySQL", "com.mysql.jdbc.Driver"),
    POSTGRESQL("PostgreSQL","org.postgresql.Driver"),
    MONGODB("MongoDB","mongodb.jdbc.MongoDriver"),
    SQLSERVER("SQLServer", "com.microsoft.sqlserver.jdbc.SQLServerDriver");

    private String name;
    private String driver;

}