package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {
		// String의 주요 메소드
		String str = "ICT인재개발원 제 2 강의장";

		// 1. charAt(int index) : char
		// 위치정보가 숫자로 들어오면 해당 위치에 글자를 반환한다.
		char c1 = str.charAt(5);
		System.out.println(c1);

		// 모두 대문자로 만들자 (대문자와 소문자의 차이는 32 이다)
		String str2 = "대한민국 I Love You 123";
		for (int i = 0; i < str2.length(); i++) {
			char c2 = str2.charAt(i);
			// 소문자 찾기
			if (c2 >= 'a' && c2 <= 'z') {
				c2 = (char) (c2 - 32);
			}
			System.out.print(c2);
		}
		System.out.println();

		// 2. concat(String str): String
		// 들어온 문자열을 현재 문자열과 합친다.
		String str3 = "대한민국";
		String str4 = "KOREA";
		String result = str3.concat(str4);
		System.out.println(result);
		System.out.println(str3 + str4);
		System.out.println("==================================");

		// 3. equals(Object anObject): boolean
		// 들어온 문자열과 현재 문자열과 같으면 true, 다르면 false (대소문자 구별)
		// 4. equalsIgnoreCase(String anotherString): boolean
		// 들어온 문자열과 현재 문자열과 같으면 true, 다르면 false (대소문자 구별 없음)
		String str5 = "Korea";
		String str6 = "KOREA";
		if (str5.equals(str6)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		System.out.println("==================================");
		if (str5.equalsIgnoreCase(str6)) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
		System.out.println("==================================");

		// 5. format(String format, Object... args)
		// 형식을 지정하고 형식에 맞춰 생성
		String str7 = "ICT 인재 개발원";
		String res = str7.format("%s", str7);
		System.out.println(res);
		System.out.println("==================================");

		// 남는 자리는 비어둔다.
		res = String.format("%25s", str7);
		System.out.println(res);
		System.out.println("==================================");

		// 모자른 자리는 상관하지 않음.
		res = String.format("%6s", str7);
		System.out.println(res);
		System.out.println("==================================");

		// 6. getBytes(): byte[]
		// 해당 문자열을 byte[] 로 변환시킨다.
		// 보통 입출력 할 때 사용한다. (대소문자, 숫자, 영어 이외의 글자는 안됨)
		String str8 = "java";
		byte[] b = str8.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + "\t");
		}
		System.out.println();
		// 반대로 해당 byte[]를 문자열로 만들어 보자
		String str9 = new String(b);
		System.out.println(str8);

		// 7. indexOf(int ch), indexOf(String str):
		// char 나 String이 들어오면 해당 문자열의 char 나 String의 위치값을 알려준다.
		// 찾는 문자나 문자열이 없으면 -1
		String str10 = "BufferedReader";

		// 'r' 의 위치값을 찾아라
		int k1 = str10.indexOf('r');
		System.out.println(k1);

		k1 = str10.indexOf('k');
		System.out.println(k1);
		
		k1 = str10.indexOf("er");
		System.out.println(k1);
		
		// 7. indexOf(int ch, int fromIndex), indexOf(String str, int fromIndex):
		// 여기서 int fromIndex란 시작위치를 말한다.
		// 2번째, 3번째 문자나 글자를 찾기 위함이다.
		
		// 위에서 'r'의 위치값은 5이다. 6부터 다시 'r'을 찾으면 두번째 'r'를 찾을 수 있다.
		k1 = str10.indexOf('r', 6);
		System.out.println(k1);
		
		k1 = str10.indexOf('r', str10.indexOf('r') + 1);
		System.out.println(k1);
		
		k1 = str10.indexOf("er", str10.indexOf("er") + 1);
		System.out.println(k1);
		
		// 8. lastIndexOf(int ch), lastIndexOf(String str): int
		// 마지막 문자나 문자열을 찾을 때 사용
		k1 = str10.lastIndexOf('d');
		System.out.println(k1);
		
		k1 = str10.lastIndexOf("er");
		System.out.println(k1);
		
		// 9. length(): int => 1번부터 (index가 아님)
		// 해당 문자열의 길이를 구해준다. (for문에 많이 사용된다.)
		String str11 = "abc123def456gh677";
		k1 = str11.length();
		System.out.println("길이: " + k1);
		
		// 10. replace(char oldChar, char newChar), replace(String oldstr, String newstr) : String
		// 새로운 문자나 문자열을 받아서 치환하기
		String str12 = "대한민국";
		String str13 = str12.replace("대한민국", "Korea");
		System.out.println(str12);
		System.out.println(str13);
		str12 = str12.replace("대한민국", "대 ★ 한 ★ 민 ★ 국");
		System.out.println(str12);
		
		
	}

}



















