package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("%nQuantos elementos vai ter no vetor? ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double sumVect = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Digite um numero: ");
            vect[i] = sc.nextDouble();
            sumVect += vect[i];
        }

        System.out.printf("%nMEDIA DO VETOR = %.3f%n",(sumVect/vect.length));
        System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
        for (int i = 0; i < vect.length; i++) {
            if(vect[i]<(sumVect/vect.length)){
                System.out.printf("%.1f%n",vect[i]);
            }
        }

        System.out.println();

        sc.close();
    }
}
