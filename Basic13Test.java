
public class Basic13Test {
    public static void main(String[] args){
        Basic13 testNumber = new Basic13();

        testNumber.print1To255();
        testNumber.printOdd1To255();
        testNumber.printSum();

        int[] testArr = {-9,-7,-5,-3,-1,0,1,3,5,7,9};
        testNumber.iterateArray(testArr);

        int[] testArr = {-9,-7,-5,-3,-1,0,1,3,5,7,9};
        testNumber.findMax(testArr);

        int[] testArr = {-9,-7,-5,-3,-1,0,1,3,5,7,9};
        testNumber.getAverage(testArr);

        testNumber.arrayOddNumbers();

        int[] testArr = {-9,-7,-5,-3,-1,0,1,3,5,7,9};
        testNumber.greaterThanY(testArr, 3);

        int[] testArr = {-9,-7,-5,-3,-1,0,1,3,5,7,9};
        testNumber.squareTheValues(testArr);

        int[] testArr = {-9,-7,-5,-3,-1,0,1,3,5,7,9};
        testNumber.eliminateNegativeNumbers(testArr);

        int[] testArr = {-9,-7,-5,-3,-1,0,1,3,5,7,9};
        testNumber.maxMinAvg(testArr);

        int[] testArr = {-9,-7,-5,-3,-1,0,1,3,5,7,9};
        testNumber.shiftingValues(testArr);
    }
}