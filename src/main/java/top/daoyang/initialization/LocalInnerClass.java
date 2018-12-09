package top.daoyang.initialization;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface Counters {
    int next();
}

public class LocalInnerClass {
    private int count = 0;

    Counters getCounters(String name) {
        class LocalCounters implements Counters {
            public int next() {
                System.out.print(name);
                return count++;
            }
        }
        return new LocalCounters();
    }

    Counters getCounters2(final String name) {
        return new Counters() {
            {
                System.out.println("Counters init block mock constructor");
            }

            public int next() {
                System.out.print(name);
                return count++;
            }
        };
    }

    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Counters
                c1 = lic.getCounters("Local inner "),
                c2 = lic.getCounters2("Anonymous inner ");

        for (int i = 0; i < 6; i++) {
            System.out.println(c1.next());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(c2.next());
        }
    }
}
