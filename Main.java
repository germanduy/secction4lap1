package secction4lap1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook a = new PhoneBook();
        PhoneNumber ct0 = new PhoneNumber();
        PhoneNumber ct1 = new PhoneNumber();
        PhoneNumber ct2 = new PhoneNumber();
        //Nhập trước
        ct0.name = "Duy1";
        ct0.phone.add("12");
        ct1.name = "Duy2";
        ct1.phone.add("21");
        ct2.name = "Duy3";
        ct2.phone.add("31");
        //thêm vào danh bạ
        a.PhoneList.add(ct0);
        a.PhoneList.add(ct1);
        a.PhoneList.add(ct2);
        //thêm sdt
        a.insertPhone("Duy4", "41");
        a.insertPhone("Duy4", "42");
        a.insertPhone("Duy5", "51");
        //System.out.println(a.PhoneList.get(4).phone);

        a.removePhone("Duy4");

        a.searchPhone("Duy1");
        a.insertPhone("Duy7", "71");
        a.insertPhone("Duy8", "81");
        a.insertPhone("Duy10", "101");
        a.insertPhone("Duy9", "91");
        a.sort();

    }

}
