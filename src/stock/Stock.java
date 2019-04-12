import java.util.ArrayList;
import java.util.List;

public class Stock {
    private List<Phone> availablePhones;
    private List<Phone> soldPhones;

    public Stock() {
        this.availablePhones = new ArrayList<>();
        this.soldPhones=new ArrayList<>();
    }

    public List<Phone> getAvailablePhones() {
        return availablePhones;
    }

    public List<Phone> getSoldPhones() {
        return soldPhones;
    }

    public void setSoldPhones(List<Phone> soldPhones) {
        this.soldPhones = soldPhones;
    }

    public void setAvailablePhones(List<Phone> availablePhones) {
        this.availablePhones = availablePhones;
    }

}
