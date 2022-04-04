import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class ExpensesTracker{

public static void main(String[] args)  {

String name;
String purchase;
double payAmount;
String answer;


try{

FileWriter fw = new FileWriter(new File("expenses.txt"));
BufferedWriter bw = new BufferedWriter(fw);
PrintWriter outToFile = new PrintWriter(bw);
Scanner scan = new Scanner(System.in);

do{

System.out.print("Input your name:");
 name = scan.nextLine();

System.out.println();

System.out.print("What did you purchase?:");
purchase = scan.nextLine();

System.out.println();

System.out.print("How much did you pay? (in USD):");
 payAmount = scan.nextDouble();

outToFile.print(name +" "+ "purchased" +" "+ purchase +" " + "for" +" "+ payAmount +" " +"US Dollars.");

outToFile.close();

System.out.println();
System.out.println("Would you like to log another operation? [y/n]");
scan.nextLine();
 answer = scan.nextLine();

}while(answer.equals("y"));
if(answer.equals("n")){
  System.out.println("Get off of Zoodmall!");

//Bonus start
  System.out.println("Would you like to read a summary of your purchases?(y/n)");
  String answer2 = scan.nextLine();
  scan.close();

  if(answer2.equals("y")){
  Scanner filescan = new Scanner(new File("expenses.txt"));
  String url;
  url = filescan.nextLine();
  System.out.println(url);}
  // Bonus end

}



} catch (IOException e) {
  System.out.println("An error occurred.");
  e.printStackTrace(); }

}

}
