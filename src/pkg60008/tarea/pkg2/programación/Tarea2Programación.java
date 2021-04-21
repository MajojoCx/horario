/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg60008.tarea.pkg2.programación;

import java.util.Scanner;

/**
 *
 * @author 60008
 */
public class Tarea2Programación {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una hora, y te dire tu horario");
        int hora = entrada.nextInt();
        
        if(hora >= 1 && hora <= 24){
            if(hora == 6){
                System.out.println("Despertar a las " + hora + "am");
            } else if(hora == 7){
                System.out.println("Entrar a clase a las " + hora + "am");
            } else if(hora >= 8 && hora < 10){
                System.out.println("Entrar a la siguiente clase desde las 8 am hasta las 10 am");
            } else if(hora >= 10 && hora < 12){
                System.out.println("Entrar a la siguiente clase desde las 10 am hasta las 12 am");
            } else if(hora == 12){
                System.out.println("Entrar a la siguiente clase a las " + hora + " pm");
            } else if(hora >= 13 && hora < 15){
                System.out.println("Almorzar Estudiar y hacer tarea Desde la 1 pm hasta a las 3 pm");
            } else if(hora == 15){
                System.out.println("Descansar un rato desde las 3 pm");
            } else if(hora >= 16 && hora < 18 ){
                System.out.println("Ir a trabajar a las 4 pm");
            } else if(hora >= 18 && hora < 20){
                System.out.println("Ayudar en la cocina del trabajo desde las 6 de la tarde hasta las 8 de la noche");
            } else if(hora == 20){
                System.out.println("Cenar a partir de las 8 de la noche");
            } else if(hora >= 21 && hora < 23){
                System.out.println("Dos horas con muchos clientes desde las 9 de la noche, hasta salir a las 11 de la noche");
            } else if((hora >= 23 && hora <= 24) || (hora >= 1 && hora < 6)){
                System.out.println("ir a casa a dormir desde las 11pm, hasta las 6am");
            }
        } else {
            System.out.println("Porfavor introduce una hora correcto, de 1 a 24 horas");
        }
    }
}