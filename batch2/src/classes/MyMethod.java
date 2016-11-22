    package classes;

    import java.util.ArrayList;
    import java.util.List;
    import java.util.Random;
    import java.util.StringJoiner;

    /**
 * Created by JPMPC-B216 on 11/12/2016.
 */
public class MyMethod {

    public static void getOutput(int teacher, int day) {
        if (teacher == 1 && day == 1) {
            System.out.println("Monday \n Current subject is Math and has less than or equal to 15 students");
        } else if (teacher == 3 && day == 2) {
            System.out.println("Tuesday \n Current subject is Science and has 20 students");
        } else if ((teacher == 2 || teacher == 4 || teacher == 5) && (day == 1 || day == 2)) {
            System.out.println("Monday and Tuesday \n Current subjects English , OOP and Server Maintenance has less than or greater than 20");
        } else {
            System.out.println("Not available");
        }
    }

    public static void getDay(String day, boolean h) {
        if (day == "Weekday" && (h == true || h == false)) {
            System.out.println("Weekday Not Vacation");
        } else if (day == "weekday" && h == true) {
            System.out.println("weekday It's a vacation");
        } else if (day == "weekend" && (h == false || h == true)) {
            System.out.println("weekend It's a vacation");
        } else {
            System.out.println("Not in the list");
        }
    }

    public static void getStat(boolean regular, boolean partTime) {
        if (regular && !partTime) {
            System.out.println("Regular Student with 7 subjects");
        } else if (regular && partTime) {
            System.out.println("Regular student working in part-time with 6 sub");
        } else if (!regular && !partTime) {
            System.out.println("Irregular student with 5 subjects");
        } else /* (!regular && partTime) */ {
            System.out.println("Irregular student with part-time with  6 subjects");
        }
    }

    public static void getBack(int x,int Limiter) {
        while(x <= Limiter){
            System.out.print("["+x+"]");
            x++;
        }
    }
    public static int getSumOfLoop(int n){
        int sum = 0;
        int x = 1;
        while (x <= n){
            sum = x + sum;
            x++;
        }return sum;
    }
    public static void getListOfBracketNum(int x) {

        do{
            System.out.print("["+x+"]");
            x++;
        }while(x <= 9);
    }

    public static String getArray(String []myFriends){
        String str = "";
        for(int i = 0;i < myFriends.length;i++){
            str+= myFriends[i]+" ";
        }return str;

    }
    public static String getBoy() {
        double x = Math.random()*4;
        int y = (int)x;


        List Friends = new ArrayList();
        Friends.add("Pogadz");
        Friends.add("Adz");
        Friends.add("Dong");
        Friends.add("DongDong");
        Friends.add("DingDong");

        return (String)Friends.get(y);
    }
    public static String getGirl(){
        double x = Math.random()*4;
        int y = (int)x;

        List GirlFriends = new ArrayList();
        GirlFriends.add("Maria");
        GirlFriends.add("Jessie");
        GirlFriends.add("Jessica");
        GirlFriends.add("Trixie");
        GirlFriends.add("Mary");

        return (String)GirlFriends.get(y);
    }
    public static String getRelationship(){
        double x = Math.random()*2;
        int y = (int)x;

        List relation = new ArrayList();
       // List<String> relation = new ArrayList<String>();  -- if you'll use this way
        relation.add("loves");
        relation.add("hates");
        relation.add("misses");

        return (String)relation.get(y);
        //return relation.get((int)(Math.random()*relation.size())); -- you don't need to cast it to String
    }
}
