import java.util.Scanner;

public class BasicCalc {


public void Calculate() {


  int answer =0;
  Scanner scanCalc = new Scanner(System.in);
  System.out.println("Enter your first number here:");
  int num1 = scanCalc.nextInt();

  System.out.println("Enter the operator here:");
  char operator = scanCalc.next().charAt(0);

  System.out.println("Enter your second number here:");
  int num2 = scanCalc.nextInt();





  if(operator == '+'){

  answer = add( num1 ,  num2);

} else if(operator == '-'){

  answer = substract( num1 ,  num2);

} else if(operator == '*'){

  answer = multiply( num1 , num2);

} else if(operator == '/'){

  answer = divide( num1 ,  num2);

  }

System.out.print(num1 + " " + operator + " " + num2 + "=" +answer);


}




  public int add(int num1 , int num2) {


    int addition = num1 + num2;

    return addition;
   }



   public int substract(int num1 , int num2) {



     int substraction = num1 - num2;

     return substraction;
    }



    public int multiply(int num1 , int num2) {

      int multiplication = num1 * num2;

      return multiplication;
     }





     public int divide(int num1 , int num2) {



       int division = num1 / num2;

       return division;
      }


 }
