package Week_1.Day5;




class OneDArray {

     public  void displayData() {
        //way1 => Declaration
        int marks[] = new int[10];
        for (int i = 0; i < marks.length; i++) {
            System.out.println(i);

        }
         System.out.println("***************foreach**************");
        //Way2 => Declaration
        int rno[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int index : rno) {
            System.out.println(index);
        }
    }

}



class TwoDArray{
    public void displayData(){
        //initialization
        int rows[][] = {{1,2,3},{4,5,6},{7,8,9}};
        //we need nested forloop to iterate
        for (int i =0;i < rows.length;i++){
            for (int j=0;j<rows[i].length;j++){
                System.out.print(rows[i][j] + "");
            }
            System.out.println();
        }
    }
}

class JackedArray{
    public void displayData(){
        //initialization
        int rows[][] = {{1},{2,3},{4,5,6},{7,8,9,10}};
        //we need nested forloop to iterate
        for (int i =0;i < rows.length;i++){
            for (int j=0;j<rows[i].length;j++){
                System.out.print(rows[i][j] + "");
            }
            System.out.println();
        }
    }
}


 public class ArrayDemo {
    public static void main(String[] args) {
        System.out.println("************ONE D ARRAY******************");
         OneDArray oneDArray = new OneDArray();
         oneDArray.displayData();
        System.out.println("************Two D ARRAY******************");
         TwoDArray twoDArray = new TwoDArray();
          twoDArray.displayData();
        System.out.println("************JACKED ARRAY******************");
        JackedArray jackedArray = new JackedArray();
        jackedArray.displayData();
    }

}
