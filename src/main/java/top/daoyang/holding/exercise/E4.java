package top.daoyang.holding.exercise;

import java.util.ArrayList;
import java.util.List;

class Generate {
    private List<String> movies = new ArrayList<>();
    private int count;

    public Generate() {
        count = 0;
        movies.add("Snow White");
        movies.add("Star Wars");
        movies.add("Dark Knight");
        movies.add("Interstellar");
    }

    String next() {
        if (count == movies.size() - 1)
            count = 0;
        return movies.get(count++);
    }
}
public class E4 {

    public static void main(String[] args) {
        List<String> aL = new ArrayList<>();
        Generate generate = new Generate();
        for (int i = 0; i < 10; i++) {
            aL.add(generate.next());
        }

        System.out.println(aL);
    }
}
