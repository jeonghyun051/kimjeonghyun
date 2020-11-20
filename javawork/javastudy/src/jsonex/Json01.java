package jsonex;

import com.google.gson.Gson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
class Comment{
	private int id;
	private String content;
}

public class Json01 {

	public static void main(String[] args) {
		Comment ct1 = new Comment(2,"댓글");
		//자바 -> json 타입이 string
		Gson gson = new Gson();
		String ct1Json = gson.toJson(ct1);
		System.out.println(ct1Json);
		
		//json 스트링을 -> 자바
		Comment ct2 = gson.fromJson(ct1Json, Comment.class);
		System.out.println(ct2.getId());
		System.out.println(ct2.getContent());
	}
}
