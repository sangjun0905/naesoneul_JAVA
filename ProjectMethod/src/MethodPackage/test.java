package MethodPackage;

class MyClass {
    // 비정적 메서드
    public void printMessage() {
        System.out.println("Hello from instance method!");
    }
}

public class test {
    public static void main(String[] args) {
        // 객체를 생성하고 비정적 메서드 호출
        MyClass obj = new MyClass();
        obj.printMessage();  // 객체를 통해 비정적 메서드 호출
    }
}
