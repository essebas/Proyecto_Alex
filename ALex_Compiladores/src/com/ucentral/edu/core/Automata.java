/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucentral.edu.core;

/**
 *
 * @author Adolfo
 */
public class Automata {

    String lexema;
    int estado;
    boolean estadoAcepta;
    int estadoError;
    int inicioCadena;
    int posLectura[];

    public Automata() {
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

        } else {
            estadoAcepta = false;
            posLectura[0]++;
            return estadoAcepta;
        }

        return estadoAcepta;
    }

    boolean automataOperaMate() {
        if (estado == 0 && lexema.charAt(posLectura[0]) == '/') {
            return true;
        }
        if (estado == 0 && lexema.charAt(posLectura[0]) == '*') {
            return true;
        }
        if (estado == 0 && lexema.charAt(posLectura[0]) == '-') {
            return true;
        }
        if (estado == 0 && lexema.charAt(posLectura[0]) == '+') {
            return true;
        }
        if (estado == 0 && lexema.charAt(posLectura[0]) == '%') {
            return true;
        }
        if (estado == 0 && lexema.charAt(posLectura[0]) == '=') {
            return true;
        } else {
            return false;
        }
    }

    boolean automatacadenaVacia() {
        if (estado == 0 && lexema.charAt(posLectura[0]) == ' ') {
            return true;
        }
        if (estado == 0 && lexema.charAt(posLectura[0]) == '\n') {
            return true;
        } else {
            return false;
        }
    }

    boolean automataoperadorLogi() {
        if (estado == 0 && lexema.charAt(posLectura[0]) == '&') {
            return true;
        }
        if (estado == 0 && lexema.charAt(posLectura[0]) == '|') {
            return true;
        }
        if (estado == 0 && lexema.charAt(posLectura[0]) == '!') {
            return true;
        } else {
            return false;
        }
    }

    boolean automataSigPuntu() {
        if (estado == 0 && lexema.charAt(posLectura[0]) == '(') {
            return true;
        }
        if (estado == 0 && lexema.charAt(posLectura[0]) == ')') {
            return true;
        }
        if (estado == 0 && lexema.charAt(posLectura[0]) == '.') {
            return true;
        }
        if (estado == 0 && lexema.charAt(posLectura[0]) == ',') {
            return true;
        }
        if (estado == 0 && lexema.charAt(posLectura[0]) == ';') {
            return true;
        }
        if (estado == 0 && lexema.charAt(posLectura[0]) == ':') {
            return true;
        }
        if (estado == 0 && lexema.charAt(posLectura[0]) == '"') {
            return true;
        } else {
            return false;
        }
    }
}
