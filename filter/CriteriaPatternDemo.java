import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternDemo {
    public static void main(String[] args) {
        List<Phone> allPhones = new ArrayList<Phone>();


        Phone phone1 = new SmartPhone(1, 123, Brand.SAMSUNG, " S9", "pink");
        Phone phone2 = new SmartPhone(1, 123, Brand.LENOVO, " k6", "pink");
        Phone phone3 = new FlipPhone(1, 123, Brand.ASUS, " p9", "black");
        Phone phone4 = new FlipPhone(1, 123, Brand.SAMSUNG, " p9", "black");


        allPhones.add(phone1);
        allPhones.add(phone2);
        allPhones.add(phone3);
        allPhones.add(phone4);


        Client client = new Client("Marina", "Anton", "0756123890");
        FilterClient filterClient = new FilterClient(client);
        filterClient.applyFilterList(filterClient.serchFiltering(allPhones), allPhones);


    }
}
