package com.ict.edu02;

public class Ex01 {
	// Stream(스트림) : 데이터를 목적지까지 입력, 출력하기 위한 방법
	// 1) 스트림에서 데이터를 쓰는 경우 => 출력스트림
	// 2) 스트림에서 데이터를 읽는 경우 => 입력스트림
	
	// 스트림의 종류 : 바이트스트림, 문자스트림, 바이트-문자스트림 결합, 오브젝트 스트림
	// 1. 바이트 스트림(기계 중심) : 모든 처리를 1byte씩 처리
	//					   대상 : 1byte 이루어진 모든 파일 (영상, 소리, 사진 등 모든 파일을 말한다. 영문자포함)
	//			  최상위 스트림 : InputStream(입력), OutputStream(출력)
	
	// 2. 문자 스트림(사람 중심) : 모든 처리를 2byte씩 처리
	// 				  		대상 : 세계의 모든 언어로 구성된 문서 파일을 입출력할 때 사용
	//			   최상위 스트림 : Reader(입력), Writer(출력)
	
	// 3. 바이트 - 문자스트림 결합 : 기계를 통해 입/ 출력한 정보를 사람이 사용할 수 있도록 입/ 출력
	//			   최상위 클래스 : InputStreamReader(입력), OutputStreamWriter(출력)
	
	// 4. 오브젝트 스트림 : 객체를 직렬화한 후 객체 단위로 입/ 출력
	// 			     해당 클래스 : ObjectInputStream(readObject() : 객체 직렬화), ObjectOutputStream(writerObject() : 객체 역직렬화)
}
