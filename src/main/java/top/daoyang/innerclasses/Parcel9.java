package top.daoyang.innerclasses;

public class Parcel9 {

    private String i;
    public Destination destination(final String dest) {
        return new Destination() {
            private String label = i;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        p.destination("Tasmania");
    }
}
