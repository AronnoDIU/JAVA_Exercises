package ControlStatements;

// Using continue with a label.
public class ContinueLabel {

    public static void main(String[] args) {

        Outer:
        for (var i = 0; i < 10; i++) {
            for (var j = 0; j < 10; j++) {
                if (j > i) {
                    System.out.println();
                    continue Outer;
                }
                System.out.print(" " + (i * j));
            }
        }
        System.out.println();

    }

}

/*Expected Output::

 0
 0 1
 0 2 4
 0 3 6 9
 0 4 8 12 16
 0 5 10 15 20 25
 0 6 12 18 24 30 36
 0 7 14 21 28 35 42 49
 0 8 16 24 32 40 48 56 64
 0 9 18 27 36 45 54 63 72 81

* */