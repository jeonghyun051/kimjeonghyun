package ch03;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //()생성자 호출
		//Scanner를 이용하면 I/O장치에 접근 가능!!
		int num = sc.nextInt(); //블락킹 입력받은값을 num에 넣음
		
		System.out.println("입력받은 값 :" + num);		
	}
}
//시분할 - 스레드
//i/o - 효과적

//cpu는 동기적으로 하나씩 처리한다

//스레드(분신)을 만든다 - 비동기적으로 처리 가능
//시분할해서 작동한다(눈이 동시에 실행되는것처럼 보일수 있음) 단점:문맥교환 때문에 시간이 더 걸림(스위칭)

//최신프로그램은 스레드를 안쓰고
//동기적으로 실행하는데 cpu는 i/o가 끝날때까지 기다려야하는데
//스레드를 하나로 비동기적 사용 -> 