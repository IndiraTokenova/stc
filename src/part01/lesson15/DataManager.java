package part01.lesson15;

import java.sql.Connection;
import java.sql.Statement;

public class DataManager {

    /**
     * -      Таблица USER содержит поля id, name, birthday, login_ID, city, email, description
     *
     * -      Таблица ROLE содержит поля id, name (принимает значения Administration, Clients, Billing), description
     *
     * -      Таблица USER_ROLE содержит поля id, user_id, role_id
     *
     * VARCHAR(255)
     * */

    public void createDataBase() {

        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            Statement st = con.createStatement();
            st.addBatch("CREATE SCHEMA IF NOT EXISTS stc");
            st.addBatch("CREATE TABLE IF NOT EXISTS user (" +
                    "  id INT(11) NOT NULL AUTO_INCREMENT, " +
                    "  name VARCHAR(255) NOT NULL, " +
                    "  cafedraid int(11) NOT NULL, " +
                    "  position int(11) NOT NULL, " +
                    "  rate double DEFAULT '0', " +
                    "  type int(3) NOT NULL, " +
                    "  hourlyFund tinyint(1) NOT NULL DEFAULT '0'," +
                    "  PRIMARY KEY (ID), " +
                    ") ENGINE=InnoDB AUTO_INCREMENT=4263 DEFAULT CHARSET=utf8;\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
