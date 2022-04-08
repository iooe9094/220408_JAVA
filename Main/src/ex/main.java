package ex;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		
		String Hex = Integer.toHexString(b); // 16진수
	    Hex = Hex.toUpperCase();
		System.out.println(Hex);

	}

}
