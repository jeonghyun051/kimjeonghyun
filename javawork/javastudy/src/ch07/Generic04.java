package ch07;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
class Error {
	private String msg;
}

@AllArgsConstructor
@Data
class User {
	private int id;
	private String username;
}

@AllArgsConstructor
@Data
// T는 클래스 옆에 사용 
class RespDto<T> {
	private int code; // 200(정상), 400(실패)
	private T data;
}




public class Generic04 {
	
	//함수를 호출할때 ? 리턴타입
	static RespDto<?> getData(String username) {
		if(username.equals("ssar")) {
			RespDto<User> dto = new RespDto(200, new User(1, "ssar"));
			return dto;
		}else {
			RespDto<Error> dto = new RespDto(400, new Error("아이디가 틀렸습니다."));
			return dto;
		}
	}
	
	public static void main(String[] args) {
		//데이터가 유저인지 에러인지 모르니까 RespDto<?> 를 사용
		RespDto<?> dto = getData("ssar2");
		System.out.println(dto.getCode());
		System.out.println(dto.getData());
	}
}


