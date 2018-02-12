package consoleInputAndOutput_12;

import java.io.*;

public class PastReadInt {
	public static void main(String[] args) {
		try {
			// System.in -> 콘솔의 입력을 의미
			/*InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);*/
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("정수 입력 : ");

			String str = br.readLine();

			//str에 저장된 문자열 데이터를 정수로 변환하기 위한 메소드 호출
			int num = Integer.parseInt(str);

			System.out.println("입력된 정수 : " + num);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
