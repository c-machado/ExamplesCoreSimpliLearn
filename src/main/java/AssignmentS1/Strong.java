package AssignmentS1;

public class Strong {

    public static void main(String args[]){
        int number = 145;
        int digit = 0;
        int strong = 0;
        int temp = 0;
        temp = number;
        while (number>0){
            digit = number%10;
            number = number/10;
            strong += factorial(digit);
        }
        if (strong==temp){
            System.out.println("It's a strong number");
        }
        else {
            System.out.println("It's not a strong number");
        }
    }

    public static int factorial(int number){
        int factorial = 1;
        while(number>0){
            factorial = factorial * number;
            number--;
        }
        System.out.println("factorial "+factorial);
        return factorial;
    }
}
