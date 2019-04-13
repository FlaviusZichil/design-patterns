package filter;

import phone.Phone;

import java.util.ArrayList;
import java.util.List;

public class PhoneTypeCriteria implements Criteria {

    public String phoneType;

    public PhoneTypeCriteria(String phoneType) {
        this.phoneType = phoneType;
    }

    @Override
    public List<Phone> meetCriteria(List<Phone> allPhones) {
        List<Phone> typeCriteriaPhoneList = new ArrayList<>();

        for (Phone phone : allPhones) {
            if (phone.type().toString() == phoneType) {
                typeCriteriaPhoneList.add(phone);

            }
        }
        return typeCriteriaPhoneList;
    }


}
