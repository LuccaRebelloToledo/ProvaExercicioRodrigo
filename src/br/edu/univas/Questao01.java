package br.edu.univas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        int contadorCriancas = 0, contadorAdolescentes = 0, contadorAdultos = 0, contadorIdosos = 0, totalPessoas = 0;
        int[] idade = new int[20];
        int aux = 0;
        float porcentagemCriancas = 0f, porcentagemAdolescentes = 0f, porcentagemAdultos = 0f, porcentagemIdosos = 0f;
        do {

            for (int i = 0; i < idade.length; i++) {
                System.out.print("Por favor digite sua idade: ");
                aux = scanner.nextInt();
                if (aux == -1) break;
                else {
                    idade[i] = aux;
                }

                if(idade[i] < 13){
                    contadorCriancas++;
                } else if (idade[i] < 18){
                    contadorAdolescentes++;
                } else if(idade[i] < 61){
                    contadorAdultos++;
                } else {
                    contadorIdosos++;
                }
                totalPessoas = contadorCriancas + contadorAdolescentes + contadorAdultos + contadorIdosos;
                porcentagemCriancas = ((contadorCriancas * 100.0f) / totalPessoas);
                porcentagemAdolescentes = ((contadorAdolescentes * 100.0f) / totalPessoas);
                porcentagemAdultos = ((contadorAdultos * 100.0f) / totalPessoas);
                porcentagemIdosos = ((contadorIdosos * 100.0f) / totalPessoas);
            }

        } while(aux != -1);
        System.out.println("O total de pessoas são: " + totalPessoas + " entre elas estão: ");
        System.out.println("Há " + contadorCriancas + " criança(s) e a porcentagem é: " + df.format(porcentagemCriancas) + "%");
        System.out.println("Há " + contadorAdolescentes + " adolescente(s) e a porcentagem é: " + df.format(porcentagemAdolescentes) + "%");
        System.out.println("Há " + contadorAdultos + " adulto(s) e a porcentagem é: " + df.format(porcentagemAdultos) + "%");
        System.out.println("Há " + contadorIdosos + " idoso(s) e a porcentagem é: " + df.format(porcentagemIdosos) + "%");
    }
}
