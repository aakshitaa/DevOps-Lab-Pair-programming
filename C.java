import java.lang.Thread;
//code by aakshita
class A extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("from thread A: " + i);
            System.out.println("exit from A");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("from thread B: " + i);
            System.out.println("exit from B");
        }
    }
}
//code added by Shivam Kumar
class C {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.start();
        b.start();
    }
}
