package scraping;

import java.io.IOException;
import java.util.Arrays;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ExchangeRate {

	public static void main(String[] args) {
		
		try {
			//환율 정보를 가져올 웹 페이지 url
			String url = "https://finance.naver.com/marketindex/";
			
			//Connection 객체 생성
			Connection conn = Jsoup.connect(url);
			
			//접속 페이지의 데이터 가져오기
			Document doc = conn.get();
			//System.out.println(doc.html()); //html 보기
			
			//태그와 태그 선택자를 이용해서 데이터를 가져옴
			Elements contents = doc.select(".data_lst li");
			//System.out.println(contents);
			
			for(Element element : contents) {
				//통화(currency), 환율 비율(rate)
 				//String currency = element.select("span.blind").text();
				//slelctFirst() 함수 사용 : class 이름인 blind 중 처음 값만 필요
				
				String currency = element.selectFirst("span.blind").text();
				String rate = element.selectFirst("span.value").text();
				//System.out.println(currency + ": " + rate);
				
				//나라이름을 제외한 통화 이름만 출력 - split()
				//StreamMethodTest.java 참조
				String[] currencyName = currency.split(" ");
				//System.out.println(Arrays.toString(currencyName));
				System.out.println(currencyName[1] + ": " + rate);
				
				if(currency.equals("중국 CNY")) break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
