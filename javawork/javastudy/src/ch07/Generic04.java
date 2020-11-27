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
// T�� Ŭ���� ���� ��� 
class RespDto<T> {
	private int code; // 200(����), 400(����)
	private T data;
}




public class Generic04 {
	
	//�Լ��� ȣ���Ҷ� ? ����Ÿ��
	static RespDto<?> getData(String username) {
		if(username.equals("ssar")) {
			RespDto<User> dto = new RespDto(200, new User(1, "ssar"));
			return dto;
		}else {
			RespDto<Error> dto = new RespDto(400, new Error("���̵� Ʋ�Ƚ��ϴ�."));
			return dto;
		}
	}
	
	public static void main(String[] args) {
		//�����Ͱ� �������� �������� �𸣴ϱ� RespDto<?> �� ���
		RespDto<?> dto = getData("ssar2");
		System.out.println(dto.getCode());
		System.out.println(dto.getData());
	}
}


