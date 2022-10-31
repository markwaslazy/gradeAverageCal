package averageCalculator;

import java.util.Scanner;

public class AverageGrade {
	
	static int getAverage(int[] x) {
		
		int y = 0;
		
		for (int i = 0; i < x.length; i++) {
			y += x[i];
		}
		
		y /= x.length;

		
		return y;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner get = new Scanner(System.in);
		
		int finalAverage;
		int subjNum;
		String[] ordinalNums = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eight", "ninth", "tenth", "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth", "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"};
		
		System.out.println("This is a program that calculates the average of your grade.");
		System.out.print("Enter how many subjects did you have?: ");
		subjNum = get.nextInt();
		
		System.out.println("");
		
		int[] arrSubj = new int[subjNum];
		
		if (subjNum > 20) {
			System.out.println("Sorry, but this program can't process more than 20 subjects yet.\n");
		}
		
		else {
			for (int i = 0; i <= arrSubj.length - 1; i++) {
				System.out.print("Enter your grade in the " + ordinalNums[i] + " subject: ");
				arrSubj[i] = get.nextInt();
			}
			finalAverage = getAverage(arrSubj);
			System.out.println("\nYour grade's total average: " + finalAverage);
		}
		
		get.close();
		
		System.out.println("[Program completed!]");
		
	}

}
