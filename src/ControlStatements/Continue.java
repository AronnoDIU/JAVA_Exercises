package ControlStatements;


// Demonstrate continue.
public class Continue {

    public static void main(String[] args) {

        for (var i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0)
                continue;
            System.out.println();
        }

    }

}


/*Expected Output::

0 1
2 3
4 5
6 7
8 9

* */