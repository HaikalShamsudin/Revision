package ClassAndConstructors;

class Product {
    String color = null;
    Product () {}
    Product (Product p) {
        this.color = p.color;
    }
}

public class q24Udemy {
    
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.color = "white";
        Product p2 = new Product(p1);
        System.out.println(p1.color + ":" + p2.color);
    }
}
