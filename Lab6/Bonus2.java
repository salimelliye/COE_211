
import java.util.Scanner;
public class Bonus2 {

public void boonus2() {

Boolean b2 = true;

while(b2 == true ){ //Bonus 1
  System.out.println("Which service would you like to use?");
  System.out.println("[1]: Basic week visualizer");
  System.out.println("[2]: Advanced week visualizer");
  System.out.println("[3]: Basic calculator");
  System.out.println("[4]: Employee repertoire");

  Scanner input2 = new Scanner(System.in);
  System.out.print("Enter the number of the service: ");
  int numberOfService = input2.nextInt();

  BasicDays basic = new BasicDays();
  AdvancedDays advanced = new AdvancedDays();
  BasicCalc calc = new BasicCalc();
  Employee emp = new Employee();


  if (numberOfService == 1){

  basic.weekDaysAre();

  } else if (numberOfService == 2){

  advanced.AdvancedDaysAre();

  } else if (numberOfService == 3){

  calc.Calculate();

  } else if (numberOfService == 4){

  emp.employeeInfo();

  } else{

   System.out.println("Please make sure you pick a number between 1 and 4");  //Bonus 2

  }

//Bonus 1
  System.out.print("Would you like to perform another operation? [y/n]: ");
  char answer = input2.next().charAt(0);
  if (answer == 'y' ){
    b2 = true;
  }else{
    b2 = false;
  }
}










}

}
