/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.futuro;

/**
 *
 * @author Rafa Illescas Nieves ha realizado este ejercicio
 */
public class ProyectoFuturo {

    /**
     * @param args the command line arguments
     */
   
    static String veredicto(String valor1, String valor2){
        if (valor1.equals(valor2)) {
        return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
        }
        if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
        return "Poco tiempo de estudio. Debes dedicar más tiempo.";
        }
        return "Ideal. Trabajas los contenidos en casa.";
        }

        public static void main(String [] args){
        System.out.println("Estudiante = "+args[0]);
        System.out.println(veredicto(args[1],args[2]));

}

}
