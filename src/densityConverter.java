import java.util.Scanner;
public class densityConverter {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);

        double numA, numB,answer;

        System.out.println("Enter the number to convert from gm/cm3 to kg/m3: ");
        numA = keyboard.nextDouble();

        System.out.println("Enter the number to convert from kg/m3 to gm/cm3: ");
        numB = keyboard.nextDouble();


        answer = gmToKg(numA);
        System.out.println("gm to kg convert is: " + answer);

        answer = kgToGm( numB);
        System.out.println("kg to gm convert is: " + answer);

    }

    public static double gmToKg(double numA){
        double answer;
        answer = numA * 1000;
        return answer;
    }
    public static double kgToGm(double numB){
        double answer;
        answer = numB / 1000;
        return answer;

    }





}
