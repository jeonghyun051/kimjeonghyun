package login;


//����ڰ� �α����� �� -> ���̽���, ���̹�
public class LoginApp {

	static void userinfo(OAuth o) {
		System.out.println(o.oauthProvider()+"�� �α����� ����ڴ�...");
		System.out.println(o.oauthid());
		System.out.println(o.oauthPassword());
		System.out.println(o.oauthNick());
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facebook f = new Facebook();
		userinfo(f);
		Naver n = new Naver();
		userinfo(n);
		kakao k = new kakao();
		userinfo(k);
		
	}
}
