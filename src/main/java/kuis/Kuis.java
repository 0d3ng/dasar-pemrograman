package kuis;

public class Kuis {
    public static void main(String[] args) {
        //increment
        int a = 4, b = 5, c, d;
        System.out.println("a: " + (a++ + b));
        c = --a * b--;
        System.out.println("b: " + (c + ++a));
        d = b % 2;
        System.out.println("c: " + d);

//        assigment
        double e = 9, f = 10, g = 2, h;
        f += e;
        System.out.println("d: " + f++);
        g *= e--;
        System.out.println("e: " + g);
        h = --g;
        System.out.println("f: " + h);

//        assigment and relation
        long l = 9, i = 10, j = 10;
        System.out.println("g: " + (j > i && l > j || i == j || l <= j));
        System.out.println("h: " + (i != j && l < i && i <= j && l < j));

//        bitwise
        int x = 3, y = 6;
        System.out.println("i: " + (x & y));
        System.out.println("j: " + (x ^ y));
        System.out.println("k: " + ((x ^ y) | (x & y)));
    }
}
