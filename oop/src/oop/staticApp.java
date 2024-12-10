package oop;

class Foo{
	public static String classVar = " Class Var";
	public String instanceVar = "instance Var";
	
	public static void classMethod() {
		System.out.println(classVar); // possible
		// System.out.println(instanceVar); // error 정적 클래스 메서드에서 비정적 변수를 이용하려 했기 때문
	}
	
	public void instanceMethod() {
		System.out.println(classVar); // possible
		System.out.println(instanceVar); // possible 비정적 인스턴스 메서드에서 비정적 변수를 이용하려 했기 때문
	}
	
}

public class staticApp {
	
	public static void main(String[] args) {
		System.out.println(Foo.classVar);
		// System.out.println(Foo.instanceVar); 불가
		
		Foo istnce = new Foo(); // instance 복제 시 클래스 변수와 메서드는 본체 클래스의 변수와 메서드를 가리킬 뿐
								// instance 복제 시 인스턴스 변수와 메서드는 별개의 복제 생성
		
//		System.out.println(istnce.instanceVar); //비정적 변수를 이용하기 위해 클래스를 객체에 담아 사용
//		System.out.println(istnce.classVar);
		
		istnce.classVar = "인스턴스로 접근해서 변경 가능";
		System.out.println(Foo.classVar); // 변경된 class 본체 변수 출력
	}

}


/* 요약
 * instance new 생성 시 원조 클래스의 non static 인스턴스 메서드와 변수들은 복제되어 별개로 존재
 * instance new 생성 시 원조 클래스의 static 메서드와 변수들은 원조 클래스에 소속된 것들을 가리킨다(별도X)
 * -> 인스턴스로 접근하여 클래스 소속의 static 메서드, 변수를 제어할 수 있다. -> 모든 자녀 인스턴스의 클래스 메서드, 변수들이 바뀜
 * 
 * */
