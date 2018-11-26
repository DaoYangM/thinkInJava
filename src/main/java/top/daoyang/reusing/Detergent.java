package top.daoyang.reusing;

class Cleanser {
    private String s = "Cleanser ";
    
    public void append(String a) { s += a;}
    public void dilute() { append("dilute() "); }
    public void apply() { append("apply() "); }
    public void scrub() { append("scrub() "); }

    @Override
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute(); x.apply(); x.scrub(); 
    }
}
public class Detergent extends Cleanser {
    
    public void scrub() {
        append("Delergent.scrub() ");
        super.scrub();
    }
    
    public void foam() { append("foam() ");}

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        // x.apply();
        // x.scrub();
        // x.foam();
        System.out.println(x);
        // System.out.println("Testing base class;");
        // Cleanser.main(args);
    }
}

class NDetergent extends Detergent {
    @Override
    public void scrub() {
        System.out.println("NDetergent scrub");
        super.scrub();
    }

    public void sterilize() {
        append("sterilize() ");
    }

    @Override
    public void append(String a) {
        System.out.println("123");
    }    

    public static void main(String[] args) {
        NDetergent x = new NDetergent();
        x.scrub();
        System.out.println(x);
    }
}