/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidade;
import java.util.Scanner;

/**
 *
 * @author Vinicius Correa
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = teclado.nextLine();
        System.out.println("Digite o ano que nasceu:");
        int nasc = teclado.nextInt();
        int idade = 2021 - nasc;
        if (idade>=18){
            System.out.println("Você é maior de idade");
        }else{
            System.out.println("Você é menor de idade");
        }
    }
    
}
