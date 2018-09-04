/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucentral.edu.core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.annotation.processing.FilerException;

/**
 *
 * @author Adolfo
 */
public class ManejadorArchivos {

    private FileOutputStream fs= null;
    private FileInputStream fe=null;
    private byte[] buffer;
    private int nbytes;
    private Tokens token;
    public ManejadorArchivos() {
        this.buffer = new byte[90];
        token = new Tokens();
    }
   public void leerFichero(){
        try{
            fe= new FileInputStream("TablaSimbolos");
            nbytes = fe.read(buffer, 0, 90);
            String str= new String(buffer);
            token.proceso(str);
            System.out.println(str);
        }catch(IOException e){
            System.err.println("Error de archivo :  " + e);
        }finally{
            try {
                if(fs != null)
                    fs.close();
            } catch (Exception e) {
                System.err.println("Error cerrando archivo :" +e);
            }
        }
    }
    public void leerFichero(String ruta){
        try{
            fe= new FileInputStream(ruta);
            nbytes = fe.read(buffer, 0, 90);
            String str= new String(buffer);
            System.out.println(str);
        }catch(IOException e){
            System.err.println("Error de archivo :  " + e);
        }finally{
            try {
                if(fs != null)
                    fs.close();
            } catch (Exception e) {
                System.err.println("Error cerrando archivo :" +e);
            }
        }
    }
    public void escribirFichero(){
        try{
            System.out.printf("Escriba el fichero %s","ss" );
            nbytes = System.in.read(buffer);
            fs = new FileOutputStream("Clientes");
            fs.write(buffer,0,nbytes);
        }catch(FilerException ex){
        }catch(IOException e){
        }finally{
            try {
                if(fs != null)
                    fs.close();
            } catch (Exception e) {
                System.err.println("Error cerrando archivo :" +e);
            }
        }
    
    }
    
}
