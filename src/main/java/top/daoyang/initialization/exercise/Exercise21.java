package top.daoyang.initialization.exercise;

enum DanWei {
    GE, SHI, BAI, QIANG, WANG, YI 
}

public class Exercise21 {
    public static void main(String[] args) {

        DanWei ge = DanWei.GE;
        switch(ge) {
            case SHI: System.out.println("SHi");
            case GE: System.out.println("GE");
            case BAI: System.out.println("BAI");
            default: System.out.println("default");
        }   
    }
}
