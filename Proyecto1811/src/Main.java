import edu.codoacoda.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //El gobierno de la Ciudad de Buenos Aires necesita implementar un control de covid en un encuentro de programadores.
        // Para esto necesita pedir la temperatura de cada persona, el nombre y dni.
        // El resultado del control debe listar a todas las personas que ingresaron (temperatura menor a 37 grados)
        // y también listar las personas que no pudieron ingresar, indicando un mensaje que fue derivado a un hospital.
        // Calcular el número de personas que ingresaron y el número de personas que no ingresar por presentar síntomas de covid.
        // Para la implementacion, crear una clase Persona, crear un ArrayList de personas.
        // La clase Persona debe estar definida dentro de un paquete que se llame java.covid.


        ArrayList<Persona> controlTemperatura = new ArrayList<>();

//

//        controlTemperatura.add(new Persona("nombre1","apellido1",36666888,37.2));
//        controlTemperatura.add(new Persona("nombre2","apellido2",40666444,38.6));
//        controlTemperatura.add(new Persona("nombre3","apellido3",26321489,36.5));
//        controlTemperatura.add(new Persona("nombre4","apellido4",21888452,39.4));
//        controlTemperatura.add(new Persona("nombre5","apellido5",39518230,35.9));
//        controlTemperatura.add(new Persona("nombre6","apellido6",42982453,37.9));
//
//        Persona persona = new Persona("persona1","persona",25694187,36.8);


        addPersonas(controlTemperatura);

        listarPersonas(controlTemperatura);

        contarPersonas(controlTemperatura);

    }

    static void addPersonas(ArrayList<Persona> personas){

        Scanner entrada = new Scanner(System.in);
        int continuar = 0;
        do {

            System.out.println("INGRESE NOMBRE:");
            String nombre = entrada.next();

            System.out.println("INGRESE APELLIDO:");
            String apellido = entrada.next();

            System.out.println("INGRESE DNI:");
            int dni = entrada.nextInt();

            System.out.println("INGRESE TEMPERATURA:");
            double temperatura = entrada.nextDouble();

            System.out.println("DESEA CONTINUAR? SI[0] / NO [1]");
            continuar = entrada.nextInt();

            Persona p = new Persona(nombre,apellido,dni,temperatura);

            personas.add(p);

        } while (continuar == 0);
    }


    static void listarPersonas(ArrayList<Persona> personas){
        for (Persona p:personas) {
            if (p.getTemperatura()<37.5){
                System.out.println(p.toString());
            }else{
                System.out.println(p.toString() + " DERIVADO A HOSPITAL");
            }
        }
    }

    static void contarPersonas(ArrayList<Persona> personas){
        int temperaturaBaja = 0;
        int temperaturaAlta = 0;
        for (Persona p:personas) {
            if (p.getTemperatura()<37.5){
                temperaturaBaja++;
            }else{
                temperaturaAlta++;
            }
        }
        System.out.println(temperaturaBaja);
        System.out.println(temperaturaAlta + " DERIVADOS A HOSPITAL");
    }

}