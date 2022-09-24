public class Calculator {
    public static void main(String[] args) {
       /* int a;
        int b;
        a = 10;
        b = 5;

        int ergebnis = a + b;

        String nameRechner = "Danny";


        System.out.println("Mein Name ist: " + nameRechner + " " + ergebnis);*/
        int ergebnisAdd = add(1,2);
        System.out.println("ergebnis = " + ergebnisAdd);
        
        int ergebnisDiv = div(5,1);
        System.out.println("ergebnis = " + ergebnisDiv);
        
        int ergebnisMul = mul(10, 50);
        System.out.println("ergebnisMul = " + ergebnisMul);
    }


    public static int add(int input1, int input2) {
        int result = input1 + input2;
        return result;
    }
    public static int sub(int a, int b) {
        int result = a - b;
        return result;
    }
    public static int mul(int a, int b) {
        int resultMul = a * b;
        return resultMul;
    }
    public static int div(int a, int b) {
        int resultDiv = a / b;
        if (b != 0) {
            return resultDiv;}
        else {
            return 0;
        }
        }


    public static int mod(int a, int b) {
        int resultMod = a % b;
        return resultMod;
    }
    //public static int ergebnis(

}
