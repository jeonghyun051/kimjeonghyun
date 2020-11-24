package ch07;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
class ResponseDto<T>{
	private int statusCode; // 200(성공), 300(다시요청), 400(잘못된요청) 이 들어오면
	private T data;
	
}

class Dog{
	
	private String name = "d";
}

public class Geneirc01 {

	public static void main(String[] args) {
	
		ResponseDto<Integer> dto = new ResponseDto() ;
			dto.setStatusCode(200);
			dto.setData(1);
			
			System.out.println(Integer.getInteger());
			
			System.out.println(dto.getStatusCode());
			
			if(dto.getStatusCode()==200) {
				System.out.println(dto.getStatusCode());
			}

		
	}

}
