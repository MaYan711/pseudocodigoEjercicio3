import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fac = 1, num;
        System.out.println("Ingrese el numero");
        num = sc.nextInt();

        for (int i = 2; i <= num; i++) {
            fac= fac*i;
        }
        System.out.println("El factorial de " + num + " es: " + fac);
    }
}