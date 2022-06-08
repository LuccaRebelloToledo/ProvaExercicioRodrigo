package br.edu.univas;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[25];
        int aux = 0;

        for(int i = 0; i < numbers.length; i++){
            aux = scanner.nextInt();
            if(aux < 0){
                numbers[i] = 0;
            } else {
                numbers[i] = aux;
            }
        }
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]);
            if(i == numbers.length - 1) break;
            System.out.print(" - ");
        }
    }
}
