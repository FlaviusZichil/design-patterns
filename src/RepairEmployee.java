public class RepairEmployee extends Employee {

    public RepairEmployee(){
        this.level = "REPAIR";
    }

    @Override
    protected void handleRequest() {
        System.out.println("Request resolved by a repairEmployee");
    }
}
