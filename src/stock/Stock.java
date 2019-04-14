package stock;

import phone.Phone;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private static List<Phone> availablePhones = new ArrayList<>();
    private static List<Phone> soldPhones = new ArrayList<>();

    public Stock() {
        availablePhones = new ArrayList<>();
        soldPhones=new ArrayList<>();
    }

    public static List<Phone> getAvailablePhones() {
        return availablePhones;
    }

    public static List<Phone> getSoldPhones() {
        return soldPhones;
    }

    public void setSoldPhones(List<Phone> soldPhones) {
        soldPhones = soldPhones;
    }

    public void setAvailablePhones(List<Phone> availablePhones) {
        availablePhones = availablePhones;
    }

}
