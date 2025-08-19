public class Invokingmethod{
void show(){
System.out.println("Method show is called");
}

void display(){
this.show();
}

public static void main(String args[]){
Invokingmethod iv1 = new Invokingmethod();
iv1.display();
}
}


