package Controller;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Database {
    static Connection Kon;
    
    public static Connection connection() {
        if (Kon == null) {
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("toko");
            data.setUser("root");
            data.setPassword("");
            try {
                Kon = data.getConnection();
                System.out.println("Sudah Konek");
            } catch (SQLException ex) {
                System.out.println("Tidak Konek");
            }
        }
        return Kon;
    }
}
