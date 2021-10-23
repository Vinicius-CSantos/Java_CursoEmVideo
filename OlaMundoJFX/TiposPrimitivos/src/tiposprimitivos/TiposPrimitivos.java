/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

/**
 *
 * @author Vinicius Correa
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float nota = 8.5f;
        String nome = "Vinicius";
        System.out.println(" A nota é " + nota);
        System.out.printf(" A nota de %s é %.2f \n ",nome, nota);
        System.out.format("A nota de %s é %.2f \n", nome, nota);
    }
}
