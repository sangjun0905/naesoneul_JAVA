package oop;

class Print { //class 내부 메서드를 비정적으로 선언하는 경우 정적 메인 메서드에서 참조하기 위해 객체에 담아야 함
	public void A(String delimiter) {  //클래스 내부 메서드를 정적으로 선언하면 정적 메인 메서드에서 클래스의 정적 메서드를 다이렉트로 쓸 수 있음
		System.out.println(delimiter); 
		System.out.println("A");
	}
	
	public void B(String delimiter) {
		System.out.println(delimiter);
		System.out.println("B");
	}
}