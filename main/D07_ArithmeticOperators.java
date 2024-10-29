package main;

/**
 * Arithmetic Operators
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D07_ArithmeticOperators {

  public static void main(String[] args) {

    int a, b, c;

    a = 5;
    b = 3;

    /* Addition */
    c = a + b;
    System.out.println(a + " + " + b + " = " + c); // STR."\{a} + \{b} = \{c}"

    /* Subtraktion */
    c = a - b;
    System.out.println(a + " - " + b + " = " + c); // STR."\{a} - \{b} = \{c}"

    /* Multiplikation */
    c = a * b;
    System.out.println(a + " * " + b + " = " + c); // STR."\{a} * \{b} = \{c}"

    /* Ganzzahlige Division */
    c = a / b; // Quotient
    System.out.println(a + " / " + b + " = " + c); // STR."\{a} / \{b} = \{c}"
    c = a % b; // Divisionsrest (Modulo)
    System.out.println(a + " % " + b + " = " + c); // STR."\{a} % \{b} = \{c}"

    /* Division */
    double d = (double) a / b;
    System.out.println((double) a + " / " + b + " = " + d); // STR."\{(double) a} / \{b} = \{d}"

    /* Inkrementieren */
    c = 0;
    c = c + 1;
    c += 1; // c = c + 1;
    c++;
    System.out.println("c: " + c);

    /* Dekrementieren */
    c = c - 1;
    c -= 1; // c = c - 1;
    c--;
    System.out.println("c: " + c);

    /* Postinkrementieren vs. Preinkrementieren */
    c = a++;
    System.out.println("a: " + a);
    System.out.println("c: " + c);

    c = ++a;
    System.out.println("a: " + a);
    System.out.println("c: " + c);

    /* Teilen durch Null */
    d = 1.0 / 0.0;
    System.out.println("d: " + d); // Infinity
    d = 1.0 / -0.0;
    System.out.println("d: " + d); // -Infinity

    d = 0.0 / 0.0;
    System.out.println("d: " + d); // NaN
    d = 0.0 / -0.0;
    System.out.println("d: " + d); // NaN

    d = 1 / 0;
    System.out.println("d: " + d); // Arithmetic Exception
    d = 1 / -0;
    System.out.println("d: " + d); // Arithmetic Exception

  }

}
