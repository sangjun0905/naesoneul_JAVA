package oop;

import java.io.FileWriter;
import java.io.IOException;
// static class들을 import 해서 메인 메서드 내부의 비정적 객체에 담아

public class othersOOP {

	public static void main(String[] args) throws IOException {
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.1));
		
		FileWriter f1 = new FileWriter("data.txt");
		f1.write("Hello");
		f1.write(" sjava");
		f1.close();
		
		FileWriter f2 = new FileWriter("data.txt");
		f2.write("Hello");
		f2.write(" sangjun ");
		f2.close();
		
		
		
	}

}
