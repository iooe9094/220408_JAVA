/**
 * 
 */
package ex;

import java.util.Scanner;

/**
 * @author macbook
 *
 */
public class Ex4_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 예제 4-1
//		int score = 80;
//		if (score > 60) {
//			System.out.println("합격입니다.");
		
// 예제 4-2
//	    int x = 0;
//	    System.out.printf("x=%d일 때, 참인 것은 %n", x);
//	    
//	    if(x==0) System.out.println("x==0");
//	    if(x!=0) System.out.println("x!=0");
//	    if(!(x==0)) System.out.println("!(x==0)");
//	    if(!(x!=0)) System.out.println("!(x!=0)");
//	    
//	    x = 1;
//	    System.out.printf("x=%d일 때, 참인 것은 %n", x);
//	    
//	    if(x==0) System.out.println("x==0");
//	    if(x!=0) System.out.println("x!=0");
//	    if(!(x==0)) System.out.println("!(x==0)");
//	    if(!(x!=0)) System.out.println("!(x!=0");
		
// 예제 4-3
//		System.out.print("숫자를 입력하세요.>");
//		Scanner scanner = new Scanner(System.in);
//		int input = scanner.nextInt();
//		
//		if(input==0) {
//			System.out.println("입력하신 숫자는 0입니다.");
//		} else {
//			System.out.println("입력하신 숫자는 0이 아닙니다.");
//		}
//		
// 예제 4-4
//		int score = 0;
//		char grade = ' ';
//		
//		System.out.print("점수를 입력하세요.>");
//		Scanner scanner = new Scanner(System.in);
//		score = scanner.nextInt();
//		
//		if (score >= 90) {
//			grade = 'A';
//		} else if (score >= 80) {
//			grade = 'B';
//		} else if (score >= 70) {
//			grade = 'C';
//		} else {
//			grade = 'D';
//		}
//		System.out.println("당신의 학점은 " + grade + "입니다.");
		
// 예제 4-5
//		int score = 0;
//		char grade = ' ', opt = '0';
//		
//		System.out.print("점수를 입력해주세요.>");
//		
//		Scanner scanner = new Scanner(System.in);
//		score = scanner.nextInt();
//		
//		System.out.printf("당신의 점수는 %d 입니다.%n", score);
//		
//		if (score >= 90) {
//			grade = 'A';
//			if (score >= 98) {
//				opt = '+';
//			} else if (score < 94) {
//				opt = '-';
//			}
//		} else if (score >= 80) {
//			grade = 'B';
//			if (score >= 88) {
//				opt = '+';
//			} else if (score < 84) {
//				opt = '-';
//			}
//		} else {
//			grade = 'C';
//		}
//		System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
		
// 예제 4-6
//		System.out.print("현재 월을 입력하세요.>");
//		
//        Scanner scanner = new Scanner(System.in);
//        int month = scanner.nextInt();
//        
//        switch(month) {
//        case 3:
//        case 4:
//        case 5:
//        	System.out.println("현재의 계절은 봄입니다.");
//        	break;
//        case 6: case 7: case 8:
//        	System.out.println("현재의 계절은 여름입니다.");
//        	break;
//        case 9: case 10: case 11:
//        	System.out.println("현재의 계절은 가을입니다.");
//        	break;
//        default:
//     // case 12: case 1: case 2:
//        	System.out.println("현재의 계절은 겨울입니다.");
//        }
		
// 예제 4-7
//		int num = 0;
//		
//		// 괄호 {} 안의 내용을 5번 반복한다.
//		for (int i = 1; i <= 5; i++) {
//			num = (int)(Math.random() * 6) + 1;
//			System.out.println(num);
//		}
	}
}

