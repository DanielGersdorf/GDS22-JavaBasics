import java.sql.SQLOutput;

public class ArithmetischeOperationen {
    public static void main(String[] args) {

        //deklarieren und initialisieren der Variablen
        int a = 100;
        int b = 40;



        System.out.println(a + " + " + b + " = " + (a+b)) ;
        System.out.println(a + " - " + b + " = " + (a-b)) ;
        System.out.println(a + " * " + b + " = " + (a*b)) ;

        //dividieren
        System.out.println(a + " / " + b + " = " + (a/ (1.0 * b)));
        System.out.println(a + " % " + b + " = " + (a%b)) ;

        //a++
        System.out.println("a++");
        //ich erwarte mir 3
        System.out.println(a++);
        System.out.println("a = " + a);

        //++b
        System.out.println("++b");
        System.out.println(++b);
        System.out.println("b =" + ++b);

        String test1 = new String("Hallo");
        String test2 = new String("Hallo");
        boolean sameValue = test1.equals(test2);
        System.out.println(sameValue);



    }
}
