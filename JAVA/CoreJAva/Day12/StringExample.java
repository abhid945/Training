package Week_1.Day12;

public class StringExample {
    public static void main(String[] args) {
        String first_name = "doditas";

        String last_name = "Coditas";

        System.out.println("Name is : " + first_name +" "+last_name);

        //Immutability
      //  first_name = first_name.concat(last_name);
        System.out.println(first_name);

        //equals method to check the equal   => Way1
        System.out.println("First name is equal to last name or not:" + first_name.equals(last_name));

        //Way 2 => == it will check object creation type as well
        System.out.println(first_name == last_name);

        //Way 3 Compareto will give output in integers and will return 0 if two strings are same , if fn < en => -1, if fn>en = 1
        System.out.println(first_name.compareTo(last_name));

    }
}
