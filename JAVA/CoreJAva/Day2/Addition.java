package Week_1.Day2;

public class Addition {

    public void Intadd(){
        int Intvariable1 = 10;
        int Intvariable2 = 20;

        int IntSum = Intvariable1 + Intvariable2;
        System.out.println("Addition of two integer is:" + IntSum);
    }

    public void Shortadd(){
        short Shortvariable1 = (short) 101000;
        short Shortvariable2 = (short) 201000;

        short ShortSum = (short) (Shortvariable1 + Shortvariable2);
        System.out.println("Addition of two short is:" + ShortSum);
    }

    public void longadd(){
        long longvariable1 = 10L;
        long longvariable2 = 20L;

        long longSum = longvariable1 + longvariable2;
        System.out.println("Addition of two long is:" + longSum);
    }

    public void floatadd(){
        float floatvariable1 = 10.0f;
        float floatvariable2 = 20.0f;

        float floatSum = floatvariable1 + floatvariable2;
        System.out.println("Addition of two float is:" + floatSum);
    }

    public void doubleadd(){
        double doublevariable1 = 10d;
        double doublevariable2 = 20d;

        double doubleSum = doublevariable1 + doublevariable2;
        System.out.println("Addition of two double is:" + doubleSum);
    }

    public void charadd(){
        char char1 = 'a';
        char char2 = 'b';

        String CharSum = Character.toString(char1) + Character.toString(char2);
        System.out.println("Addition of two Character is:" +  CharSum);
    }

    public static void main(String[] args) {
     Addition addition = new Addition();
     addition.Intadd();
     addition.Shortadd();
     addition.longadd();
     addition.floatadd();
     addition.doubleadd();
     addition.charadd();
    }
}
