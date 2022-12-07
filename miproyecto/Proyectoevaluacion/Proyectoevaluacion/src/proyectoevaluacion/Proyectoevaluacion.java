/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoevaluacion;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class Proyectoevaluacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Ingrese su nombre: ");
        String nombre=scanner.nextLine ();             
        
        System.out.print ("Fecha de nacimiento (dd/mm/yyyy): ");
        Scanner ingreso = new Scanner (System.in);
        String fecha = ingreso.nextLine ();
        
        try
        
        {
            DateTimeFormatter formatoFecha=DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechanacimiento=LocalDate.parse(fecha, formatoFecha);
            LocalDate fechaactual=LocalDate.now();
            Period periodo=Period.between(fechanacimiento, fechaactual);
            
            System.out.println("Nombre:   "+nombre+"Tienes: "+periodo.getYears()+"   Años, "+periodo.getMonths()+"  Meses "+" y "+periodo.getDays()+" Dias ");System.out.println();
    } catch(Exception e){}}}
