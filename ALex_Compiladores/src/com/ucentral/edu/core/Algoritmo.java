package com.ucentral.edu.core;

public class Algoritmo {
	String lexema;
	int estado;
	boolean estadoAcepta;
	int estadoError;
	int inicioCadena;
	int posLectura[];

	public Algoritmo(String cadena) {
		posLectura = new int[1];
		lexema = cadena;
		estadoAcepta = false;
		estado = 0;
		estadoError = 0;
		posLectura[0] = 0;
		proceso();
	}

	public void proceso() {
		boolean valido;
		int inicioCadena = 1;
		valido = automataID();
		System.out.println("Cadena: " + lexema);
		if (valido)
			System.out.println("El lexema " + lexema + " es ID");
		else {
			estado = 0;
			valido = automatacadenaVacia();
			if(valido) {
				System.out.println("cadena vacia " + posLectura[0]);
				posLectura[0]++;
				this.inicioCadena=posLectura[0] ;
				automataID();
			}
			
			estado = 0;
			valido = automataOperaMate();
			if (valido) {
				for (int k = inicioCadena - 1; k < posLectura[0]; k++)
					System.out.print(lexema.charAt(k));
				System.out.println(" es ID ");
				System.out.print(lexema.charAt(posLectura[0]) + " es OPMAT");
			} else
				System.out.println("error lexico en " + lexema.charAt(posLectura[0]));

		}
	}

	boolean automataID() {
		char caracter;
		for (int i = inicioCadena; i < lexema.length(); i++) {
			caracter = lexema.charAt(i);
			if (Character.isLetter(caracter) && estado == 0) {
				estado = 1;
				estadoAcepta = true;
			} else if (Character.isLetterOrDigit(caracter) && estado == 1) {
				estado = 1;
				estadoAcepta = true;
			} else if (Character.isDigit(caracter)) {
				estado = 1;
				estadoAcepta = true;
			} else {
				estadoAcepta = false;
				posLectura[0] = i;
				break;
			}

		}
		return estadoAcepta;
	}
	boolean atumataNumber() {
		char caracter;
		caracter = lexema.charAt(posLectura[0]);
		 if (Character.isDigit(caracter)) {
			estado = 1;
			estadoAcepta = true;
			
		}else {
			estadoAcepta = false;
			posLectura[0] ++;
			return estadoAcepta;
		} 
		 
		 return estadoAcepta;
	}
	boolean automataOperaMate() {
		if (estado == 0 && lexema.charAt(posLectura[0]) == '/')
			return true;
		if (estado == 0 && lexema.charAt(posLectura[0]) == '*')
			return true;
		if (estado == 0 && lexema.charAt(posLectura[0]) == '-')
			return true;
		if (estado == 0 && lexema.charAt(posLectura[0]) == '+')
			return true;
		if (estado == 0 && lexema.charAt(posLectura[0]) == '%')
			return true;
		if (estado == 0 && lexema.charAt(posLectura[0]) == '=')
			return true;
		else
			return false;
	}
	boolean automatacadenaVacia() {
		if(estado == 0 && lexema.charAt(posLectura[0]) == ' ')
			return true;
		if(estado == 0 && lexema.charAt(posLectura[0]) == '\n')
			return true;
		else
			return false;
	}
	
	boolean automataoperadorLogi() {
		if(estado == 0 && lexema.charAt(posLectura[0]) == '&')
			return true;
		if(estado == 0 && lexema.charAt(posLectura[0]) == '|')
			return true;
		if(estado == 0 && lexema.charAt(posLectura[0]) == '!')
			return true;
		else
			return false;
	}
	boolean automataSigPuntu() {
		if(estado == 0 && lexema.charAt(posLectura[0]) == '(')
			return true;
		if(estado == 0 && lexema.charAt(posLectura[0]) == ')')
			return true;
		if(estado == 0 && lexema.charAt(posLectura[0]) == '.')
			return true;
		if(estado == 0 && lexema.charAt(posLectura[0]) == ',')
			return true;
		if(estado == 0 && lexema.charAt(posLectura[0]) == ';')
			return true;
		if(estado == 0 && lexema.charAt(posLectura[0]) == ':')
			return true;
		if(estado == 0 && lexema.charAt(posLectura[0]) == '"')
			return true;
		else
			return false;
	}
}