/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversor_proyecto;

import javax.swing.JOptionPane;


/**
 *
 * @author Edwin
 */
public class Conversor_proyecto {

    public static void main(String[] args){
		int rpta;
		do {
				
                    // Arreglo
                    String [] option = {"Conversor de monedas", "Conversor de temperatura"};
                    //showInputDialog
                    String opt = (String)JOptionPane.showInputDialog(null,"Seleccione una opción de conversión", "Menu", JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
                    //miJPanel.add(option);
                    int error;

                    //Conversor monedas
                    if("Conversor de monedas".equals(opt)) {
                        do {

                            String moneda = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que deseas convertir:");

                            try {
                                    double mon = Double.parseDouble(moneda);
                                    error=0;
                                    if(mon>0) {
                                            ConversorMonedas.convertirMoneda(mon);
                                    }else {
                                            error=1;
                                            JOptionPane.showMessageDialog(null, "Solo números mayores de 0");
                                    }
                            }catch(NumberFormatException e) {
                                    e.getMessage();
                                    JOptionPane.showMessageDialog(null, "Inválido, ingresar solo números!");
                                    error = 1;
                            }
                        }while(error == 1);
                    } 




                    //Conversor temperaturas
                    else if("Conversor de temperatura".equals(opt)) {
                        do {
                                String grados = JOptionPane.showInputDialog("Ingrese los grados a convertir:");

                                try {
                                        double gra = Double.parseDouble(grados);
                                        ConversorTemperatura.convertirTemp(gra);
                                        error =0;

                                }catch(NumberFormatException e) {
                                        e.getMessage();
                                        JOptionPane.showMessageDialog(null, "Inválido, ingresar solo números!");
                                        error = 1;
                                }
                        }while(error == 1);
                    }


                    //Final
                    rpta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");


		}while(rpta == 0);
		JOptionPane.showMessageDialog(null, "Programa terminado");
	}
}
