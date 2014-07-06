/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import javax.swing.JOptionPane;

/**
 *
 * @author Douglas
 */
public class Mensagem {
    String titulo,msg;

    public Mensagem(String titulo, String msg) {
        this.titulo = titulo;
        this.msg = msg;
    }
    public void sucesso(){
        JOptionPane.showMessageDialog(null, this.titulo+" cadastrado com sucesso:\n"+this.msg, this.titulo, JOptionPane.PLAIN_MESSAGE);
    }
    public void erro(){
        JOptionPane.showMessageDialog(null, "Falha: "+this.msg, this.titulo, JOptionPane.ERROR_MESSAGE);
    }

}
