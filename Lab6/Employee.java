import java.util.Scanner;



public class Employee {

public void employeeInfo() {


Scanner input = new Scanner(System.in);

System.out.println("Please input the employee’s first name:");
String fName = input.nextLine();

System.out.println("Please input the employee’s last name:");
String lName = input.nextLine();

System.out.println("Please input the employee’s age:");
int age = input.nextInt();


System.out.println("Please input the employee’s salary:");
double salary = input.nextDouble();





System.out.println("Employee information:" + " " + fName  + "," + " " + lName + "," + " " + age + "," + " "+ salary);


}



}
