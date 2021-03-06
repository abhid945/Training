package Week_1.Day7;
/*Create an abstract class Instrument which has the abstract function play.
Create three more subclasses from Instrument which are Piano, Flute, Guitar.
Override the play method inside all three classes printing a message. "Plano is playing
tan tan tan tan tor Piano class "Flute is playing toot toot toot toot" tor Flute class
"Guitar is playing tin tin tin for Guitar class
You must not allow the user to declare an object of Instrument class. Create an array of
10 Instruments. Assign different types of instrument to Instrument reference. Check for
the polymorphie behavior of the play method. Use the instanceot operator to print
which object stored at which index of instrument array.*/

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





/*Flute is stored at index 0
Flute is playing toot toot toot
Flute is stored at index 1
Flute is playing toot toot toot
Piano is stored at index  2
Piano is playing tan tan tan
Flute is stored at index 3
Flute is playing toot toot toot
Piano is stored at index  4
Piano is playing tan tan tan
Piano is stored at index  5
Piano is playing tan tan tan
Guitar is stored at index 6
Guitar is playing tin tin tin
Flute is stored at index 7
Flute is playing toot toot toot
Piano is stored at index  8
Piano is playing tan tan tan
Flute is stored at index 9
Flute is playing toot toot toot
*/
