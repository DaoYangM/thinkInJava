package top.daoyang.interfaces.classprocessor.interfaces;


import top.daoyang.interfaces.classprocessor.Apply;

import java.util.Arrays;

class Upcase extends StringProcessor {
    @Override
    public Object process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class Downcase extends StringProcessor {
    @Override
    public Object process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter extends StringProcessor {
    @Override
    public Object process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}

public abstract class StringProcessor implements Processor {
    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public abstract Object process(Object object);

    public static void process(Processor p, Object s) {
        System.out.println("Using Processors " + p.name());
        System.out.println(p.process(s));
    }

    public static void main(String[] args) {
        StringProcessor.process(new Upcase(), Apply.s);
        StringProcessor.process(new Downcase(), Apply.s);
    }
}
