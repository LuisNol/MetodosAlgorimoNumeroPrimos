/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodigoCribaSumaran;

/**
 *
 * @author sumaran
 */
public class CribaSumaran {
    static int cont = 0;
    static void Calculo(int n) {
       cont=4;
      
        for (int i = 10; i < n; i++) {
            if ((ultimCifra("" + i) == 7 || ultimCifra("" + i) == 1 || ultimCifra("" + i) == 3 || ultimCifra("" + i) == 9) && ((i % 7 != 0) || (i % 3 != 0))) {//
                if (esPrimo(i)) {
                    cont++;
                    
                }
                // si pones el test de fermat, igual funciona
                // se esta creando un nuveo algoritmo basado en el el patron de los cuatro

            }
        }
        
    }

  static int getCont() {
        return cont;
    }
  static boolean esPrimo(int num) {
        boolean primo = (num == 1) ? false : true;
        int divisor = 2;
        while (primo && divisor <= Math.sqrt(num)) {
            if (num % divisor == 0) {
                primo = false;
            }
            divisor++;
        }
        return primo;
    }
  
    static int ultimCifra(String numeros) {
        return numeros.charAt(numeros.length() - 1) - 48;
    }
    
    public static void main(String[] args) {
        Calculo(50);
        System.out.println(getCont());
    }
}
