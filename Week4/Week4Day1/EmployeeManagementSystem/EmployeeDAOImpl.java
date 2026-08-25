import java.sql.*;

public class EmployeeDAOImpl implements EmployeeDAO {

    static String URL = "jdbc:mysql://localhost:3306/practice";
    static String USER = "root";
    static String PASS = "radha@2008";

    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASS);
    }
    @Override
    public void createTable() {

        String sql = "CREATE TABLE IF NOT EXISTS FACULTY("
                + "Id INT PRIMARY KEY, "
                + "Name VARCHAR(50), "
                + "Email VARCHAR(100), "
                + "Department VARCHAR(50), "
                + "Salary DOUBLE)";

        try (Connection con = getConnection();
             Statement st = con.createStatement()) {

            st.executeUpdate(sql);
            System.out.println("Table Created Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addEmployee(EmployeeDb e) {

        String sql = "INSERT INTO FACULTY VALUES (?,?,?,?,?)";

        try (Connection con = getConnection();
             PreparedStatement p = con.prepareStatement(sql)) {

            p.setInt(1, e.getId());
            p.setString(2, e.getName());
            p.setString(3, e.getEmail());
            p.setString(4, e.getDepartment());
            p.setDouble(5, e.getSalary());

            System.out.println(p.executeUpdate() + " Employee Added");

        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    @Override
    public void updateEmployee(String email, int id) {

        String sql = "UPDATE FACULTY SET Email=? WHERE Id=?";

        try (Connection con = getConnection();
             PreparedStatement p = con.prepareStatement(sql)) {

            p.setString(1, email);
            p.setInt(2, id);

            int row = p.executeUpdate();

            if (row > 0)
                System.out.println("1 Employee Updated");
            else
                System.out.println("Employee ID Not Found");

        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    @Override
    public void deleteEmployee(int id) {

        String sql = "DELETE FROM FACULTY WHERE Id=?";

        try (Connection con = getConnection();
             PreparedStatement p = con.prepareStatement(sql)) {

            p.setInt(1, id);

            int row = p.executeUpdate();

            if (row > 0)
                System.out.println("1 Employee Deleted");
            else
                System.out.println("Employee ID Not Found");

        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
}
