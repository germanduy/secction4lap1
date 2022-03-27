package secction4lap1;

import java.lang.reflect.Array;
import java.util.*;

public class PhoneBook extends Phone{
    public ArrayList<PhoneNumber> PhoneList = new ArrayList<>();
    public void insertPhone(String name, String phone){
        for(PhoneNumber p:PhoneList){
            if(p.name == name) {
                for (String s : p.phone) {
                    if (s == phone) {
                        return;
                    }
                }
                p.phone.add(phone);
                return;
            }
        }
        // thêm liên lạc mới
        PhoneNumber pn = new PhoneNumber();
        pn.name=name;
        pn.phone.add(phone);
        PhoneList.add(pn);
    }
    public void removePhone(String name){
        for(PhoneNumber p:PhoneList){
            if(p.name==name){
                PhoneList.remove(p);
                return;
            }
        }

    }
    public void updatePhone(String name, String newphone){
        for(PhoneNumber p:PhoneList){
            if(p.name==name){
                p.phone.removeAll(p.phone);
                p.phone.add(newphone);
            }
        }
    }
    public void searchPhone(String name){
        for (PhoneNumber p:PhoneList){
            if(p.name==name){
                System.out.println(p.phone);
            }
        }

    }
    public void sort(){
        Collections.sort(PhoneList, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        for(PhoneNumber p:PhoneList){
            System.out.println(p.name);
            System.out.println(p.phone);
        }
        }

}
