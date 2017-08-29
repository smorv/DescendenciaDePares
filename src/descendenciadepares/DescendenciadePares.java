/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descendenciadepares;


/**
 *
 * @author Soledad Moraga
 */
import java.util.Scanner;
import java.util.ArrayList;

public class DescendenciadePares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String listado = "";
        int [] listaNumeros = new int[25];
        int retorno=0;
        boolean impares=true;
        System.out.println("INGRESE NÚMEROS");
        
//        for(int i=0; i<listaNumeros.length;i++)
//        {
//            listaNumeros[i] = sc.nextInt();
//        }
        
        for(int x=0; x<listaNumeros.length;x++)
        {
            if(listaNumeros[x]%2==0)
            {
               impares=false;
            }     
        }
        if(impares!=true)
        {
             retorno=parMayor(listaNumeros); 
            int [] numero = nparesMenores(retorno);
            String cadena="";
            for(int j=0; j<numero.length;j++)
            {
                cadena+=numero[j];
            }
            System.out.println(cadena);
        }
        else{
            System.out.println("FIN");
        }
       
    }
    
    public static int parMayor(int[] lista)
    {
        int nMayor=0;
        boolean impares=false;
        for(int i=0; i<lista.length;i++)
        {
            if(lista[i]%2==0)
            {
                impares=true;
                if(lista[i]>=nMayor)
                {
                    nMayor=lista[i];
                }
            }           
        }
        return nMayor;
    }
    
    public static int [] nparesMenores(int nMayor)
    {
        int [] pMenores = new int[10];
        for(int i=0; i<pMenores.length;i++)
        {
            nMayor=nMayor-2;
            pMenores[i]=nMayor;
        }   
        int [] cadena =InvertirCadena(pMenores);
        return cadena;
    }
    public static int [] InvertirCadena(int [] lista)
    {
        int a=9;
        for(int i=0; i<5;i++)
        {
            int aux=lista[i];         
            lista[i]=lista[a];
            lista[a]=aux;
            a--;
        }
        return lista;
    }
}
