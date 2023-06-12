import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Aula33 {
    public static void main(String[] args) {
        String produto = JOptionPane.showInputDialog("Nome produto:");
        Double valor   = Double.parseDouble(JOptionPane.showInputDialog("Valor:"));
        //calcular 110% de lucro à prazo e 70% para à vista
        Double vlrPrazo = valor+(valor*1.1);
        Double vlrVista = valor+(valor*0.7);
        DecimalFormat df = new DecimalFormat("##,###.00");

       int op = Integer.parseInt(JOptionPane.showInputDialog("Visualizar Dados:\n1 - Valor Informado\n2 - Valor à prazo\n3 - Valor à Vista"));
       switch (op) {
        case 1:
            JOptionPane.showMessageDialog(null, "Valor: R$"+df.format(valor));
            break;
        case 2:
            JOptionPane.showMessageDialog(null, "Valor: R$"+df.format(vlrPrazo));
            break;
        case 3:
        JOptionPane.showMessageDialog(null, "Valor: R$"+df.format(vlrVista));
        break;
        default:
            JOptionPane.showMessageDialog(null, "Opção Inválida!!!");
            break;
       }

    }
}
