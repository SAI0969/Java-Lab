class Methodoverloading {
void add() {
System.out.println("This is method overloading");
}

int add(int a, int b) {
return (a + b);
}

float add(float a, float b) {
return (a * b);
}

float add(int a, float b, int c) {
return (a + b - c);
}

public static void main(String args[]) {
Methodoverloading mo1 = new Methodoverloading();
mo1.add();
int res3 = mo1.add(5, 6);
System.out.println("Result of add(int, int): " + res3);

float res1 = mo1.add(5.6f, 3.2f);  
System.out.println("Result of add(float, float): " + res1);
float res2 = mo1.add(1, 2.6f, 3);
System.out.println("Result of add(int, float, int): " + res2);
    }
}
