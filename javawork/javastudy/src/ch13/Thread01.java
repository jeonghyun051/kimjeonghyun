package ch13;

//class Another extends Thread 를 쓰거나 밑에거를 쓰거나
class Another implements Runnable { //Runnable 타입이 되어야 함. run을 강제성 run만 만들면됨
	
	//실행단위 코드블록 = 스택(스레드)
	@Override
	public void run() {
		System.out.println("새로운 스레드 실행됨");
		for (int i = 1; i < 11; i++) {
			try {
				System.out.println("run : " + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("새로운 스레드 종료");
	}
}

public class Thread01 {

	public static void main(String[] args) {
		
		System.out.println("main 스레드 실행됨");
		
		//새로운 스레드 실행
		//규칙 1. 스레드 객체만들기
//		Thread t1 = new Thread();
		
		//규칙 2. 타겟 설정
		Thread t1 = new Thread(new Another());
		//규칙 3. 실행
		t1.start();
		
		for (int i = 1; i < 11; i++) {
			try {
				System.out.println("main : " + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("main 스레드 종료");
	} //end of main()
}
