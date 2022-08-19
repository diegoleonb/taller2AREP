package edu.escuelaing.arem;
import java.io.*;
import java.net.*;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Networking{
    public static void main( String[] args ) throws Exception{
       try {
           URL myUrl = new URL("https://www.google.com/?hl=es");
           printUrl(myUrl);
           URLConnection urlConnection = myUrl.openConnection();
           printUrlConnection(urlConnection);
           
       } catch (Exception e) {
           e.printStackTrace();
       }
    }

    public static void printUrl(URL myUrl){
        System.out.println("Protocol: " + myUrl.getProtocol());
        System.out.println("Authority: " + myUrl.getAuthority());
        System.out.println("Host: " + myUrl.getHost());
        System.out.println("Port: " + myUrl.getPort());
        System.out.println("Path: " + myUrl.getPath());
        System.out.println("Query: " + myUrl.getQuery());
        System.out.println("File: " + myUrl.getFile());
        System.out.println("Ref: " + myUrl.getRef());
    }

    public static void printUrlConnection(URLConnection urlConnection){
        Map<String, List<String>> headers = urlConnection.getHeaderFields();
        Set<Map.Entry<String, List<String>>> entrySet = headers.entrySet();
        for(Map.Entry<String, List<String>> entry : entrySet){
            String headerName = entry.getKey();
            if(headerName != null){
                System.out.println(headerName + ":");
            }
            List<String> headerValue = entry.getValue();
            for(String value : headerValue){
                System.out.println(value);
            }
            System.out.println(" ");
        }
        
    }
}
