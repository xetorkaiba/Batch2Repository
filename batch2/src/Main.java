import classes.Customer;
import classes.Employee;
import classes.MyMethod;
import classes.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static javafx.scene.input.KeyCode.L;

public class Main {

    public static void main(String[] args) {
       /* String x="12345";
        for(int j = 0;j < x.length()-2 ;j++){
            System.out.print(x.substring(j,1));
        }*/


        //System.out.println(x.substring(x.length()));

    /*    byte byter = 127;
        short shorter = 32767;
        int inter = 2147483647;
        long longer = -922372036857758033L;
        long longerr = 3333243333333333333L;
        float floater = 8.2f;
        double doubler = 12312312.1232;
        boolean booleaner = true;
        char charer = '\u0041';
        String name = "name pa more";
        int grades[] = new int[5];
            grades[0]=90;
            grades[0]=90;
            grades[0]=90;
            grades[0]=90;
            grades[0]=90;
            grades[0]=90;
        String messages[] = new String[3];
        messages[0] = "error pa more";
        messages[1] = "error pa wore";
        messages[2] = "error pa tor";


        System.out.println(byter);
        System.out.println(shorter);
        System.out.println(inter);
        System.out.println(longer);
        System.out.println(longerr);
        System.out.println(floater );
        System.out.println(doubler);
        System.out.println(charer);
        System.out.println("Your name is" +name);
        //System.out.println(grades[0]);
        System.out.println("anak kanang " +messages[0]+messages[1]); */


    /*    Person Richard = new Person();
        Richard.setName("Richard Lambojon");
        Richard.setAge(19);
        Richard.setWeight(20);
        Richard.setHeight(100);
        Richard.setEmail("totyo@email.com");
        Richard.setGender("Male");

        System.out.println(Richard.getName());
        System.out.println(Richard.getAge());
        System.out.println(Richard.getWeight());
        System.out.println(Richard.getHeight());
        System.out.println(Richard.getEmail());
        System.out.print(Richard.getGender());
        */

        /*
        Employee manager = new Employee();
        manager.setName("totski");
        manager.setGender("male");
        manager.setHeight(200);
        manager.setWeight(100);
        manager.setEmail("totyo@email.com");
        manager.setDepartment("tiguwang Department");
        manager.setEmployeID(13);
        manager.setPagibigID(103434);
        manager.setSSSID(132123);
        manager.setAge(30);

        Customer adik = new Customer();
        adik.setCreditCardNo(341312);
        adik.setCustomerID(123123);
        adik.setMembershipLevel("senior");
        adik.setName("richard");

        System.out.println("Name: " + manager.getName());
        System.out.println("Gender: " + manager.getGender());
        System.out.println("Height: " + manager.getHeight());
        System.out.println("Weight: " + manager.getWeight());

        System.out.println("Age:" + manager.getAge());

        System.out.println("CreditCard: " + adik.getCreditCardNo());
        System.out.println("Customer ID: " + adik.getCustomerID());
        System.out.println("MembershipLvl:" + adik.getMembershipLevel());

        System.out.println(manager.introduceYourself() + " I'm a manager");
        System.out.println(manager.introduceYourself("chad", "totyot@email.com"));
        System.out.println(adik.introduceYourself("richard lambojon", "aw@gmail.com"));

        Person me = new Person();
        me.setName("Richard");
        System.out.println(me.getName());
        System.out.println("-------------------------------------------------"); */


        // me.getOutput(4,1);
        //MyMethod.getStat(true,true);
        //MyMethod.getDay("weekday",true);
      //  MyMethod.getOutput(1,1);


      /*  int partTime = 1;
        boolean regular = true;
        switch(partTime) {
            case 1:
                System.out.println((regular ? "Is regular " : " Is irregular") + "and has subject of" + (regular ? 7 : 6));
                break;
            case 2:
                System.out.println("yes");
                break;
        } */
        //MyMethod.getBack(0,9);

        //int sum = MyMethod.getSumOfLoop(6);
       // System.out.println(sum);

       // MyMethod.getListOfBracketNum(1);
      //  String myFriends[] = {"Pogadz","Adz","Chan", "DongCaba","Bongcagoy"};
        //System.out.println(MyMethod.getArray(myFriends));
            double xx = Math.random()*2;
            int yy = (int)xx;
        System.out.println((yy == 1? MyMethod.getGirl(): MyMethod.getBoy())+" "+MyMethod.getRelationship()+" "+ (yy == 1?MyMethod.getBoy():MyMethod.getGirl()));

    }


}





