import java.util.Scanner;

public class Lab6 {

  public static void main(String[] args){
    Boolean b1 = true;

    while(b1 == true ){ //Bonus
      System.out.println("Which service would you like to use?");
      System.out.println("[1]: Basic week visualizer");
      System.out.println("[2]: Advanced week visualizer");
      System.out.println("[3]: Basic calculator");
      System.out.println("[4]: Employee repertoire");

      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of the service: ");
      int numberOfService = input.nextInt();

      BasicDays basic = new BasicDays();

      if(numberOfService == 1){

      basic.weekDaysAre();

      }

      AdvancedDays advanced = new AdvancedDays();

      if(numberOfService == 2){

      advanced.AdvancedDaysAre();

      }

      BasicCalc calc = new BasicCalc();

      if(numberOfService == 3){

      calc.Calculate();

      }

      Employee emp = new Employee();

      if(numberOfService == 4){

      emp.employeeInfo();

      }

//Bonus
      System.out.print("Would you like to perform another operation? [y/n]: ");
      char answer = input.next().charAt(0);
      if (answer == 'y' ){
        b1 = true;
      }else{
        b1 = false;
      }
    }

  }
}
