package oop;

class Print { //class 내부 메서드를 비정적으로 선언하는 경우 정적 메인 메서드에서 참조하기 위해 객체에 담아야 함
	public String delimiter =""; // (인스턴스) 객체 상태로서 값 저장
	public Print(String delimiter) { // 생성자를 통한 초기화
		this.delimiter = delimiter; 
	} // 객체 생성시에 값을 한 번 생성하여 여러 메서드에서 호출 가능
	public void A() {  //클래스 내부 메서드를 정적으로 선언하면 정적 메인 메서드에서 클래스의 정적 메서드를 다이렉트로 쓸 수 있음
		System.out.println(delimiter); 
		System.out.println("A");
	}
	
	public void B() {
		System.out.println(delimiter);
		System.out.println("B");
	}
}
// this는 현재 객체(인스턴스)를 참조하는 키워드
/* 클래스명과 같은 이름의 메서드를 반환타입 없이 선언함으로써 생성자 생성
 * 객체 생성 시 자동으로 생성자가 호출된다.
 * 생성자를 사용하는 이유는 인스턴스 생성 시 초기 값을 지정하기 위함.
 */
