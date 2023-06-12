
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class App {
    public static void main(String[] args) throws Exception {
        //Janela simples
        JOptionPane.showMessageDialog(null, "Olá, segunda aula");
        // //Janela com outros dados
        JOptionPane.showMessageDialog(null, "Segundo Teste", "Aula 02 - Java", 2);
        //Entrada de dados
        UIManager.put("OptionPane.cancelButtonText", "Cancelar");
        UIManager.put("OptionPane.okButtonText", "Enviar");
        UIManager.put("OptionPane.yesButtonText", "Sim");
        String nome = JOptionPane.showInputDialog(null, "Qual o seu nome?");
        JOptionPane.showMessageDialog(null, "Bem-vindo(a), "+nome);
        double num = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o Preço:"));
        DecimalFormat df = new DecimalFormat("#.##");
        num = num/7;
        JOptionPane.showMessageDialog(null, "Foi informado"+df.format(num));        
        String op = JOptionPane.showInputDialog(null, "1 - Java\n2- Python");
        op = op.toLowerCase();
        if (op.equals("1") || op.equals("java")) {
            JOptionPane.showMessageDialog(null, "Boa Escolha");
        } else {
            JOptionPane.showMessageDialog(null, "estude Mais");
        }

        int i =  JOptionPane.showConfirmDialog(null, "Você quer ir ?", "Pergunta de S ou N", 1);
        if (i==1){
            JOptionPane.showMessageDialog(null, "Esse foi 1");
        }else if(i==0){
            JOptionPane.showMessageDialog(null, "Esse foi 1");
        }else if(i==2){
            JOptionPane.showMessageDialog(null, "Esse foi 2");
        }else{
            JOptionPane.showMessageDialog(null, "Esse não sei");
        }
    }
}
