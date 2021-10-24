/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring;

/**
 *
 * @author Vinicius Correa
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 ="Gustavo";
        String nome2 ="Gustavo";
        String nome3 = new String("Gustavo");
        String res;
        res = (nome1.equals(nome3))?"Igual":"diferente"; // .equals verifica se um conteúdo de um objeto é o mesmo que o outro.
        //.equals serve para qualquer uma wrapper class
        System.out.println(res);
    }
    
}
