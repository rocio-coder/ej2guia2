import java.util.Scanner;

public class Ada {
    public static void main(String[] args) {

        int number;
        String answer;
        Scanner keyboard = new Scanner (System.in);

        System.out.print("ingrese el valor del numero: ");
        number = keyboard.nextInt();

        if (number>=0) {
            answer = "el numero es positivo";
        } else {
            answer = "el numero es negativo";
            System.out.printf(answer);
        }
    }
}
