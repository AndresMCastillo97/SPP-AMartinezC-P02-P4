/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.amartinezc.p02.p4;
import java.util.Scanner;
/**
 *
 * @author andres
 */
public class SPPAMartinezCP02P4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Programa 4");
        int[][] matriz={{1,2,3,4},//Se declara la matriz con los valores prestablecidos
                        {8,7,6,5},
                       {9,10,11,12},
                       {16,15,14,13}};
        
        promedio(matriz);//Se llama al método promedio()
        valmenmay(matriz);//Se llama al método valinmax()
        diagonal(matriz);//Se llama al método diagonal
    }
   public static void promedio(int[][]matriz){
       double suma=0 , promedio=0;//Se declaran las variables de suma y promdedio
       for (int i = 0; i < matriz.length; i++) {//Se utiliza un for para las columnas del arreglo
           for (int j = 0; j < matriz.length; j++) {//Se utiliza otro for para las filas
               suma=suma + matriz[i][j];//Se realiza la operacion de suma, se irán sumando los valores de cada espacio en la matriz
               promedio=suma/16;//Se obtiene el promedio dividiendo la suma entre el número de datos
           }       
       }
       System.out.println("\nEl promedio es: "+promedio);//Se imprime el promedio
   } 
   public static void valmenmay(int[][] matriz){//Método para obtener el valor mayor y menor de la matriz
        int valmay=matriz[0][0], valmen=matriz[0][0];//Se declaran las variables de valor máximo y valor mínimo, otorgándoles el valor del primer dato del array
        
        for (int i = 0; i < matriz.length; i++) {//Se utiliza un for para recorrer las columnas del arreglo
            for (int j = 0; j < matriz.length; j++) {//Se utiliza otro for para recorrer las filas
                if(matriz[i][j]>valmay){//Se utiliza un if para obtener el valor  mayor, si un valor del array es mayor al anterior se le otorgará ese valor a valmay hasta terminar con los valores del array
                    valmay=matriz[i][j];
                }
                if(matriz[i][j]<valmen){//Se realiza la misma operación que el anterior if, cambiando la condición a menor que para obtener el valor menor
                    valmen=matriz[i][j];
                }
                
            }
       }
        System.out.println("El valor mayor es: "+ valmay);//Se imprime el valor mayor
        System.out.println("El valor menor es: "+ valmen);//Se imprime el valor menor
   }
   public static void diagonal(int[][] matriz){//Método para las operaciones con la diagonal del array
    int suma=0,sumainferior=0,sumasuperior=0;//Se declaran las variables
  
       for (int i = 0; i < matriz.length; i++) {//Se utiliza un for para recorrer los valores de las columnas de la matriz
           for (int j = 0; j < matriz.length; j++) {//Se utiliza otro for para recorrer los valores de las filas
               if(i==j){//Se utiliza un if con la condición de que si i es igual a j, se sumará a la variable suma, esto debido a que cuando i=j son las posiciones de la diagonal primaria
                   suma=suma+matriz[i][j];
          }
               if(i>j){//Se utiliza un if con la condicion de que si i>j, el valor se sumará a la variable sumainferior, ya que la posicines en la matriz debajo la diagonal cumplen con i es mayor a j
                   sumainferior+=matriz[i][j];        
                }
               if(i<j){//De igual manera que con el valor inferior, las posiciones de la matriz por arriba de la diagonal cumplen con i<j
                   sumasuperior+=matriz[i][j];
                }
         }
               
        } 
        System.out.println("Suma diagonal: "+suma);//Se imprime la suma de la diagonal
        System.out.println("Suma de valores superiores de la diagonal: "+sumasuperior);//Se imprime la sumade los valores superiores
        System.out.println("Suma de valores inferiores de la diagonal: "+sumainferior);//Se imprime la suma de los valores inferiores
   }   
} 
   


