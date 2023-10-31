import javax.security.sasl.SaslClient;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Person personaUno = new Person();

        personaUno.altura = 1.70;
        personaUno.nombre = "Franco";
        personaUno.edad = 21;
        personaUno.apellido = "Villarroel";

        personaUno.Saludar();

        /// Llegamos al cumpleaños de franco y ahora tiene 22;
        personaUno.CumplirAños();

    }
}