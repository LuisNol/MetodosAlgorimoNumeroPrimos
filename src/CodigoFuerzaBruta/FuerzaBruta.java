/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodigoFuerzaBruta;

/**
 *
 * @author sumaran
 */
public class FuerzaBruta {
     static int cantidad = 0;

    static void primo(int n) {
        cantidad = 0;
        for (int i = 1; i < n; i++) {
            int cont = 0;
            for (int j = 1; j < n; j++) {
                if (i % j == 0) {
                    cont++;
                }
            }
            if (cont == 2) {//aqui salen los numeros primos
                cantidad++;
            }
        }
    }
    static public int getCantidad() {
        return cantidad;
    }
    
    public static void main(String[] args) {
        primo(50);
        System.out.println(getCantidad());
       
    }
}
