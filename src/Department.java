import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentName;
    private Integer level;
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
