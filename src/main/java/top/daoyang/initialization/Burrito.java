package top.daoyang.initialization;

public class Burrito {
    Spiciness degree;
    
    public Burrito(Spiciness spiciness) {
        this.degree = spiciness;
    }

    public void describe() {
        System.out.print("This  burrito is ");
        switch(degree) {
            case NOT:   System.out.println("not spicy at all.");
                        break;
            case MILD:
            case MEDIUM:System.out.println("a little hot");
                        break;
            case HOT:
            case FLAMING:
            default:    System.out.println("maybe too hot.");
        }
    }

    public static void main(String[] args) {
        Burrito
            plain = new Burrito(Spiciness.HOT),
            greenChile = new Burrito(Spiciness.MEDIUM),
            jalapeno = new Burrito(Spiciness.HOT);
        
        plain.describe();
        greenChile.describe();
        jalapeno.describe();
    }
}