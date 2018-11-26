package top.daoyang.reusing;

class Amphibian {
    public void eat() {
        System.out.println("Amphibian eat");
    }   
}
public class Frog extends Amphibian {
    public static void main(String[] args) {
        Amphibian a = new Frog();
        a.eat();   
    }

    public void eat() {
        System.out.println("Frog eat");
    }
} 