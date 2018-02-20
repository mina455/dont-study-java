package basicClass_20;

import java.util.StringTokenizer;

class TokenizeString {
	public static void main(String[] args) {
		String strData = "11:22:33:44:55";
		StringTokenizer st = new StringTokenizer(strData, ":");

		/**
		 * 구분자를 기준으로 나뉘어지는 문자열 정보 : 토큰 (token)
		 *
		 * hasMoreTokens()
		 * 반환할 토큰이 남아있는가?
		 */
		while (st.hasMoreTokens())
			System.out.println(st.nextToken());
	}

}
