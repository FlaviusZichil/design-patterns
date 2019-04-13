package employee;


import client.Client;
import department.Department;
import message.Message;
import request.Request;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
    private boolean isAvailable = true;
    protected String level;
    private Employee nextEmployee;
    protected List<Employee> subordinates = new ArrayList<>();
    private Department department;

    public void setNextEmployee(Employee employee){
        this.nextEmployee = employee;
    }

    public void verifyCompatibility(Request request){
        System.out.println("REQUEST TYPE: " + request.getRequestType().toString());

        if(this.level.equals(request.getRequestType().toString()) && this.isAvailable){

            this.handleRequest(request);
        }
        else{
            if(nextEmployee != null){
                System.out.println("Request passed from " + this.level + " employee to " + nextEmployee.level + " employee.");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                nextEmployee.verifyCompatibility(request);
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

    protected abstract void handleRequest(Request request);
    protected abstract void sendResponseToClient(Message message, Client client);


    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Employee getNextEmployee() {
        return nextEmployee;
    }

    public abstract List<Employee> getSubordinates();

    public void setSubordonates(List<Employee> subordonates) {
        this.subordinates = subordonates;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
        department.addEmployee(this);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "level=" + level +
                ", department=" + department +
                '}';
    }
}
