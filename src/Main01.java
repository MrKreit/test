public class Main01 {
  public static void main(String[] args) {
    Human h1 = new Human();
    // h1 objektnaja peremennaja
    // operator sozdania objekta
    // (vydelenie pamjati)
    h1.name = "Marsel";
    h1.age = 29;

    Human h2 = new Human();
    h2.name = "Roman";
    h2.age = 45;

    System.out.println("Age of " + h1.name + " is " + h1.age);// Ctrl + D
    System.out.println("Age of " + h2.name + " is " + h2.age);

    h1.sayHello();
    h2.sayHello();

  }

}