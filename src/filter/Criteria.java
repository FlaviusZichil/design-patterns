package filter;

import phone.Phone;

import java.util.List;


public interface Criteria {

    public List<Phone> meetCriteria(List<Phone> allPhones);
}
