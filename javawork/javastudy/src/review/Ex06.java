package review;

public class Ex06 {

	public static void main(String[] args) {
		int n1 = 100;
		
		//이유 : 작은 데이터가 큰 공간에 들어가는 것이기 때문에
		double n2 = n1; //업 캐스팅 (묵시적 형변환)
		
		
		//이유 : 큰 데이터가 작은 공간에 들어가는 것이기 때문에 다운 캐스팅이 필요
		//특징 : 내 데이터가 유실될 수 있음
		double n3 = 10.5;
		int n4 = (int)n3; //다운 캐스팅(명시적 형변환) 
		
		int a1 = 300;
		double a2 = 400;
		
		
		System.out.println(n4);
		
	}

}
