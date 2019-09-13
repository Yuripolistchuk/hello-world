import java.util.Scanner;
import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.*;
public class Aps {
   
public static void main(String[] arg){
    // Scanner para ler o input do usuario//
    Scanner scan = new Scanner(System.in);
    //Primeiro Vector para armazena o nome dos jogadores//
    Vector<String> Jogador = new Vector<String>();
    //Segundo Vector para armazena a altura do jogadores//
    Vector<Double> Altura = new Vector<Double>(); 
    
    System.out.println("Gustavo ra:"+ "Silas ra:"+ "Murilo ra:"+"Lucas Ra:"+"Yuri ra:");
    
    for(int i=10; i>Jogador.size();i++){
    System.out.println("Dados dos jogadores");
    System.out.println("Media de alturas");
    System.out.println("Desvio padrao das alturas");
    System.out.println("Maior e Menor altura"); 
    System.out.println("Mediana das alturas");
    System.out.println("Finalizar Digite uma opcao");
    
    int operador = scan.nextByte();
    
    switch(operador ){
        
        case 0:
            System.out.println("Nome do jogador");
            String nome1 = scan.next();
            Jogador.add(nome1);
            System.out.println("Altura do jogador?(Em CM)");
            double altura1 = scan.nextDouble();
            Altura.add(altura1);
            System.out.println(Jogador + ":" + Altura);
            break;
            
        case 1:
           double n, sum=0;
           double sum2 = 0;
           Vector <Double> abc = new Vector<Double>();
           for(int counter =0; counter<Altura.size(); counter++){
           sum = sum + Altura.get(counter);
           abc.add(sum);
           Object obj = Collections.max(abc);
           
           
           
           sum2 = (Double) obj / Altura.size();
           
               
           
           }
            System.out.println("a altura media do time de basquete e:" + sum2);
           
            
        case 2:
            
          
        case 3:
            Object obj1 = Collections.max(Altura);
            Object obj2 = Collections.min(Altura);
            System.out.println(obj1+"," + obj2);
    

        case 4:
            if(Altura.size()% 2 == 0){
            Altura.get(5);
            Altura.get(6);
            double mim1 = Altura.get(5)%Altura.get(6);
            double mim2 = Altura.get(5)+mim1;
                System.out.println(mim2);
            }
           
    
    }
    
       
        
    }
    
    
    
    
}
    
}  

