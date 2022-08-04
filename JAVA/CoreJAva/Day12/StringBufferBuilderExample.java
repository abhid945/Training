package Week_1.Day12;

public class StringBufferBuilderExample {
    public static void main(String[] args) {

        String name  = "Coditas";

        StringBuffer stringBuffer = new StringBuffer("Coditas");


        //concat
        name.concat("Eltp");
        System.out.println(name);


        System.out.println("*****************************String Buffer***************************");
//        stringBuffer.append("Eltp");
  //      System.out.println(stringBuffer);


        stringBuffer.reverse();
        System.out.println(stringBuffer);


        StringBuffer sb = new StringBuffer();
        sb.ensureCapacity(5);
        System.out.println(sb.capacity());

    }
}
