public class Person {
    int edad;
    double altura;
    String nombre;
    String apellido;
    int id;

    public void Saludar(){
        System.out.println("Hola, soy " + nombre + " " + apellido + " y tengo: " + edad);
    }

    public  void CumplirAños(){
        edad++;
        System.out.println("Feliz cumpleaños" + edad);
    }
}

/*
*
*       Cree a PersonaUno "Franco" edad "21" altura "1.70"
*       Persona{
*           nombre =
*
*       metodo(){
*
* */