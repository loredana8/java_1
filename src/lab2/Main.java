package lab2;

public class Main {
    static float memberVariable1 = 45;

    public static void main(String[] args) {
        printName(" Loredana ");
        int sum = 4 + 5;
        int ii = substract (40, 10 );
        float iii = multiplication(3,5);
        float iiii = divide (3f, 2f );
        int average  = sum (10, 4, 4) / 3;
        int modulo = modulo (13, 10 );
        float Celsius = divide (5f, 9f);
        float InchMeters = multiplication (20f, 0.0254f );




        System.out.println("Rezultatul adunarii este:" + sum );
        System.out.println("Rezultatul scarderii este:"+ ii);
        System.out.println("Rezultatul inmultirii este:" +iii);
        System.out.println("Rezultatul impartiiri este:" + iiii);

        printJavaExecutive1();

        System.out.println("Media celor 3 numere este:"+ average );
        System.out.println("Restul impartirii a doua numere este:" + modulo);
        System.out.println ( "Temperatura in grade celsius este:" + ( Celsius *(memberVariable1-32f)) );
        System.out.println("Inch to meters conversion is:" + InchMeters + " m" );

    }


    public static int sum(int first, int second){
        int sum = first + second;
        return sum;
    }

    public static int substract( int fisrt, int second){
        int result = fisrt - second ;
        return result;

    }

    public static float multiplication (float first, float second) {
       float result = first * second;
        return result;
    }

    public static float divide (float first, float second) {
        float result = first / second;
        return result;
    }


    public static void printJavaExecutive1(){
        System.out.println("     j     a    v     v   a ");
        System.out.println("     J    a a    v   v   a  a ");
        System.out.println(" J   J   aaaaa    v v   aaaaa ");
        System.out.println("  JJ    a     a    v   a     a");

    }
    public static int sum (int first, int second, int third){
        int sum = first + second + third;
        return sum;
    }
    public static void printName(String name ){
        System.out.println("Hello"  + name );
    }
    public static int modulo (int first, int second){
        int result = first % second;
        return result;
    }





    }
    



