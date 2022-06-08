package br.edu.univas;

public class Questao02 {
    public static void main(String[] args) {
        String asterisco = "**********";
        for(int i = 10; i > 0; i--){
            System.out.println(asterisco.substring(0, i));
        }
    }
}
