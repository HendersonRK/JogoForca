/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jogoforca;

public class JogoForca {

    public static void main(String[] args) {

        String palavras[] = new String[15];
        char letrasErradas[] = new char [7];
        String palavra = "";
        int numeroSorteado = 0;
        int numeroLetras = 0;
        int jogadas = 6;
        int cont = 0;
        char letraDigitada = ' ';

        palavras[0] = "cachorro";
        palavras[1] = "carro";
        palavras[2] = "laranja";
        palavras[3] = "limao";
        palavras[4] = "bergamota";
        palavras[5] = "grama";
        palavras[6] = "beliche";
        palavras[7] = "televisao";
        palavras[8] = "computador";
        palavras[9] = "caneta";
        palavras[10] = "borracha";
        palavras[11] = "pneu";
        palavras[12] = "bicicleta";
        palavras[13] = "parede";
        palavras[14] = "chapeu";

        numeroSorteado = (int) (Math.random() * (14 - 0) + 0);

        palavra = palavras[numeroSorteado];
        numeroLetras = palavra.length();

        char letrasPalavra[] = new char[numeroLetras];

        //verificação
        //System.out.println(palavra);
        //System.out.println(numeroLetras);
        for (int i = 0; i < numeroLetras; i++) {
            letrasPalavra[i] = '_';
        }

        //verificação   
        System.out.println("Palavra oculta");
        for (int i = 0; i < numeroLetras; i++) {
            System.out.print(letrasPalavra[i] + " ");
        }

        while (cont <= jogadas) {
            letraDigitada = Entrada.leiaChar("Digite uma letra: ");

            for (int j = 0; j < numeroLetras; j++) {
                
                if (letraDigitada == palavra.charAt(j)) {
                    letrasPalavra[j] = letraDigitada;
                    cont--;
                    
                    System.out.println("\nPlacar atual");

                    for (int i = 0; i < numeroLetras; i++) {
                        System.out.print(letrasPalavra[i] + " ");
                    }
                }
            }

            /*System.out.println("\nPlacar atual");

            for (int j = 0; j < numeroLetras; j++) {
                System.out.print(letrasPalavra[j] + " ");
            }*/
            cont++;
        }
        System.exit(0);
    }
}