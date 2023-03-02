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
public class ConversorTemperatura {
    	static void convertirTemp( double grados) {
            
                double resultadoTemp = 0;
                
		String [] option3 = {"Celsius a Fahrenheit", "Fahrenheit a Celsius", "Celsius a Kelvin", "Kelvin a Celsius", "Fahrenheit a Kelvin", "Kelvin a Fahrenheit"};
		String opt = (String)JOptionPane.showInputDialog(null,"Elige la escala a la que deseas convertir", "Temperatura", JOptionPane.QUESTION_MESSAGE, null, option3, option3[0]);
		
		switch(opt) {
		case "Celsius a Fahrenheit":
			resultadoTemp = (1.8 * grados)+32;
			JOptionPane.showMessageDialog(null,grados+ " Celsius a Fahrenheit es: "+resultadoTemp);
			break;
		case "Fahrenheit a Celsius":
			resultadoTemp= (grados-32)/1.8;
			JOptionPane.showMessageDialog(null,grados+ " Fahrenheita Celsius es: "+resultadoTemp);
			break;
		case "Celsius a Kelvin":
			resultadoTemp = grados+273;
			JOptionPane.showMessageDialog(null,grados+ " Celsius a Kelvin es: "+resultadoTemp);
			break;
		case "Kelvin a Celsius":
			resultadoTemp = grados-273;
			JOptionPane.showMessageDialog(null,grados+ " Kelvin a Celsius es: "+resultadoTemp);
			break;
		case "Fahrenheit a Kelvin":
			resultadoTemp = (grados + 459.67) * (0.555);
			JOptionPane.showMessageDialog(null,grados+ " Fahrenheit a Kelvin es: "+resultadoTemp);
			break;
		case "Kelvin a Fahrenheit":
			resultadoTemp = (grados/0.555)-459.67;
			JOptionPane.showMessageDialog(null,grados+ " Kelvin a Fahrenheit es: "+resultadoTemp);
			break;
		}
	}
}
