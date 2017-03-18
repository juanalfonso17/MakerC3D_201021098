package org.compi2.codigo3d.parser;

import java.util.Stack;

/**
 *
 * @author esvux
 */
public class ControlC3D {
    
    private static int temp = 0;
    private static String c3d = "";
    private static int etiqueta = 1;
    
    public static String verdadero ="";
    public static String falso="";
    public static Stack f = new Stack();
    public static Stack v = new Stack();
    
    
    public static boolean bandera =false;
    public static boolean b =false;
    
    public boolean not =false;
    /**
     * Reinicia las variables estáticas relacionadas con la generación del
     * código de tres direcciones.
     */
    public static void reiniciar(){
        temp = 0;
        c3d = "";
        f.clear();
    }
    
    /**
     * Genera el siguiente temporal.
     * @return El siguiente temporal (t$#)
     */
    public static String generaTemp(){
        return "t$"+temp++;
    }
    
    public static String generaEtiqueta(){
        return "L"+etiqueta++;
    }
    
    public static String getTemp(){        
        return "t$"+temp;
    }
    
    public static String getEtiqueta(){
        int e = etiqueta;
        e=e-2;
        return "L"+e;
    }
    
    public static String getEtiquetaOr(){
        int e = etiqueta;
        e=e-1;
        return "L"+e;
    }
    
    /**
     * Agrega la sentencia que recibe como parámetro a la cadena de código
     * de tres direcciones que se va generando hasta ese momento.
     * @param sentencia Código 3D a agregar
     */
    public static void agregarC3D(String sentencia){
        c3d += sentencia;
    }
    
    public static void agregarValorVerdad(String sentencia,String sentencia1){
        verdadero = verdadero +" "+sentencia+" ";
        falso =  falso+" "+sentencia1+" ";
    }
    
    
    /**
     * Devuelve el código 3D generao hasta el momento de su invocación.
     * @return Código 3D generado
     */
    public static String getC3D(){
        return c3d;
    }
    
    public static String getValorVerdad(){
        String valor = "\n V:"+verdadero+"\n F: "+falso;
        return valor;
    }
    
}
