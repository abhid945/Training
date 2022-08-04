package Week_1.Day12;
/**
 * Separate the tokens(operands and operators) from below statement:
 * 3+(20%2) (20/2)
 * Case 1)Print separated tokens
 * Case 2)Print Operators and Operand separately
 */

import java.util.StringTokenizer;

class Tokenizer{

    void removeoperators(){
        StringTokenizer st = new StringTokenizer("3+(20%2) (20/2)","+%()/ ");
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());

        }
        System.out.println("****************************************");
    }

    void printingboth(){
        StringTokenizer str = new StringTokenizer("3+(20%2) (20/2)","+%()/ ");
        System.out.println("Operands are:");
        while (str.hasMoreTokens()){
            System.out.println( str.nextToken());
        }

        StringTokenizer ste = new StringTokenizer("3+(20%2) (20/2)","320");
        System.out.println("Operators are:");
        while (ste.hasMoreTokens()){
            System.out.println(ste.nextToken());
        }
    }
}


public class OperatorOperands {
    public static void main(String[] args) {
        Tokenizer tokenizer = new Tokenizer();
        tokenizer.removeoperators();
        tokenizer.printingboth();
    }
}


/*
Output:

3
20
2
20
2
****************************************
Operands are:
3
20
2
20
2
Operators are:
+(
%
) (
/
)

 */