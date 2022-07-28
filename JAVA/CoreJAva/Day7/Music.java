package Week_1.Day7;


import java.util.Random;

abstract class Instrument{

    abstract void play();
}

class Piano extends  Instrument{

    @Override
    void play() {
        System.out.println("Piano is playing tan tan tan");
    }
}


class Flute extends  Instrument{

@Override
    void play() {
            System.out.println("Flute is playing toot toot toot");
            }
}

class Guitar extends  Instrument{

    @Override
    void play() {
        System.out.println("Guitar is playing tin tin tin");
    }
}

public class Music {

    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[10];

        Random rand = new Random();
        for(int i =0;i<10;i++){
           int randomNum = rand.nextInt(3);

            if (randomNum == 0)
                instruments[i] = new Piano();
            else if (randomNum == 1)
                instruments[i] = new Flute();
            else if (randomNum == 2)
                instruments[i] = new Guitar();

        }

        for (int i=0;i<10;i++){
            if (instruments[i] instanceof Piano) {
                System.out.println("Piano is stored at index  " + i);
                instruments[i].play();
            }
            else if (instruments[i] instanceof Flute) {
                System.out.println("Flute is stored at index " + i);
                instruments[i].play();
            }
            else if (instruments[i] instanceof Guitar) {
                System.out.println("Guitar is stored at index " + i);
                instruments[i].play();
            }
        }
    }
}
