import javax.lang.model.SourceVersion;

public class MyMethodsDemo {
    public static void main(String[] args) {
        printHallo();
        String msg = "Was geht ab?";
        printMessage(msg);
        int one = giveMeOne();
        System.out.println(one);
        System.out.println(giveMeOne());

        int result = add( 2, 3);
        System.out.println(result);
        System.out.println(add( 5 , 6));

        System.out.println(add(2, giveMeOne()));

    }

    /**
     * schreibe Hallo auf die Kommandozeile
     */
    public static void printHallo() {
        System.out.println("Hallo");
    }

    /**
     * schrteibe die nachticht auf die konsole
     * @param message
     */
    public static void printMessage(String message) {
        System.out.println("message = " + message);

    }
    //Gib mir immer 1 retour
    public static int giveMeOne() {
        return 1;

    }
    public static int add(int a, int b) {
        int result = a + b;
        return result;
        // oder return a + b;  ergebnis wird nicht zwischen gespeichert (andere möglichkeit)

    }
}
