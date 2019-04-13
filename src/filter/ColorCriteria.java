package filter;

import phone.Phone;

import java.util.ArrayList;
import java.util.List;

public class ColorCriteria implements Criteria {
    public String color;

    ColorCriteria(String color) {
        this.color = color;
    }

    @Override
    public List<Phone> meetCriteria(List<Phone> allPhones) {
        List<Phone> colorCriteriaPhoneList = new ArrayList<>();

        for (Phone phone : allPhones) {
            if (phone.getColor().equals(color)) {
                colorCriteriaPhoneList.add(phone);

            }
        }
        return colorCriteriaPhoneList;
    }


}
