package ex;

public class p125_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 연습문제 4-2
//	    int sum = 0;
//	    
//		for (int i=1; i<=20; i++) {
//			if(i%2!=0 && i%3!=0) {
//				sum += i; // 누적합계
//				
//				// 디버깅 방법 1
//				// sum, i가 어떻게 변하는지 확인하면서 보는 것
////			    System.out.println("i =" + i);
////			    System.out.println("sum =" + sum);
//				
//				// 디버깅 방법 2
//				// 왼쪽 더블클릭(브레이크 포인트) -> 상단곤충모양
//			}
//		}
//		System.out.println(sum);
		
// 연습문제 4-3 부분합 / 총합 계산 문제 내 풀이
//		int sum = 0;
//		
//        for (int i=1; i<=10; i++) {
//        	for (int j=0; j<=i; j++) {
//        		sum += j;
//        	}
//        }
//        System.out.println(sum);
// 연습문제 4-3 해설
//		int sum = 0;
//		int totalSum = 0;
//		
//		for(int i=1; i<=10; i++) {
//			sum += i; // 첫 번째 부분합
//		    totalSum += sum; // 두 번째 부분합을 다 더한 총합
//		}
//	    System.out.println("totalSum=" + totalSum);
		
// 연습문제 4-4 내풀이
//		int sum1 = 0;
//		int sum2 = 0;
//		
//		for (int j=1; j<20; j++) {
//			if (j%2==0) {
//				sum2 += j * (-1);
//			}
//		        sum1 += j;
//		}
//		System.out.println(sum1 + sum2);
// 해설
//		int sum = 0; // 총 합을 저장할 변수
//		int s = 1; // 값의 부호를 바꿔주는 변수
//		int num = 0; // 총 몇번 계산했는지 카운트하는 변수
//		
//		int i = 1; // while문 카운트 변수
//		
//		while(true) {
//			// 탈출조건: sum>=100
//			if(sum>=100) {
//				break;
//			}
//			num = s * i;
//			s = -s; // 짝수마다 음수 바꿔주기
//			sum = sum + num; // 누적합 (양수+음수) >= 100이면 탈출
//			i++;
//		}
//	    System.out.println("num=" + num);
//	    System.out.println("sum=" + sum);
		
// 연습문제 4-5
//	    for (int i=0; i<=10; i++) {
//	    	for (int j=0; j<=i; j++) {
//	    		System.out.print("*");
//	    	System.out.println();
//	    	}
//	    }
//	   int i=0;
//	   
//	   while(i<=10) {
//		   
//		   int j=0;
//		   while(j<=i) {
//			   System.out.print("*");
//			   j++;
//		   }
//		   System.out.println();
//		   i++;
//	   }
		
// 연습문제 4-6
//		for (int i=1; i<=6; i++) {
//			for (int j=1; j<=6; j++) {
//				if (i + j == 6) {
//					System.out.println("i="+i+" j="+j);
//				}
//			}
//		}
		
// 연습문제 4-7 [다시]
//		String str = "12345";
//	    int sum = 0;
//
//// 해설
//	    for (int i=0; i< str.length(); i++) {
//	    	sum += str.charAt(i) - '0'; // 문자를 숫자로 바꾸려면 '0'을 빼기. 아스키코드 / '1' - '0' = 1
//	    	// 디버깅하여 콘솔 찍어보고 내용 확인해보면서 하면 도움됨 
//	    	System.out.println("str.charAt(i) - 0 = " + (str.charAt(i) - '0'));
//	    }
//	    System.out.println(sum);
		
// 연습문제 4-8
//		int value = (int)(Math.random() * 6) + 1;
//		System.out.println("value: " + value);
		
// 연습문제 4-9 [다시]
//		int num = 12345;
//		int sum = 0; // 총합계산변수
//	
		// 나머지 연산자를 이용하여 계산
//        num   num/10  num%10
//        12345  1234     5
//         1234   123     4
//          123    12     3
//           12     1     2
//            1     0     1
		
//		while(num>0) {
//			// 나머지 연산 자리수 자르기
//			sum = sum + (num%10); // 5
////		    num/10 값을 반복
//			num = num / 10;
//		}
//		System.out.println("sum = " + sum);
		
// 연습문제 4-10
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0;
		int count = 0;
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.println("1과 100사이의 값을 입력하세요 : ");
		    input = s.nextInt();
		    
		    if (input > answer) {
		    	System.out.println("더 작은 수로 시작하세요.");
		    } else if (input < answer) {
		    	System.out.println("더 큰 수로 시작하세요.");
		    } else {
		        System.out.println("정답입니다.");
		        System.out.println("시도 횟수는 " + count + " 회 입니다.");
		        break;
		    }
		} while(true);
	}
}


