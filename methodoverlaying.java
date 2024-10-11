class P {
    public void property() {
        System.out.println("Gold|Land|Cash");
    }

    public void marry() {
        System.out.println("Parent method: appalamma|Subbalakshmi");
    }
}

class C extends P {
    @Override
    public void marry() {
        System.out.println("Child method: katrina");
    }
}

public class Test {
    public static void main(String[] args) {
        P p = new P();
        p.marry(); // "Parent method: appalamma|Subbalakshmi"

        C c = new C();
        c.marry(); // "Child method: katrina"

        P p1 = new C();
        p1.marry(); // "Child method: katrina"
    }
}
