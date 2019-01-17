import java.util.Scanner;

public class Lab4 {
	public static void main(String[] args) {
	int userNum;
	
	String userInput;
	
	
do {
	Scanner scnr = new Scanner(System.in);

	System.out.println("Learn your squares and cubes!");
	System.out.println();
	System.out.println("Enter an integer:");
	
	userNum = scnr.nextInt();
	
	System.out.println("Number\tSquared\tCubed");
	System.out.println("======\t=======\t=====");

	for(int i = 1; i <= userNum; i++) {
		System.out.println(i + "\t" + i*i + "\t" +  i*i*i); 

	}
	System.out.println("Would you like to continue learning? (y/n) ");
	userInput = scnr.next();
	
	
	
	
}while (userInput.startsWith("y") || userInput.startsWith("Y"));
System.out.println("Well, fine then!");
System.out.println("Goodbye!");
	
}
	
}