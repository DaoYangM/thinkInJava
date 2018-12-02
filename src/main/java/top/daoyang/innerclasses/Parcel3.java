package top.daoyang.innerclasses;

public class Parcel3 {
    private class Contents {
        private int i = 11;
        public int value() {
            return i;
        }
    }
    private class Destination {
        private String label;
        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    public static void main(String[] args) {
        Parcel3 parcel3 = new Parcel3();
        Parcel3.Contents c= parcel3.new Contents();
        Parcel3.Destination d = parcel3.new Destination("Tasmania");
    }
}
