package bufferedstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReadLineTest {
	
	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new FileReader("word.txt"))) {
			
			String data;
			String[] word = null;
			while((data = br.readLine()) != null) {
				//System.out.println(data);
				word = data.split(" ");
			}
			System.out.println(Arrays.toString(word));
			
			//랜덤 출력 - 주사위
			//int dice = (int) (Math.random() * 6 + 1);
			//System.out.println(dice);
			
			//랜덤 출력 - 단어
			//System.out.println(word.length);
			int rnd = (int) (Math.random() * word.length);
			System.out.println(word[rnd]);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
