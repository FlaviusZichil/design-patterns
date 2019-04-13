import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Client {
    private String firstName;
    private String secondName;
    private String phoneNumber;
    private List<String> messages;

    public Client(String firstName, String secondName, String phoneNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.phoneNumber = phoneNumber;
    }

    public void sendRequest(String content, String phone, RequestType typeOfRequest) {
        Request request = new Request(content, this, phone, typeOfRequest);
        RequestsQueue.addNewRequest(request);
    }


//    public List<Object> aviableCriteriaList(List<Phone> allPhones, int value) {
//        List<Object> aviable = new ArrayList<>();
//        for (Phone phone : allPhones) {
//
//            switch (value) {
//                case 1:
//                    if (!aviable.contains(phone.getBrand())) {
//                        aviable.add(phone.getBrand());
//                    }
//                    break;
//                case 2:
//                    if (!aviable.contains(phone.getColor())) {
//                        aviable.add(phone.getColor());
//                    }
//                    break;
//                case 3:
//                    if (!aviable.contains(phone.type())) {
//                        aviable.add(phone.type());
//                    }
//                    break;
//                case 4:
//                    if (!aviable.contains(phone.getModel())) {
//                        aviable.add(phone.getModel());
//                    }
//                    break;
//            }
//        }
//        return aviable;
//    }
//
//    public HashMap<Filter, Object> serchFiltering(List<Phone> allPhones) {
//        HashMap<Filter, Object> filtersList = new HashMap<>();
//        List<Object> options = new ArrayList<>();
//        BufferedReader br;
//        int chosenValue;
//        int chosenValue1;
//        int ok = 0;
//        int ok1 = 0;
//        int i = 1;
//        List<Object> chosenElements = new ArrayList<>();
//        while (ok == 0 || ok == 1) {
//            br = new BufferedReader(new InputStreamReader(System.in));
//            System.out.println("Choose the number which matches the filter you are looking for" +
//                    "1 Brand   2 Color  3 Phone Type  4 Model  5 RAM Memory 6 Storage");
//            System.out.println("Write each number then press enter, when you are done press 0");
//
//
//            try {
//                i = 0;
//                String read = br.readLine();
//                chosenValue = Integer.parseInt(read);
//                if (chosenValue == 0)
//                    ok = 2;
//
//
//                else {
//                    options = aviableCriteriaList(allPhones, chosenValue);
//                    if (options == null)
//                        System.out.println("Nonexistent number, try again");
//
//                    System.out.println("Choose your number which matches your preferences ,when you are done press 0");
//
//                    for (Object objAviable : options) {
//                        System.out.println(i+1 + " " + objAviable.toString());
//                        i++;
//
//                    }
//
//                    BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
//                    String read1;
//                    read1 = br2.readLine();
//                    int chosenOption = Integer.parseInt(read1);
//                    System.out.println(i);
//                    if (chosenOption <=i) {
//                        if (chosenValue == 1)
//                            filtersList.put(Filter.BRAND, options.get(chosenOption-1).toString());
//                        else if (chosenValue == 2)
//                            filtersList.put(Filter.COLOR, options.get(chosenOption-1).toString());
//                        else if (chosenValue== 3)
//                            filtersList.put(Filter.TYPE, options.get(chosenOption-1).toString());
//                        else if (chosenValue== 3)
//                            filtersList.put(Filter.TYPE, options.get(chosenOption-1).toString());
//
//                    }
//
//
//                }
//            } catch (Exception e) {
//                System.out.println("Invalid input,try again");
//
//            }
//        }
//
//
//        return filtersList;
//
//
//    }
//
//    public List<Phone> ifNotExistDelete(List<Phone> allPhones, List<Phone> toBeAdded, Phone phone) {
//
//        List<Phone> afterDeletePhones = toBeAdded;
//        if (allPhones == null)
//            allPhones = toBeAdded;
//        else {
//            for (Phone phone1 : toBeAdded) {
//                if (!allPhones.contains(phone1)) {
//                    allPhones.remove(phone);
//
//                allPhones.subList(0, afterDeletePhones.size() - 1);  }
//                else
//                {
//                    //allPhones.add(phone1)   ;
//                }
//
//            }
//            if (!allPhones.contains(phone)) {
//                // int index= afterDeletePhones.indexOf(condition);
//                afterDeletePhones.remove(phone);
//                afterDeletePhones.subList(0, afterDeletePhones.size() - 1);
//                //allPhones..subList(0, afterDeletePhones.size() - 1);
//            }
//
//
//                   allPhones=afterDeletePhones;
//
//
//
//
//
//
//
//        }
//        return allPhones;
//    }
//
//
//    public void applyFilterList(HashMap<Filter, Object> filterList, List<Phone> allPhones) {
//        List<Phone> copy;
//        int index = 0;
//        Phone test = allPhones.get(1);
//        // appliedFilterList=allPhones;1
//        List<Phone> appliedFilterList = null;
//        Object currentKey;
//        Object currentValue;
//        Iterator it = filterList.entrySet().iterator();
//        while (it.hasNext()) {
//            Map.Entry<Filter, String> pair = (Map.Entry<Filter, String>) it.next();
//
//            currentKey = pair.getKey();
//            currentValue = pair.getValue();
//            System.out.println(currentKey + "=" + currentValue);
//
//
////        while (it.hasNext()) {
////            Map.Entry pair = (Map.Entry) it.next();
////            it.remove(); // avoids a ConcurrentModificationException
//            int stop = 10;
//            //appliedFilterList= allPhones;
//            for (int j = 0; j < filterList.size() && stop != 1; j++) {
//                //Filter f = (Filter) pair.getKey();
//                boolean checkIfHasNext = it.hasNext();
//                if (stop != 0) {
//
//                    switch (currentKey.toString()) {
//                        case "TYPE":
//                            PhoneTypeCriteria phoneType = new PhoneTypeCriteria(currentValue.toString());
//                            // appliedFilterList=  phoneType.meetCriteria(allPhones);
//                            appliedFilterList = ifNotExistDelete(appliedFilterList, phoneType.meetCriteria(allPhones), allPhones.get(j));
//                            display(j, checkIfHasNext, filterList.size()-1, appliedFilterList);
//                            stop = 1;
//
//                            break;
//                        case "BRAND":
//                            BrandCriteria brandCriteria = new BrandCriteria(currentValue.toString());
//                            //appliedFilterList = brandCriteria.meetCriteria(allPhones);
//                            appliedFilterList = ifNotExistDelete(appliedFilterList, brandCriteria.meetCriteria(allPhones), allPhones.get(j));
//                            display(j, checkIfHasNext, filterList.size()-1, appliedFilterList);
//                            stop = 1;
//                            break;
//                        case "COLOR":
//                            ColorCriteria colorCriteria = new ColorCriteria(currentValue.toString());
//                            // appliedFilterList= colorCriteria.meetCriteria(allPhones);
//                            appliedFilterList = ifNotExistDelete(appliedFilterList, colorCriteria.meetCriteria(allPhones), allPhones.get(j));
//                            display(j, checkIfHasNext, filterList.size()-1, appliedFilterList);
//
//                            stop = 1;
//                            break;
//
//
//                    }
//                    // boolean checkIfHasNext=it.hasNext();
//
//
//                }
//
//
//            }
//        }
//
//    }
//
//    public void display(int j, boolean hasNext, int size, List<Phone> appliedFilterList) {
//        if (j <= size && !hasNext) {
//            int check = 0;
//            for (Phone phone : appliedFilterList) {
//
//
//                System.out.println(phone.type() + " " + phone.getBrand() + "   " + phone.getModel() + " " + phone.getColor() + " " + phone.getPrice());
//            }
//        }
//    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addMessages(String messages) {
        this.messages.add(messages);
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
