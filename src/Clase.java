import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Clase {
    public static void main(String[] args) {

        int dimension = readDim();
        int vec[] = new int[dimension];

        fillVector(vec);
        showVector(vec);

        ArrayList<Integer> otherVec = new ArrayList<Integer>();

        copyVectors(vec, otherVec);

        showOtherVector(otherVec);

    }
    public static int readDim(){
        System.out.println("Ingrese dimension");
        Scanner teclado = new Scanner(System.in);
        int entero = teclado.nextInt();
        return entero;
    }

    public static boolean isPrime(int numero){
        if (numero == 0 || numero == 1 || numero == 4 || numero < 0) {
            return false;
                    }
        for (int i = 2; i < numero / 2; i++) {
            if (numero % i == 0)
                return false;
        }

        return true;
    }

    public static void copyVectors(int vec[], ArrayList<Integer> otherVec){
        for (int i = 0; i < vec.length; i++) {
            if (isPrime(vec[i])){
                otherVec.add(vec[i]);
            }
        }
    }
    public static void fillVector(int vec[]){
        for (int i = 0; i < vec.length; i++) {
            vec[i]= (int) (Math.random()*99 +1);
        }
    }
    public static void showVector(int vec[]){
        System.out.println("Arreglo de numeros");
        for (int i = 0; i < vec.length-1; i++) {
            System.out.print(vec[i] + ";");
        }
        System.out.print(vec[vec.length-1]);
        System.out.println();
    }
    public static void showOtherVector(ArrayList<Integer> otherVec){
        System.out.println("Numeros primos");
        for (int i = 0; i < otherVec.size()-1; i++) {
            System.out.print(otherVec.get(i) + ";");
        }
        System.out.println(otherVec.get(otherVec.size()-1));
        System.out.println();
    }

    public static int comprobarReadDim(){
        int num = readDim();
        return num;
    }
}
