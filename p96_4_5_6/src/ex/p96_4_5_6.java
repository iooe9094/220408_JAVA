package ex;

public class p96_4_5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 연습문제 3-3
//	int num = 456;
//	System.out.println(456/100*100);
		
// 연습문제 3-4
		int numOfApples = 123;
		int sizeOfBucket = 10;
		// 나머지가 있으면 +1 없으면 0
		int numOfBucket = numOfApples / sizeOfBucket +
	                     ((numOfApples % sizeOfBucket > 0) ? 1 : 0);
		System.out.println("필요한 바구니 수 : " + numOfBucket);

// 연습문제 3-5
//		int num = 10;
		// 가독성 떨어지므로 if-else 등으로 대체하는것이 좋음
//		System.out.println(num==0 ? "0" : (num>0 ? "양수" : "음수"));
	}

}
