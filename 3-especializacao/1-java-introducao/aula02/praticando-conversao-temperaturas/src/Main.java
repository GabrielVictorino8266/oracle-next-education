import javax.sound.midi.SysexMessage;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Ola, bem-vindoa o conversor de Temperatura.");

        double celsius = (double) 15.00;
        System.out.println("Temperatura em Celsius: " + celsius + "C");

        double fahrenheit = (double) (celsius * 1.8) + 32;
        System.out.println("Temperatura Fahrenheit: " + fahrenheit + "F");
    }
}