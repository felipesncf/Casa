/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

import javax.swing.JOptionPane;

/**
 *
 * @author pioca_000
 */
public class Casa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cond casa = new cond();
        
        casa.setDono(JOptionPane.showInputDialog("Informe o nome do(a) dono(a) da casa: "));
        
        casa.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Informe o numero da casa: ")));
        
        casa.setQuantMoradores(Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de moradores da casa: ")));
        
        JOptionPane.showMessageDialog(null,"O nome do(a) dono(a) da casa eh: " +casa.getDono());
        JOptionPane.showMessageDialog(null, "O numero da casa eh: " +casa.getNumero());
        JOptionPane.showMessageDialog(null, "A quantidade de moradores da casa eh: " +casa.getQuantMoradores());
        
        
    }
    
}
