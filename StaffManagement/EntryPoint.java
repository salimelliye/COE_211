import java.util.Scanner;

public class EntryPoint {
public static void main(String[] args){


Scanner inpt1 = new Scanner(System.in);
System.out.println("Please input the employee's first name:");
String name1  = inpt1.nextLine();

Scanner inpt2 = new Scanner(System.in);
System.out.println("Please input the employee's last name:");
String lastname1 = inpt2.nextLine();

Scanner inpt3 = new Scanner(System.in);
System.out.println("Please input the employee's age:");
int age1 = inpt3.nextInt();


Scanner inpt4 = new Scanner(System.in);
System.out.println("Please input the employee's monthly salary:");
double salary1 = inpt4.nextDouble();


Employee emp1 = new Employee(name1, lastname1, age1, salary1);

System.out.println("Employee information:" + ","+ emp1.FirstName + "," + emp1.LastName + ","  + emp1.Age +","+ emp1. MonthlySalary);

}

}
