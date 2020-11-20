package sms;

public class Response {

	String group_id;
	String error_list;
	String success_count;
	String error_count;
	
	public static void main(String[] args) {
		String data = "{\"group_id\":\"R2GfqgY3SfNA0BnD\",\"error_list\":{\"1\":\"1049\"},\"success_count\":0,\"error_count\":1}";
	
		Response res = new Response();
		
		str.substring(data.indexOf("{"),data.lastIndexOf("}"));
		
		
//		System.out.println(data);
//		
//		String a = data.substring(32);
//		System.out.println(a);
//		System.out.println();
//		
//		
//		String[] s = a.split(":");
//		for (int i = 0; i < s.length; i++) {
//			System.out.println(s[i]);
//			
//		}
//		
		System.out.println();
//		
//		char b = a.charAt(0);
//		System.out.println(b);
	}
	
}
