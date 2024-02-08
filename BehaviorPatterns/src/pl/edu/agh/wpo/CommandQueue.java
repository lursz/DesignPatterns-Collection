package pl.edu.agh.wpo;

import java.util.*;

public class CommandQueue {

    interface Command {
        void execute();
    }

    class GarbageCollector implements Command {
        public void execute() {
            System.out.println("Garbage out");
        }
    }

    class WorkingThread implements Command {
        public void execute() {
            System.out.println("WorkingThread executed");
        }
    }

    class DBCommand implements Command {
        public void execute() {
            System.out.println("DBCommand executed");
        }
    }

    public List produceRequests() {
        List queue = new ArrayList();
        queue.add(new GarbageCollector());
        queue.add(new DBCommand());
        queue.add(new GarbageCollector());
        return queue;
    }

    public static void workOffRequests(List queue) {
        for (Iterator it = queue.iterator(); it.hasNext(); )
            ((Command) it.next()).execute();
    }

    public static void main(String[] args) {
        CommandQueue cq = new CommandQueue();
        List queue = cq.produceRequests();
        workOffRequests(queue);
    }
}
