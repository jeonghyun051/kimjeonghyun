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
			//1.�ּ� ����
			URL url = new URL("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EB%82%A0%EC%94%A8");
			
			//2.���ۿ����� ���� ��Ʈ���� ����
			HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
			//����Ʈ��Ʈ���� �����ϱ�����
			
			//3.���ۿ���(8192byte)
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
			
			String input = null;
			String download = "";
			
			while((input = br.readLine()) != null) {
				download = download + input;
			}
			
			System.out.println(download);
			
			fout = new FileWriter("D:\\down\\index.html"); //���ϰ� ����� ��� ���� ��Ʈ�� ����
			fout.write(download); //���� ���ڿ��� ���Ͽ� ����
			
			Document doc = Jsoup.parse(download);
			Elements temp = doc.select(".todaytemp");
			System.out.println("������ �µ���:" + temp.get(0).text());
			
			//�� ������ index.html�� �����ض�
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}