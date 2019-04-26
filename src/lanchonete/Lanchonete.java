package lanchonete;

import javax.swing.JOptionPane;

public class Lanchonete {

    public static void main(String[] args) {
        try {
            ConexaoBanco con = new ConexaoBanco();
            con.conectar();
            JOptionPane.showMessageDialog(null, "Conectou");
            con.desconectar();
            JOptionPane.showMessageDialog(null, "desconectou");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
