package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * 날짜 : 2022 08 19
 * 이름 : 박진휘
 * 내용 : 코딩테스트 3-5 A+B Buffer이용하기
 */
public class _05 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine()," ");
			bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
