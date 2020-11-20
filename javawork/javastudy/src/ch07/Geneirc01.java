package ch07;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
class ResponseDto<T>{
	private int statusCode; // 200(����), 300(�ٽÿ�û), 400(�߸��ȿ�û) �� ������
	private T data;
	
}

class Dog{
	
	private String name = "d";
}

public class Geneirc01 {

	public static void main(String[] args) {
	
		ResponseDto dto = new ResponseDto() ;
			dto.setStatusCode(200);
			dto.setData("���");
			dto.setData(new Dog());
			
			Object b = new Dog();
			Dog dd = (Dog)b;
			System.out.println(dd.name);
			
			System.out.println(dto.getStatusCode());
			
			if(dto.getStatusCode()==200) {
				System.out.println(dto.getStatusCode());
			}

		
	}

}
