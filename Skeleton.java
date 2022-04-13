import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {
        int[] arss = new int[5];
	int sum = 0;

	Scanner scan = new Scanner(System.in);

        for(int idx = 0; idx < arss.length; idx++){
		System.out.println("Input the grade of assignment " + (1+idx));
		arr[idx] = scan.nextInt();
		sum += arss[idx];
	}
	System.out.println("Input the number of attended labs");
	int att = scan.nextInt();

	System.out.println("Input the midterm grade");
	int mid = scan.nextInt();


	System.out.println("Assignments (30%): " + (sum*0.3/5) + "\n"
		+ "Attendance (5%): " + (att*100*0.05/7) + "\n"
		+ "Midterm (30%): " + (mid*0.3));

    }
}
