package MethodPackage;

/* static O -> class method
 * static X -> instance method
 */



/*
 * 정적 메서드는 클래스 레벨에서 작동하므로, 클래스 레벨 멤버(정적 멤버)에만 직접 접근 가능.
 * 비정적 멤버를 사용하려면 객체 생성 후 참조.
 * 메서드 내부에서 새롭게 정의하는 변수나 객체는 정적일 필요가 없음.
 * */

class Printf{
	public String delimiter;
	
	public /*static*/ void a(){
		System.out.println(this.delimiter);
		System.out.println("a");
	}
	
	public /*static*/ void b(){
		System.out.println(this.delimiter);
		System.out.println("b");	
	}
	
	public static void c(String delimiter) {
		System.out.println(delimiter);
		System.out.println("c");
	}

}


public class staticMethod {

	static Printf istnce1 = new Printf();
	static Printf istnce2 = new Printf();
	
	public static void main(String[] args) {
		/* Print.a("-")
		 * Print.b("-")    -> class의 method
		 */
		
		istnce1.delimiter = "-";
		istnce1.a();                            // -> instance의 method이므로 static 제거 필요
		istnce1.b();
		
		istnce2.delimiter = "*";
		istnce2.a();
		istnce2.b();
		
		Printf.c("#");
		
		Printf istnce3 = new Printf();
		istnce3.delimiter = "@";
		istnce3.a();
		
	}
	
}
