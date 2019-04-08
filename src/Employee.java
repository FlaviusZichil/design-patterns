import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
    private boolean isAvailable = true;
    protected String level;
    private Employee nextEmployee;
    private List<Employee> subordinates = new ArrayList<>();
    private Department department;

    public void setNextEmployee(Employee employee){
        this.nextEmployee = employee;
    }

    public void verifyCompatibility(RequestType requestType){
        if(this.level.equals(requestType.toString()) && this.isAvailable){
            this.handleRequest();
        }
        else{
            if(nextEmployee != null){
                System.out.println("Request passed");
                nextEmployee.verifyCompatibility(requestType);
            }
        }
    }

    public void addSubordinate(Employee subordinate){
        this.subordinates.add(subordinate);
    }

    public void removeSubrodinate(Employee subordinate){
        if(subordinates.size() != 0 && subordinates.contains(subordinate)){
            subordinates.remove(subordinate);
        }
        else{
            System.out.println("No such subordinate!");
        }
    }

    protected abstract void handleRequest();

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Employee getNextEmployee() {
        return nextEmployee;
    }

    public List<Employee> getSubordonates() {
        return subordinates;
    }

    public void setSubordonates(List<Employee> subordonates) {
        this.subordinates = subordonates;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "isAvailable=" + isAvailable +
                ", level=" + level +
                ", nextEmployee=" + nextEmployee +
                ", subordinates=" + subordinates +
                ", department=" + department +
                '}';
    }
}
