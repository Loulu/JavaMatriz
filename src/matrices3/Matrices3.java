/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices3;

/**
 *
 * @author AULAC
 */
import java.util.*;

public class Matrices3 {

    public static Scanner sc = new Scanner(System.in);

    public static int[][] rellenarmatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println("Dame valor");
                m[i][j] = sc.nextInt();
            }
        }
        return m;

    }

    public static void mostrarmatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]);
            }
            System.out.println("");
        }
    }

    public static void mostrarDiagonal(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i == j) {
                    System.out.println(m[i][j] + " ");
                }
            }
        }
    }

    public static void mostrarDiagonalSecundaria(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (j == m.length - 1 - i) {
                    System.out.println(m[i][j] + " ");
                }
            }

        }
    }

    public static void matrizIdentidad(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            m[i][i] = 1;
        }
    }

    public static boolean esCuadrada(int[][] m) {
        return m.length == m[0].length;
    }

    public static boolean esTraspuesta(int[][] m) {
        boolean t = true;
        for (int i = 0; i < m.length && t; i++) {
            for (int j = 0; j < m[i].length && t; j++) {
                if (m[i][j] == m[j][i]) {
                    t = true;
                } else {
                    t = false;
                }
            }
        }
        return t;
    }

    public static boolean esSimetrica(int[][] m) {
        boolean t = esTraspuesta(m);
        if (t == true && esCuadrada(m)) {

            System.out.println("Es Simetrica");

        } else {
            t = false;
            System.out.println("No es");
        }
        return t;
    }

    public static void randomMatriz(int[][] m) {
        Random r = new Random();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = r.nextInt(9);
            }
        }
    }

    public static void simetricaMatriz(int[][] m) {
        Random r = new Random();
        boolean t = esSimetrica(m);
        do {
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    m[i][j] = r.nextInt(9);
                }
            }
        }while (t==true);
    }

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        simetricaMatriz(matriz);
        mostrarmatriz(matriz);
    }

}
