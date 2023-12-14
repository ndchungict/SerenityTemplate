package ts;

import auto.utilities.database.DatabaseDriver;
import auto.utilities.database.DatabaseManager;
import lombok.extern.log4j.Log4j2;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.sql.ResultSet;
import java.sql.SQLException;

@Log4j2
@ExtendWith(SerenityJUnit5Extension.class)
public class DatabaseManagerTest {
    @Test
    public void testMySQLDatabase() throws SQLException {
        String dbUrl = "jdbc:mysql://db4free.net:3306/chungnd_mysql_db";
        String dbUser = "chungnd_us";
        String dbPass = "chungnd_pass";

        DatabaseManager databaseManager = new DatabaseManager(dbUrl,dbUser,dbPass, DatabaseDriver.MYSQL);

        String query = "Select * From customer";
        ResultSet resultSet = databaseManager.executeQuery(query);
        while (resultSet.next()){
            log.info("id: "+resultSet.getInt(1));
            log.info("name: "+resultSet.getString(2));
            log.info("address: "+resultSet.getString(3));
            log.info("phone: "+resultSet.getString(4));
            log.info("email: "+resultSet.getString(5));
            log.info("total: "+resultSet.getInt(6));
        }
    }
}
