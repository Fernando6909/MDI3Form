/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio1;

/**
 *
 * @author Fernando Alves
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainPage mpage = new MainPage();
                mpage.setTitle("SISTEMA REGES");
                mpage.setLocationRelativeTo(null);
                mpage.setVisible(true);
            }
        });
    }
    
}
