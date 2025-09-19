// This class calculates a waitperson's tip
// as 15% of the bill
import java.util.Scanner;

   class DebugThree1
{

public static void main(String[] args)

{


Scanner scanner = new Scanner(System.in);

System.out.print("Enter the amount of your check >> ");
double check1 = scanner.nextDouble();

System.out.print("Enter the amount of your friend's check >> ");
double check2 = scanner.nextDouble();

calcTip(check1);
calcTip(check2);
}

public static void calcTip(double bill) 
{

final double RATE = 0.15;

double tip;
tip = bill * RATE;
System.out.println("The tip should be at least $" + tip);

}
}
