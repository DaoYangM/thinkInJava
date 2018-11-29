package top.daoyang.interfaces.classprocessor;

import java.util.Arrays;

class Processors {
    public String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input) {
        return input;
    }
}

class Upcase extends Processors {
    @Override
    Object process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class Downcase extends Processors {
    @Override
    Object process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter extends Processors {
    @Override
    Object process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}

public class Apply {
    public static void process(Processors p, Object s) {
        System.out.println("Using Processors " + p.name());
        System.out.println(p.process(s));
    }

    public static String s = "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
    }
}
