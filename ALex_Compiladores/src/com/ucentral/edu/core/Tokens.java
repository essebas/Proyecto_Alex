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
public class Tokens {

    private Automata automata;
    private String separadores;
    private String operadores;
    private String ids;
    private String variables;
    
    
    public Tokens() {
        automata = new Automata();
    }

    public String getSeparadores() {
        return separadores;
    }

    public void setSeparadores(String separadores) {
        this.separadores = separadores;
    }

    public String getOperadores() {
        return operadores;
    }

    public void setOperadores(String operadores) {
        this.operadores = operadores;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getVariables() {
        return variables;
    }

    public void setVariables(String variables) {
        this.variables = variables;
    }
    
    
    public String  proceso(String string){
        Character caracter;
        
        return "";            
    }
    
    
}
