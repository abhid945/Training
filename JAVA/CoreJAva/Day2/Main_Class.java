package Week_1.Day2;

class CPU {
    double price;
    // nested class
    class Processor{
        // members of nested class
        double cores;
        String manufacturer;
        double getCache(){
            return 4.3;
        }
    }
    // nested protected class
    protected class RAM{
        // members of protected nested class
        double memory;
        String manufacturer;
        double getClockSpeed(){
            return 5.5;
        }
    }
}

 class Main_Class{

    public static void main(String[] args) {

        CPU cpu = new CPU();
        CPU.Processor processor = cpu.new Processor();
        CPU.RAM ram = cpu.new RAM();
        System.out.println("Get cache from processor:-" + processor.getCache());
        System.out.println("Clock speed from RAM:- " + ram.getClockSpeed());
        ram.manufacturer = "Microsoft";
        processor.manufacturer = "INTEL";
        System.out.println( "Processor Manufacturer:- " + processor.manufacturer);
        System.out.println("Ram Manufacturer:- " + ram.manufacturer);
    }

}


