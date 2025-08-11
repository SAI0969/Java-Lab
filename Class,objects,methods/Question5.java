class Question5 {
    String name = "cyber";

    public String getName() {
        return name; 
    }

    public static void main(String args[]) {
        ReturnValue re = new ReturnValue();
        String result = re.getName(); 
        System.out.println("Name is: " + result);
    }
}
