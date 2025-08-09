class Art {
    int a, b;

    void asmd() {
        System.out.println("Add: " + (a + b));
        System.out.println("Sub: " + (a - b));
        System.out.println("Mul: " + (a * b));
        System.out.println("Div: " + ((double) a / b));
    }

    void asmd1(int a, int b) {
        System.out.println("Add: " + (a + b));
        System.out.println("Sub: " + (a - b));
        System.out.println("Mul: " + (a * b));
        System.out.println("Div: " + ((double) a / b));
    }

    int asmd2() {
        return a + b;
    }

    int asmd3(int a, int b) {
        return a + b;
    }
}

class Question2 {
    public static void main(String args[]) {
        Art a1 = new Art();

        a1.a = 15;
        a1.b = 30;

        a1.asmd();

        a1.asmd1(15, 59);

        int res1 = a1.asmd2();
        System.out.println("Result from asmd2: " + res1);

        int res2 = a1.asmd3(15, 59);
        System.out.println("Result from asmd3: " + res2);
    }
}
