import java.util.Scanner;

    public class EBOBandEKOK {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a first number: ");
        int number1 = input.nextInt();

        System.out.print("Please enter a second number: ");
        int number2 = input.nextInt();

        int ebob = 0;

        int i=1;
        while(i <= number1){
            if (number1 % i == 0 && number2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        System.out.println("Ebob: " + ebob);

        int ekok = (number1 * number2) / ebob;
        System.out.println("Ekok :" + ekok);
    }
}