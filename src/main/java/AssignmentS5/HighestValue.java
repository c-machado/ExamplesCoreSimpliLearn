package AssignmentS5;

public class HighestValue {

    public static void main (String args[]) {
        int[] numbers = {12, 45, 888, 88, 8};
        int number, higestNumber=0, secondHighest;
        for(int i=0; i<numbers.length-1; i++){
            number = numbers[i];

            if(number > higestNumber)
            {
                higestNumber = number;
                secondHighest = higestNumber;
            }
        }
        System.out.println("el mayor es " + higestNumber);
    }
}
