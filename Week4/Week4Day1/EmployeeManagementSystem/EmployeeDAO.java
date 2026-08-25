public interface EmployeeDAO {

    void createTable();
    void addEmployee(EmployeeDb e);
    void updateEmployee(String email, int id);
    void deleteEmployee(int id);
}
