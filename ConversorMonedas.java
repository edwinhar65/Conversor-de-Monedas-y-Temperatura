/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversor_proyecto;

import javax.swing.JOptionPane;
/**
 *
 * @author Edwin
 */
public class ConversorMonedas {
    static void convertirMoneda( double montoIngresado) {
            
        //tipos de cambio de sol a: {dólar, euros, libra, yen, won}    
        double [] tipoDeCambio = {0.26, 0.25, 0.215, 35.23, 338.71};
        double cambioMoneda = 0;
                
	String [] option2 = {"De Soles a Dólar", "De Soles a Euros", "De Soles a Libras", "De Soles a Yen Japones", "De Soles a Won","De Dolar a Soles", "De Euros a Soles", "De Libras a Soles", "De Yen Japones a Soles", "De Won a Soles"};
	String opt = (String)JOptionPane.showInputDialog(null,"Elige la moneda a la que deseas convertir tu dinero", "Monedas", JOptionPane.QUESTION_MESSAGE, null, option2, option2[0]);
                
                
		switch(opt) {
                case "De Soles a Dólar":
			cambioMoneda = montoIngresado * tipoDeCambio[0];
			JOptionPane.showMessageDialog(null, "Tienes " + cambioMoneda + " dólares.");
			break;
		
		case "De Soles a Euros":
			cambioMoneda = montoIngresado * tipoDeCambio[1];
			JOptionPane.showMessageDialog(null, "Tienes " + cambioMoneda + " euros.");
			break;
		
		case "De Soles a Libras esterlinas":
			cambioMoneda = montoIngresado * tipoDeCambio[2];
			JOptionPane.showMessageDialog(null,  "Tienes " + cambioMoneda + " libras.");
			break;
		
		case "De Soles a Yen Japones":
			cambioMoneda= montoIngresado * tipoDeCambio[3];
			JOptionPane.showMessageDialog(null, "Tienes " + cambioMoneda + " yen.");
			break;
		
		case "De Soles a Won":
			cambioMoneda = montoIngresado * tipoDeCambio[4];
			JOptionPane.showMessageDialog(null, "Tienes " + cambioMoneda + " won coreano.");
			break;
			
			//Al reves
			
		case "De Dolar a Soles":
			cambioMoneda = montoIngresado * (1/tipoDeCambio[0]);
			JOptionPane.showMessageDialog(null, "Tienes " + cambioMoneda + " soles.");
			break;
		
		case "De Euros a Soles":
			cambioMoneda= montoIngresado * (1/tipoDeCambio[1]);
			JOptionPane.showMessageDialog(null, "Tienes " + cambioMoneda + " soles.");
			break;
		
		case "De Libras esterlinas a Soles":
			cambioMoneda = montoIngresado * (1/tipoDeCambio[2]);
			JOptionPane.showMessageDialog(null, "Tienes " + cambioMoneda + " soles.");
			break;
		
		case "De Yen Japones a Soles":
			cambioMoneda = montoIngresado * (1/tipoDeCambio[3]);
			JOptionPane.showMessageDialog(null, "Tienes " + cambioMoneda + " soles.");
			break;
		
		case "De Won a Soles":
			cambioMoneda = montoIngresado * (1/tipoDeCambio[4]);
			JOptionPane.showMessageDialog(null, "Tienes " + cambioMoneda + " soles.");
			break;
		
            }
    }
}
