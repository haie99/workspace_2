/*
 * 입력스트림 처리는 파일에 국한된 기술이 아니다
 * 즉 실행중인 프로그램으로 데이터가 흘러들어온다며, 이 모든 것이 입력스트림이다
 * 따라서 이 예제 에서는 파일을 대상으로 데이터를 읽는 것이 아니라, 키보드를 대상으로
 * 데이터를 읽어와 보자
 * 주의) 파일과는 달리 키보드의 스트림은 자바에서 생성할 수 있는 것이 아니라,
 * 		이미  OS차원에서 스트림이 존재하므로, 자바는 단지 이미 존재하는 스트림을 얻어왔을 뿐이다
 * */

package day1102.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class KeyBoardInputApp {
	public static void main(String[] args){
		//키보든 이미 시스템적으로 존재하므로, 자바의 System클래스로부터 얻자
		InputStream is = System.in;//표준 입력 스트림(키보드, 기타 입력도구에 대한 스트림)
		InputStreamReader reader = new InputStreamReader(is);
	
		int data;
		try {
			while(true) {
				data = reader.read();//한 바이트 읽기, read()의 특징, 입력이 완료되지 않으면
				//무한 대기 상태로 머물러 있음
				//즉, 입력이 되어야 read()메서드 이후의 문장이 수행 될 수 있다.
				System.out.print((char)data);				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println();//표준 출력 스트림

	}

}
