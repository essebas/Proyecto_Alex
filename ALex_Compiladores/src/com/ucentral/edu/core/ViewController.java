/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucentral.edu.core;

//import com.ucentral.edu.modelo.Lexer;
import com.ucentral.edu.modelo.Token;
import com.ucentral.edu.vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;


/**
 *
 * @author ADMIN02F
 */
public class ViewController implements ActionListener{
    
    Vista currentControlview;

    public ViewController(Vista v) {
        currentControlview = v;
    }
    
    public String analizarTexto(String textoArchivo){
        /*try {
            Reader reader = new BufferedReader(new FileReader(textoArchivo));   
            Lexer lexer = new Lexer(reader);
            String txtExit = "";
            while(true){
                Token token = lexer.yylex();
                if(token == null){
                    txtExit = txtExit + "--- End Analizis ---";
                    return txtExit;
                }
                switch(token){
                    case ERROR:                        
                        txtExit = txtExit + "Error, no se reconoce el simbolo";
                        break;
                    case ID: case INT: case WORD:
                        txtExit = txtExit + "TOKEN: " + token + " " + lexer.lexeme + "\n";
                        break;
                    default:
                        txtExit=txtExit+ "TOKEN: " + token + "\n";
                }                
            }            
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
            return "";
        }        */                   
        return "";
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
