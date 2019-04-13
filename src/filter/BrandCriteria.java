package filter;

import phone.Phone;

import java.util.ArrayList;
import java.util.List;


public class BrandCriteria implements Criteria {

    public BrandCriteria(String brand) {
        this.brand = brand;
    }

    public String brand;

    @Override
    public List<Phone> meetCriteria(List<Phone> allPhones) {
        List<Phone> brandCriteriaPhoneList = new ArrayList<Phone>();

        for (Phone phone : allPhones) {
            if (brand == phone.getBrand().toString()) {
                if (!brandCriteriaPhoneList.contains((phone)))
                    brandCriteriaPhoneList.add(phone);

            }
        }

        return brandCriteriaPhoneList;
    }


}
