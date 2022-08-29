package Fundamental1;
/**
 * <h1>Output which data type does numerical input fit into</h1>
 * Input a number then print which data type
 * that can be fitted in
 * @author Panji JF
 * @version 1.0
 * @since 2022-08-29
 */
import java.util.Scanner;

public class Soal1 {
	
	public static void main(String[] args) {
		/**
		 * This method ask for user input then check whether the input
		 * can be fitted into numerical data type then print list of
		 * data type that fit 
		 */
		Scanner scanObj = new Scanner(System.in);
		char penampungExit = 'N';
		String penampungInp = "";
		while(penampungExit != 'y' && penampungExit != 'Y') {
			try {
				System.out.println("Input Angka :");
				penampungInp = scanObj.nextLine();
				long num1 = Long.parseLong(penampungInp);
				if (num1 < Byte.MAX_VALUE && num1 > Byte.MIN_VALUE ) {
					System.out.println(num1 + " can be fitted in:");
					System.out.println("* byte\n* short\n* int\n* long");
				} else if (num1 < Short.MAX_VALUE && num1 > Short.MIN_VALUE) {
					System.out.println(num1 + " can be fitted in:");
					System.out.println("* short\n* int\n* long");
				} else if (num1 < Integer.MAX_VALUE && num1 > Integer.MIN_VALUE) {
					System.out.println(num1 + " can be fitted in:");
					System.out.println("* int\n* long");
				} else if (num1 < Long.MAX_VALUE && num1 > Long.MIN_VALUE) {
					System.out.println(num1 + " can be fitted in:");
					System.out.println("* long");
				}
			} catch (NumberFormatException e){
				System.out.println(penampungInp + " Can't be fitted anywhere");
			}
			System.out.println("Exit?[Y/N]");
			penampungExit = scanObj.nextLine().charAt(0);
		}
	}
}
