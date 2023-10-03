import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class MonedayTiempo {
    public static void main(String[] args) {

        Object[] options = { "Convertir Monedas", "Conversor de Temperatura", "Salir" };
        int choice = JOptionPane.showOptionDialog(null, "Que Quieres hacer?", "Convertir",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        if (choice == 2) {
            JOptionPane.showMessageDialog(null, "Programa Cerrado");
            System.exit(0);
        }
        if (choice == 0) {
            DecimalFormat FormatearDecimal = new DecimalFormat("#.##");
            boolean continuarPrograma = true;
            while (continuarPrograma) {
                String[] opciones = { "Pesos Colombianos a Euros", "Pesos Colombianos a Dólares", "Pesos Colombianos a Libras Esterlinas", "Pesos Colombianos a Yen",
                        "Pesos Colombianos a Won" };
                String cambio = (String) JOptionPane.showInputDialog(null, "Elija una opción:",
                        "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                String input = JOptionPane.showInputDialog("Ingrese la cantidad en Pesos Colombianos: ");
                double Pesos;
                try {
                    Pesos = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no válido.");
                    return;
                }

                if (cambio.equals("Pesos Colombianos a Dólares")) {
                    double dollars = Pesos  / 4.225;
                    JOptionPane.showMessageDialog(null,
                            Pesos  + " Pesos Colombianos son " + FormatearDecimal.format(dollars) + " dólares.");
                } else if (cambio.equals("Pesos Colombianos a Euros")) {
                    double euros = Pesos  / 4.424;
                    JOptionPane.showMessageDialog(null, Pesos  + " Pesos Colombianos son " + euros + " euros.");
                } else if (cambio.equals("Pesos Colombianos a Libras Esterlinas")) {
                    double pounds = Pesos  / 4.92;
                    JOptionPane.showMessageDialog(null,
                            Pesos  + " Pesos Colombianos son " + pounds + " libras esterlinas.");
                } else if (cambio.equals("Pesos Colombianos a Yen")) {
                    double yen = Pesos / 0.03;
                    JOptionPane.showMessageDialog(null, Pesos  + " Pesos Colombianos son " + yen + " yenes japoneses.");
                } else if (cambio.equals("Pesos Colombianos a Won")) {
                    double won = Pesos  / 0.0027;
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
        if (choice == 1) {

            Boolean SeguirPrograma = true;
            while (SeguirPrograma) {

                String[] opciones = { "Celsius a Fahrenheit", "Fahrenheit a Celsius" };
                int opcion = JOptionPane.showOptionDialog(null, "Elige una opción de conversión:",
                        "Convertidor de Temperatura", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                        null, opciones, opciones[0]);

                String valorStr = JOptionPane.showInputDialog("Ingresa el valor a convertir: ");

                double valor = 0;
                try {
                    valor = Double.parseDouble(valorStr);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no válido");
                    System.exit(0);
                }

                double resultado = 0;
                if (opcion == 0) {
                    resultado = (valor * 9 / 5) + 32;
                    JOptionPane.showMessageDialog(null,
                            valor + " grados Celsius son " + resultado + " grados Fahrenheit");
                } else if (opcion == 1) {
                    resultado = (valor - 32) * 5 / 9;
                    JOptionPane.showMessageDialog(null,
                            valor + " grados Fahrenheit son " + resultado + " grados Celsius");
                }

                int continuar = JOptionPane.showConfirmDialog(null, "¿Deseas continuar usando el programa?", "",
                        JOptionPane.YES_NO_CANCEL_OPTION);
                if (continuar == JOptionPane.NO_OPTION || continuar == JOptionPane.CANCEL_OPTION) {
                    SeguirPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");

                }
            }

        }

    }
}
