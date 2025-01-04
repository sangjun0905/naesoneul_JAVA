package inheritance;


class Cal{
    int v1,v2;
    Cal(int v1, int v2){
        System.out.println("Cal init!!");
        this.v1 = v1; this.v2 = v2;
    }
    public int sum(){return this.v1+v2;}
}

// Cal3 override Cal -> 부모 클래스의 메서드를 재정의 했다
// overloading -> 같은 이름의 메서드를 매개변수의 개수나 타입을 다르게 해여 여러개 정의하는 것

class Cal3 extends Cal{ //상속받은 클래스의 부모가 생성자가 있다면 자식 클래스는 반드시 부모 생성자를 실행시켜야 한다.
    Cal3(int v1, int v2) { //cal3의 생성자 생성
    	super(v1,v2); // super -> 부모 클래스의 생성자 생성
        System.out.println("Cal3 init!!");
        
    }
    public int minus(){return this.v1-v2;}
}


public class InheritanceApp {
    public static void main(String[] args) {
    	Cal c = new Cal(2,1);
        Cal3 c3 = new Cal3(2, 1);
        System.out.println(c3.sum()); // 3
        System.out.println(c3.minus()); // 1
    }
}