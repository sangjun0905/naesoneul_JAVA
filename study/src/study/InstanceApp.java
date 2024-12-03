package study;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class InstanceApp {

	public static void main(String[] args) throws IOException {
		
		PrintWriter p1 = new PrintWriter("result1.txt"); 
		// new를 이용해 새로 복제를 한 것을 변수 p1에 저장, 이때 p1은 인스턴스
		// 코드의 경량화를 위해
		p1.write("Hello 1");
		p1.close();

		PrintWriter p2 = new PrintWriter("result2.txt"); // 이때 p1은 인스턴스
		p1.write("Hello 2");
		p1.close();
	}

}
