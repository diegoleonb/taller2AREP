package edu.escuelaing;

import java.net.URL;
import java.util.Scanner;

import edu.escuelaing.arem.URLGetter;

public class URLSearch{

    public static void main(String[] args) throws Exception{
        Scanner scannerEntrada = new Scanner(System.in);
        String entradaTeclado = scannerEntrada.nextLine();
        scannerEntrada.close();
        URLGetter urlGetter = new URLGetter();
        try {
            URL myUrl = new URL(entradaTeclado);
            urlGetter.printUrl(myUrl);
        } catch (Exception e) {
            e.printStackTrace();
        } 
    } 
}