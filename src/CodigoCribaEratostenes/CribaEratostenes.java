/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodigoCribaEratostenes;

/**
 *
 * @author sumaran
 */
public class CribaEratostenes {
    static int count=0;
     static void  Calcular( int n) {
     
        int tope = (int) Math.floor(Math.sqrt(n));

        boolean[] primos = new boolean[n + 1];

        for (int i = 2; i <= tope; i++) {
            if (primos[i] == false) {
                for (int j = i; j <= n / i; j++) {
                    primos[j * i] = true;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (primos[i] == false) {
             
                count++;
            }
        }
    }
    static int getCount() {
        return count;
    }

    
    public static void main(String[] args) {
        System.out.println("hola");
        
         Calcular(50);
         
         System.out.println(getCount());
    }
}
