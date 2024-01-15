/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package daw;

/**
 *
 * @author noelia
 */
public class main {

    public static void main(String[] args) {
        Cancion c1 = new Cancion("Los del espacio", "Lit Killah", 180);
        Cancion c2 = new Cancion("Adios", "epico", 167);
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
