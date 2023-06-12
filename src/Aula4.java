import javax.swing.JOptionPane;

public class Aula4 {
    public static void main(String[] args) {
        String[] op = {"Horários","Telefones","Endereços","E-mails"};

        int i = JOptionPane.showOptionDialog(null, "Escolha", "Menu", 1, 1, null, op, op[1]);
        System.out.println(i);


    }
}
