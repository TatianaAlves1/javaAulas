import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Aula03 {
    public static void main(String[] args) {
        UIManager.put("OptionPane.yesButtonText","Sim");
        UIManager.put("OptionPane.noButtonText","Não");
        double total=0; 
        double valor;
        int    cont = 1;
        int    i = 0;

        while (i==0) {
            try {
                valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota de nº "+cont+":"));
            if (valor<0 || valor>10) {
                JOptionPane.showMessageDialog(null, "Número Inválido!!!");
                continue;
            }else{            
                total += valor;
                cont++;
                i = JOptionPane.showConfirmDialog(null, "Inserir nova nota?", "Verificação", 0);
            }    
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Falha ao inserir dados\n"+e);
            }
            
        }
        DecimalFormat df = new DecimalFormat("#,##.00");
        double media = total/(cont-1);
        JOptionPane.showMessageDialog(null, "A soma das notas é: "+total);
        JOptionPane.showMessageDialog(null, "A média final é: "+df.format(media));
    }
}

