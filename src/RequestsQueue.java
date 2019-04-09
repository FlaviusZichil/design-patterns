import java.util.ArrayList;
import java.util.List;

public class RequestsQueue {
    private static List<Request> requests = new ArrayList<>();

    public static Request getOldestRequest(){
        return requests.get(0);
    }

    public static void addNewRequest(Request request){
        requests.add(request);
    }

    public static void removeRequestFromQueue(Request request){
        if(requests.size() != 0 && requests.contains(request)){
            requests.remove(request);
        }
        else{
            System.out.println("No such request ot request already completed");
        }
    }

    public static List<Request> getRequests() {
        return requests;
    }
}
