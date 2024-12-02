import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeManagementConn {
    private Connection connect() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "Frozenflower90"
                    + "");
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
