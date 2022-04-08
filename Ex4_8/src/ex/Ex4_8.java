package ex;

import java.util.Scanner;

public class Ex4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 연습문제 4-8
//		for (int i=1; i<=3; i++) {
//			System.out.println("Hello");
		
// 연습문제 4-9
//	    for (int i=1; i<=5; i++) {
//	    	System.out.println(i); // 세로출력(줄바꿈)
//		}
//	    for (int i=1; i<=5; i++) {
//	    	System.out.print(i); // 가로출력
//	    }
//	    System.out.println();
		
// 연습문제 4-10
//		int sum = 0;
//		
//		for(int i=1; i<=5; i++) {
//			sum += i;
//			System.out.printf("1부터 %2d 까지의 합: %2d%n", i, sum);
//		}
		
// 연습문제 4-11
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
// 연습문제 4-12
//		int i = 5;
//		
//		while(i--!=0) {
//			System.out.println(i + " - I can do it.");
//		}
		
// 연습문제 4-13
//	    int sum = 0;
//	    int i = 0;
//	    
//	    while (sum<=100) {
//	    	System.out.printf("%d - %d%n", i, sum);
//	    	sum += ++i;
//	    }
		
// 연습문제 4-14
//		int num = 0, sum = 0;
//		System.out.print("숫자를 입력하세요.(예:12345)>");
//		
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine();
//		num = Integer.parseInt(tmp);
//		
//		while(num!=0) {
//			sum += num%10;
//			System.out.printf("sum=%3d num=%d%n", sum, num);
//			
//			num /= 10;
//		}
//		System.out.println("각 자리수의 합: " + sum);
		
// 연습문제 4-15
//		int input = 0, answer = 0;
//		
//		answer = (int)(Math.random() * 100) + 1;
//		Scanner scanner = new Scanner(System.in);
//		
//		do {
//			System.out.print("1과 100사이의 정수를 입력하세요.>");
//		    input = scanner.nextInt();
//		    
//		    if(input > answer) {
//		    	System.out.println("더 작은 수로 다시 시도해보세요.");
//		    } else if(input < answer) {
//		    	System.out.println("더 큰 수로 다시 시도해보세요.");
//		    }
//		} while(input!=answer);
//		
//		System.out.println("정답입니다.");
		
// 연습문제 4-16
//		int sum = 0;
//		int i = 0;
//		
//		while(true) {
//			if(sum>100) 
//				break;
//			++i;
//			sum += i;
//		}
//		
//		System.out.println("i=" + i);
//		System.out.println("sum=" + sum);
		
// 연습문제 4-17
//		for(int i=0; i<=10; i++) {
//			if (i%3==0)
//				continue;
//			System.out.println(i);
//		}
		
// 연습문제 4-18
//		int menu = 0;
//		int num = 0;
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("(1) square");
//			System.out.println("(2) square root");
//			System.out.println("(3) log");
//			System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료: 0)>");
//			
//		    String tmp = scanner.nextLine();
//		    menu = Integer.parseInt(tmp);
//		    
//		    if(menu==0) {
//		    	System.out.println("프로그램을 종료합니다.");
//		    	break;
//		    } else if (!(1<=menu && menu <=3)) {
//		    	System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
//		    	continue;
//		    }
//		    
//		    System.out.println("선택하신 메뉴는 " + menu + "번입니다.");
//		}
		
// 연습문제 4-19
		Loop1 : for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(j==5)
					break Loop1;
				// break;
				// continue Loop1;
				// continue;
				System.out.println(i+ "*" + j + "=" + i*j);
			}
			System.out.println();
		}
	}
}
