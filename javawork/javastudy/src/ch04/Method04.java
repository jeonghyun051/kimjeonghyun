package ch04;

//ctrl+shift+f 정렬
//메서드 안에 매서드를 정의할 수 없다.
//변수에 메서드를 담을 수 없다.
public class Method04 {

	int money=10000; //heap
	
	int add(int num) {// int num 은stack , add() 함수는 heap에 있음
		int money2 = money + num;
		return money2;  //return 순수하게 값을 변경해주는거 순수하게  void 상태를 변화시키는거
	}

	public static void main(String[] args) {
		
		Method04 m = new Method04(); //메모리에 떳음 힙공간에 뜸
		int money2=m.add(50000);
		System.out.println(money2); 
		System.out.println(m.money);
		
	}

}
