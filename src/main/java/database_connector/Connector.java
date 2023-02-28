package database_connector;

import com.example.JavaEE_HT2.model.QueryBean;

import java.sql.*;

public class Connector {
    private static Driver driver;
    private static Connection con;
    private static PreparedStatement stat;
    private static ResultSet set;

    static {
        try {
            driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flats",
                    "root", "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ResultSet getResultSet(QueryBean query) {
        try {
            stat = con.prepareStatement("SELECT * FROM flats " +
                    "WHERE region = ? AND area <= ? AND rooms_amount <= ? AND price <= ?;");
            stat.setString(1, query.getRegion());
            stat.setInt(2, query.getArea());
            stat.setInt(3, query.getNoRooms());
            stat.setFloat(4, query.getPrice());
            set = stat.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return set;
    }

    public static void closeCon() throws SQLException {
        DriverManager.deregisterDriver(driver);
        con.close();
    }
}
