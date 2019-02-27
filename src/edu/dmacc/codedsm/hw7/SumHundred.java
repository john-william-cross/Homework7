package edu.dmacc.codedsm.hw7;

public class SumHundred {

    public static void main(String[] args) {

        int iterations = 1;
        int first = 5; //if a negative int has an absolute value greater than the other int's absolute value, an infinite loop is created below.
        int second = 4;
        int result = first + second;

        while (result <= 100) {
            System.out.println(result);
            result = ((myInts(first, second, result)));
            iterations++;
        }

        System.out.println(output(result, iterations));
    }

    public static int myInts(int firstInput, int secondInput, int priorResult) {
        return firstInput + secondInput + priorResult;
    }

    public static String output(int finalResult, int iterations) {
        String print = "The first result greater than 100 was " + finalResult + " and took " + iterations + " iterations to complete.";
        return print;
    }
}
