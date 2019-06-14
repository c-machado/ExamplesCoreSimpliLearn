package AssignmentS1;

public class Amstrong {

    public static void main(String args[]){
        int cube = 0;
        int digit = 0;
        int temp = 0;
        int number = 43;
        temp = number;
        while(number > 0){
            digit = number%10;
            number = number/10;
            cube += Math.pow(digit,3);
        }
        if(temp==cube)
            System.out.println("Amstrong number");
        else
            System.out.println("Not Amstrong number");

    }
}
