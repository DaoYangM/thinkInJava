package top.daoyang.holding.exercise;

import java.util.LinkedList;
import java.util.Queue;

class Command {
    private String msg;

    public Command(String msg) {
        this.msg = msg;
    }
    public void operation() {
        System.out.println(msg);
    }
}

class Generated {
    public static Queue<Command> genQueue() {
        Queue<Command> queue = new LinkedList<>();
        queue.offer(new Command("First command"));
        queue.offer(new Command("Second command"));
        queue.offer(new Command("Third command"));

        return queue;
    }
}
public class E27 {
    private static void consume(Queue<Command> commands) {
        while (commands.peek() != null) {
            Command remove = commands.remove();
            remove.operation();
        }
    }

    public static void main(String[] args) {
        consume(Generated.genQueue());
    }
}
