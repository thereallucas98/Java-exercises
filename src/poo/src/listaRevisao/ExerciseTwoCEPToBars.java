package listaRevisao;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class ExerciseTwoCEPToBars {
	public static void main(String[] args) {

		String cep;
		char [] binary;
		String newBinary = "";
		String codeBar = "";
		int cepsum = 0;
		int isCepMultipleofTen = 0;
		char[] array;

		cep = JOptionPane.showInputDialog("Informe O CEP (apenas números)");

		// CONVERTER DE STRING PARA ARRAY;

		array = cep.toCharArray();

		// SOMANDO TODOS OS DÍGITOS

		for (int i = 0; i < array.length; i++) {
			int valueInt = Character.getNumericValue(array[i]);

			cepsum += valueInt;
			System.out.println(cepsum);
		}

		// VERIFICAR SE É MÚLTIPLO DE 10

		for (int i = 1; i < 10; i++) {

			int sum = cepsum + i;

			if (sum % 2 == 0) {
				isCepMultipleofTen = sum;
				System.out.println(isCepMultipleofTen);
				break;
			} else {
				System.out.println("Não é múltiplo de 10.");
			}
		}

		System.out.println(array);

		// CONSTRUINDO A TABELA
		for (int t = 10; t >= 0; t--) {

			if (t == 7) {
				for (int i = 0; i < array.length; i++) {				
					if (array[i] == '1') {
						newBinary += "0";
					} else if (array[i] == '2') {
						newBinary += "0";
					} else if (array[i] == '3') {
						newBinary += "0";
					} else if (array[i] == '4') {
						newBinary += "0";
					} else if (array[i] == '5') {
						newBinary += "0";
					} else if (array[i] == '6') {
						newBinary += "0";
					} else if (array[i] == '7') {
						newBinary += "1";
					} else if (array[i] == '8') {
						newBinary += "1";
					} else if (array[i] == '9') {
						newBinary += "1";
					} else {
						newBinary += "1";
					}
				}
			} else if (t == 4) {
				for (int i = 0; i < array.length; i++) {
					if (array[i] == '1') {
						newBinary += "0";
					} else if (array[i] == '2') {
						newBinary += "0";
					} else if (array[i] == '3') {
						newBinary += "0";
					} else if (array[i] == '4') {
						newBinary += "1";
					} else if (array[i] == '5') {
						newBinary += "1";
					} else if (array[i] == '6') {
						newBinary += "1";
					} else if (array[i] == '7') {
						newBinary += "0";
					} else if (array[i] == '8') {
						newBinary += "0";
					} else if (array[i] == '9') {
						newBinary += "0";
					} else {
						newBinary += "1";
					}
				}
			} else if (t == 2) {
				for (int i = 0; i < array.length; i++) {					
					if (array[i] == '1') {
						newBinary += "0";
					} else if (array[i] == '2') {
						newBinary += "1";
					} else if (array[i] == '3') {
						newBinary += "1";
					} else if (array[i] == '4') {
						newBinary += "0";
					} else if (array[i] == '5') {
						newBinary += "0";
					} else if (array[i] == '6') {
						newBinary += "1";
					} else if (array[i] == '7') {
						newBinary += "0";
					} else if (array[i] == '8') {
						newBinary += "0";
					} else if (array[i] == '9') {
						newBinary += "1";
					} else {
						newBinary += "0";
					}
				}
			} else if (t == 1) {
				for (int i = 0; i < array.length; i++) {					
					if (array[i] == '1') {
						newBinary += "1";
					} else if (array[i] == '2') {
						newBinary += "0";
					} else if (array[i] == '3') {
						newBinary += "1";
					} else if (array[i] == '4') {
						newBinary += "0";
					} else if (array[i] == '5') {
						newBinary += "1";
					} else if (array[i] == '6') {
						newBinary += "0";
					} else if (array[i] == '7') {
						newBinary += "0";
					} else if (array[i] == '8') {
						newBinary += "1";
					} else if (array[i] == '9') {
						newBinary += "0";
					} else {
						newBinary += "0";
					}
				}
			} else if (t == 0) {
				for (int i = 0; i < array.length; i++) {		
					if (array[i] == '1') {
						newBinary += "1";
					} else if (array[i] == '2') {
						newBinary += "1";
					} else if (array[i] == '3') {
						newBinary += "0";
					} else if (array[i] == '4') {
						newBinary += "1";
					} else if (array[i] == '5') {
						newBinary += "0";
					} else if (array[i] == '6') {
						newBinary += "0";
					} else if (array[i] == '7') {
						newBinary += "1";
					} else if (array[i] == '8') {
						newBinary += "0";
					} else if (array[i] == '9') {
						newBinary += "0";
					} else {
						newBinary += "0";
					}
				}
			} else {
				System.out.println("");
			}
		}
		/*
		for (int i = 0; i < binary.size(); i++) {
			if (binary.contains('1')) {
				binary.set(i, '|');
			} else if (binary.contains('0')) {
				binary.set(1, ':');
			}
		} */
		binary = newBinary.toCharArray();
		for (int i = 0; i < newBinary.length(); i++) {
			if (binary[i] == '1') {
				codeBar += "|";
			} else if (binary[i] == '0' ) {
				codeBar += ":";
			} else {
				codeBar += " ";
			}
		}
		
		System.out.println(newBinary);
		System.out.println(codeBar);
	}
}
