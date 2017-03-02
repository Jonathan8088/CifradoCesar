 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifradocesar;

import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class CifradoCesar {
    public int opcion,clave;
    public String palabra1,palabra2="",abecedario="a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z, ,;,,";
    public CifradoCesar(){
        Scanner entrada = new Scanner(System.in);
        Scanner codigo = new Scanner(System.in);
        Scanner claveCifrado = new Scanner(System.in);
        System.out.println("Bienvenido, a continuacion escriba la palabra a procesar ");
        palabra1 = codigo.next();
        System.out.println("Por favor ingrese la clave: ");
        clave = claveCifrado.nextInt();
        System.out.println("Por favor elija la operacion a realizar: ");
        System.out.println(" 1 - Cifrar \n 2 - Descifrar");
        opcion=entrada.nextInt();
        switch(opcion){
            case 1:{
                cifrar();
                break;
            }//case1
            case 2:{
                descifrar();
                break;
            }//case2
            default:{
                System.out.println("Por favor ingrese una opcion valida");
            }//default
        }//switch
    }//constructor

    
   public void cifrar(){
      for(int i=0;i<palabra1.length();i++){
          for(int j=0;i<abecedario.length();j++){
              if((palabra1.charAt(i)) == (abecedario.charAt(i))){
                  palabra2+=((clave+j)%abecedario.length());
                  
              }//if externo
          }//forj
      }//fori
       
       System.out.println(palabra1);
       System.out.println(palabra2);
        
   }//cifrar
   
   public void descifrar(){
       
   }//descifrar
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CifradoCesar CifradoCesar = new CifradoCesar();
    }//main
    
}
