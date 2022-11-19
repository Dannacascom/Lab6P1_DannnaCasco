/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6p1_dannacasco;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Danna Casco
 */
public class Lab6P1_DannaCasco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0;
        menu(opcion);
    }

    public static void menu(int opcion) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        String name = "";
        System.out.print("Ingrese nombre:  ");
        name = entrada2.nextLine();
        do {
            System.out.println("");
            System.out.println("-----------------------------------");
            System.out.println("1. El juego de la vida");
            System.out.println("2.Piedra, papel o...");
            System.out.println("3.Blink.182");
            System.out.println("4.SALIR");
            System.out.print(name + " Ingrese una opcion:  ");
            opcion = entrada.nextInt();
            System.out.println("");

            switch (opcion) {
                case 1: {
                    char[][] tab = new char[8][8];
                    ejdv(tab);
                }
                break;

                case 2:
                    
                            
                    ppp();
                    break;

                case 3:
                    int[][] matrizal = new int[6][7];
                    Blinkkk(matrizal);

                    break;

                default:
                    System.out.println("Que tenga buen día " + name + ":)");

            }
        } while (opcion > 4 || opcion < 4);

    }

    public static void ejdv(char[][] tab) {
        Scanner entrada2 = new Scanner(System.in);
        int rand = 0;
        int ph = 0;
        int pv = 0;

        tab = new char[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tab[i][j] = '-';
                tab[0][0] = 'P';

            }

        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tab[i][j]);

            }
            System.out.println("");

        }

        do {
            String dado = "";
            System.out.println("Oprima enter para tirar el dado");
            entrada2.nextLine();

            rand = new Random().nextInt((6 - 1) + 1) + 1;
            System.out.println(rand);
            if (ph + rand >= 7) {
                tab[pv][ph] = '-';
                ph = 0;
                pv++;
                tab[pv][ph] = 'P';
            } else {
                tab[pv][ph] = '-';
                ph = ph + rand;
                tab[pv][ph] = 'P';
            }
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    System.out.print(tab[i][j]);

                }
                System.out.println("");
            }
        } while ((ph < 7) && (pv < 7));

    }
    
    public static void ppp(){
      Scanner entrada = new Scanner(System.in);
         int[][] obj = {{0,1,3,1,5},{1,0,2,4,2},{3,2,0,3,5},{1,4,3,0,4},{5,2,5,4,0}};
    
         
          for (int i = 0; i < 5; i++) {
              for (int j = 0; j < 5; j++) {
                  System.out.print(obj[i][j]);   
              }System.out.println("");
            
        }System.out.println("");
        
        System.out.println("1.Tijera \n2.Papel \n3.Roca \n4.Lizard \n5.Spack ");
        System.out.println("");
        System.out.print("Ingrese que utilizar : ");
        int us=entrada.nextInt();
        System.out.println("");
        
        
          System.out.println("");
          int rand =new Random().nextInt((5-1)+1)+1;
          System.out.println("La maquina eligió "+rand);
          for (int i = 0; i < 5; i++) {
              for (int j = 0; j <5; j++) {
                  if((us==i+1)&&(rand==j+1)){
                      int num=obj[i][j];
                      if(num==1){
                          System.out.println("Gana Tijeras");
                      }else if(num==2){
                          System.out.println("Gana papel");
                      }else if (num==3){
                          System.out.println("Gana roca");
                      }else if(num==4){
                          System.out.println("Gana Lizard");
                      }else if (num==5){
                          System.out.println("Gana spock");
                      }else{
                          System.out.println("Empate");
                      }
                 
                  }
              }
            
        }
              
    }

    public static void Blinkkk(int[][] matrizal) {
        Scanner entrada2 = new Scanner(System.in);
        int fil = 0;
        int colum = 0;

        System.out.print("Ingrese numero de filas: ");
        fil = entrada2.nextInt();
        System.out.print("Ingrese numero de columnas: ");
        colum = entrada2.nextInt();

        if (fil < 0 || colum < 0) {
            System.out.println("OPCION INVALIDA ");
        } else {

            char[][] matrizChar = new char[fil][colum];
            matrizal = new int[fil][colum];

            for (int i = 0; i < fil; i++) {
                for (int j = 0; j < colum; j++) {
                    int rand = new Random().nextInt((122 - 97) + 1) + 97;
                    matrizal[i][j] = rand;
                    matrizChar[i][j] = (char) rand;
                }
            }

            System.out.println("");
            for (int i = 0; i < fil; i++) {
                for (int j = 0; j < colum; j++) {
                    System.out.print(matrizal[i][j] + " - ");
                }
                System.out.println("");
            }
            System.out.println("");

            System.out.println("");
            for (int i = 0; i < fil; i++) {
                for (int j = 0; j < colum; j++) {
                    System.out.print(matrizChar[i][j] + " - ");
                }
                System.out.println("");
            }

        }

    }
}
