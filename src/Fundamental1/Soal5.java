package Fundamental1;
/**
 * <h1>uppercase first letter of 2 word A & B</h1>
 * sum the length of string A & B
 * Input string A & B then convert the first letter to uppercase
 * compare A&B lexicographically
 * @author Panji JF
 * @version 1.0
 * @since 2022-08-29
 */
import java.util.Scanner;

public class Soal5 {
	public static void main (String[] args) {
		Scanner scanObj = new Scanner(System.in);
		
		//User input
		System.out.println("Input A :");
		String inputA = scanObj.nextLine();
		System.out.println("Input B :");
		String inputB = scanObj.nextLine();
		
		char[] arrayA = inputA.toCharArray();//ubah string ke array of char
		char[] arrayB = inputB.toCharArray();
		
		arrayA[0] = Character.toUpperCase(arrayA[0]);//uppercase index pertama
		arrayB[0] = Character.toUpperCase(arrayB[0]);
		
		inputA = String.valueOf(arrayA);//ubah lagi ke string
		inputB = String.valueOf(arrayB);
		
		System.out.println(inputA.length()+inputB.length());//sum length inputA & inputB
		if(inputA.compareToIgnoreCase(inputB) > 0) {
			System.out.println("Yes");//print yes jikalau Input A lebih besar secara lexicographically
		} else {
			System.out.println("No");
		}
		System.out.println(inputA + " " + inputB);//print kedua string dipisah spasi
	}
}
