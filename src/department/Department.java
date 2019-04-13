package department;

import employee.Employee;
import request.RequestType;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentName;
    private RequestType departmentType;
    private List<Employee> employees = new ArrayList<>();

    public Department(){}

    public Department(String departmentName, RequestType departmentType) {
        this.departmentName = departmentName;
        this.departmentType = departmentType;
    }

    public RequestType getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(RequestType departmentType) {
        this.departmentType = departmentType;
    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", departmentType=" + departmentType +
                '}';
    }
}
