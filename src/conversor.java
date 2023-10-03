import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class conversor {

    public static void main(String[] args) {

        boolean continuarPrograma = true;

        while (continuarPrograma) {

            String[] options = { "Pesos Colombianos a Euros", "Pesos Colombianos a Dólares", "Pesos Colombianos a Libras Esterlinas", "Pesos Colombianos a Yen",
                    "Pesos Colombianos a Won" };
            String choice = (String) JOptionPane.showInputDialog(null, "Elija una opción:",
                    "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            String input = JOptionPane.showInputDialog("Ingrese la cantidad en Pesos Colombianos: ");
            double Pesos;
            try {
                Pesos = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor no válido.");
                return;
            }
            DecimalFormat FormatearDecimal = new DecimalFormat("#.##");

            if (choice.equals("Pesos Colombianos a Dólares")) {
                double dollars = Pesos / 4.162;
                JOptionPane.showMessageDialog(null,
                        Pesos + " Pesos Colombianos son " + FormatearDecimal.format(dollars) + " dólares.");
            } else if (choice.equals("Pesos Colombianos a Euros")) {
                double euros = Pesos  / 4.424;
                JOptionPane.showMessageDialog(null, Pesos  + " Pesos Colombianos son " + euros + " euros.");
            } else if (choice.equals("Pesos Colombianos a Libras Esterlinas")) {
                double pounds = Pesos  / 4.92;
                JOptionPane.showMessageDialog(null, Pesos  + " Pesos Colombianos son " + pounds + " libras esterlinas.");
            } else if (choice.equals("Pesos Colombianos a Yen")) {
                double yen = Pesos  / 0.03;
                JOptionPane.showMessageDialog(null, Pesos  + " Pesos Colombianos son " + yen + " yenes japoneses.");
            } else if (choice.equals("Pesos Colombianos a Won")) {
                double won = Pesos / 0.0027;
                JOptionPane.showMessageDialog(null, Pesos + " Pesos Colombianos son " + won + " wones surcoreanos.");
            }
            
            int confirm = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Confirmar",
                    JOptionPane.YES_NO_CANCEL_OPTION);
            if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION) {
                continuarPrograma = false;
                JOptionPane.showMessageDialog(null, "Programa Finalizado");
            }
        }

    }
}