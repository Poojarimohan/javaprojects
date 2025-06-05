
package abc;

class A1 {
    void eat() {
        System.out.println("All animals eat food");
    }
}

class D2 extends A1 {
    void sound() {
        System.out.println("Dog sounds as bow bow");
    }
}

class C1 extends A1 {
    void sound() {
        System.out.println("Cat sounds as meow meow");
    }
}

public class InheritanceEx {
    public static void main(String[] args) {
        D2 d = new D2();
        C1 c = new C1();

        d.sound();
        d.eat();

        c.sound();
        c.eat();
    }
}
