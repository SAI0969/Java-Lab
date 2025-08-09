class Book{
  int id ;
  String name;
  double price

  Book(int id, string name, double price){
    this.id = id;
    this.name = name;
    this.price = price;

    System.out.println(this.id + " " + this.name + " " + this.price);
  }
}

class Question1{
  public static void main(String args[]){
    Book b1 = new Book(101, "SK", 152.36);
  }
}
