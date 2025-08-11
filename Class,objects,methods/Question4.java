public class Question4 {

    void compare(int a, int b) {
        if (a > b) {
            System.out.println(a + " is greater");
        } 
        
        else if (a < b) {
            System.out.println(b + " is greater");
        } 
        
        else {
            System.out.println("Both integers are equal");
        }
    }

    void compare(char a, char b) {
        if (a > b) {
            System.out.println("'" + a + "' is greater");
        } 
        
        else if (a < b) {
            System.out.println("'" + b + "' is greater");
        } 
        
        else {
            System.out.println("Both characters are equal");
        }
    }

    void compare(String a, String b) {
        int result = a.compareTo(b);
        if (result > 0) {
            System.out.println("\"" + a + "\" is greater");
        } 
          
        else if (result < 0) {
            System.out.println("\"" + b + "\" is greater");
        } 
          
        else {
            System.out.println("Both strings are equal");
        }
    }

    public static void main(String[] args) {
        CompareValues obj = new CompareValues();

        obj.compare(10, 20);

        obj.compare('A', 'C');

        obj.compare("Apple", "Banana");
    }
}
