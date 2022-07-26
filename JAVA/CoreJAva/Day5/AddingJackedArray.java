// Adding two jacked Array


package Week_1.Day5;

public class AddingJackedArray {

    int firstarray[][] = {{2, 3,4}, {3, 4, 4,5}, {5,6,7,8,9}};
    int secondarray[][] = {{1, 8,4}, {1, 3, 6,8}, {8,9,4,7,8}};

    void add() {
        for (int i = 0; i < firstarray.length; i++) {
            for (int j = 0; j < firstarray[i].length; j++) {
                firstarray[i][j] = firstarray[i][j] + secondarray[i][j];
            }
        }

        for (int i = 0; i < firstarray.length; i++) {
            for (int j = 0; j < firstarray[i].length; j++) {
                System.out.print(firstarray[i][j] + " ");
            }
            System.out.println();
        }
    }




    public static void main(String[] args) {
     AddingJackedArray addingJackedArray = new AddingJackedArray();
     addingJackedArray.add();
    }
}
