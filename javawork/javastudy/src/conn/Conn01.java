package conn;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;



class Conn01 {

	public static void main(String[] args) {
		FileWriter fout = null;
		try {
			//1.주소 설정
			URL url = new URL("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EB%82%A0%EC%94%A8");
			
			//2.버퍼연결을 위한 스트림에 접근
			HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
			//바이트스트림에 접속하기위해
			
			//3.버퍼연결(8192byte)
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
			
			String input = null;
			String download = "";
			
			while((input = br.readLine()) != null) {
				download = download + input;
			}
			
			System.out.println(download);
			
			fout = new FileWriter("D:\\down\\index.html"); //파일과 연결된 출력 문자 스트림 생성
			fout.write(download); //읽은 문자열을 파일에 저장
			
			Document doc = Jsoup.parse(download);
			Elements temp = doc.select(".todaytemp");
			System.out.println("오늘의 온도는:" + temp.get(0).text());
			
			//이 파일을 index.html에 저장해라
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}