package Lessons.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // 2. Testa er hypotes
        // queueDemo();

        // 4. Välj en bättre datastruktur
        // hastSet();

        // 5. Liten förändring, stor skillnad
        tryListColection();
    }

    private static void tryListColection() {
        List<Integer> points = new ArrayList<>();

        points.add(10);
        points.add(22222);
        points.add(568);
        points.add(1);
        points.add(6555555);
        points.add(5);

        System.out.println(points);

        Collections.sort(points);

        System.out.println("This is after soring");
        System.out.println(points);
    };

    public static void queueDemo() {
        Queue<String> ko = new LinkedList<>();

        ko.offer("Thai");
        ko.offer("Kim");
        ko.offer("Alex");
        ko.offer("Buu");

        System.out.println(ko.peek()); // kim, alex, kim

        System.out.println(ko.poll()); // result => null, alex, kim

        System.out.println(ko.size()); // returnerar antal element i collection: result 2

        System.out.println(ko); // skriver ut => null, alex, kim
    }

    public static void hastSet() {
        Set<String> mebers = new HashSet<>();

        mebers.add("buu");
        mebers.add("tee");
        mebers.add("bläää");
        mebers.add("bläää"); // Ignoreras automatiskt

        System.out.println(mebers);
    }

}
