public class QuestionEmployee extends Employee {

    public QuestionEmployee(){
        this.level = "QUESTION";
    }

    @Override
    protected void handleRequest() {
        System.out.println("Request resolved by a questionEmployee");
    }
}
