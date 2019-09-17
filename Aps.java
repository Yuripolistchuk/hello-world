
import java.util.Scanner;
import java.util.*;




public class Aps {
   
public static void main(String[] args){

  
      Scanner scan = new Scanner(System.in); //Scanner para ler o input do usuário
      Vector<String> Jogador = new Vector<String>(); //Primeiro Vector para armazenar os nomes dos jogadores
      Vector<Double> Altura = new Vector<Double>(); //Segundo Vector para armazenar a altura do jogadores
      Boolean Done = true;
    System.out.println("Dados estatísticos de seu time de basquete");
    System.out.println("Feito por: Gustavo RA: 21363230" + "Silas RA: 21270887" + "Murilo RA: 21272578" +"Lucas RA: 21238938" +"Yuri RA: 21341504");
    System.out.println("Criar um novo Time de basquete, Aperte '1'");
    System.out.println("Pesquisar time, Aperte 2");

      int nomeTime = scan.nextInt(); //Scanner para reconhecer a opção digitada pelo usuário
    
    if(nomeTime == 1){
        do{
         // Looping
            System.out.println("Nome do jogador");
              String nome1 = scan.next();      // Armazenando nomes dos jogadores
                Jogador.add(nome1); // Adiciona o nome digitado ao vetor Jogador
                  System.out.println("Altura do jogador?(Em CM)"); 
                    double altura1 = scan.nextDouble(); // Scanner para reconhecer a opção digitada pelo usuário
                      Altura.add(altura1); //Adiciona a altura digitada no vetor Altura
                        System.out.println("Adicionar mais um jogador, aperte 1");
                          System.out.println("sair, aperte 2");
                            int leave = scan.nextInt(); // Scanner para reconhecer a opção digitada pelo usuário
                              if(leave == 2 && Altura.size()==10){ // Condição para o usuário adicionar mais um jogador
                               break; // Incrementa um número para o loop
                                }else if(Altura.size() != 10){
                                  
                                  System.out.println("Time incompleto porfavour Adicionar mais: "+ (10- Altura.size()) + "Jogadores");
                                  continue;
                              }
        }while(Altura.size()<10);
           
    
       do{
             // Condição para o usuário voltar ao menu de opções
            System.out.println("Menu de opcoes.");
            System.out.println("1. Dados dos jogadores");
            System.out.println("2. Media de alturas");
            System.out.println("3. Desvio padrao das alturas");
            System.out.println("4. Maior e Menor altura");
            System.out.println("5 .Mediana das alturas");
            System.out.println("6. Fechar programa");
             // Finaliza a execução acima
                
        
    
        
            int operador = scan.nextInt(); // Scanner para reconhecer a opção digitada pelo usuário

    switch(operador ){ // Condição para reproduzir as opções do menu
              
        case 1:
            
            for(int u = 0; u<Jogador.size();u++){ 
            System.out.println("nome do jogador: "+ Jogador.get(u) + ":"+ Altura.get(u));
        }
            
            
        break;
        
        case 2:
           double sum=0; 
            double sum2 = 0;
              Vector <Double> abc = new Vector<Double>(); //Declarando um novo vetor chamado "abc"
                for(int counter =0; counter<Altura.size(); counter++){ //Condição para definir o loop
                  sum = sum + Altura.get(counter); //Declarando que a variável recebe e adiciona o valor da posição do vetor Altura
                    abc.add(sum); //Adicionando a variável no vetor
                      Object obj = Collections.max(abc); //Declarando que o objeto é igual ao número máximo dentro do vetor declarado
                       sum2 = (Double) obj / Altura.size(); //Declarando que a variável double é o valor do objeto dividido pelo o tamanho da altura
                }System.out.println("a altura media do time de basquete e:" + sum2);
                break;
                
        case 3:
            
           double addSum=0, Newersum=0;
            Vector<Double>Calc = new Vector<>();
           for(int ii=0; ii<Altura.size();ii++){
           double square = (double) Math.pow(Altura.get(ii), 2);
           double newSum=square; 
           Calc.add(newSum);
           addSum = addSum +Calc.get(ii) ;
           Newersum = Newersum + Altura.get(ii);
            double Mainsum=0;
            Mainsum = addSum/Altura.size();
            double Finalsum= Newersum/Altura.size();
            double Finalsum2= (double)Math.pow(Finalsum, 2);
            double Finalsum3=Mainsum-Finalsum2;
               System.out.println(Finalsum3);
           }
            break;
            
             
        case 4:
            
            double obj1 = Collections.max(Altura);
            double obj2 = Collections.min(Altura);
            for(int i=0; i<Jogador.size(); i++){
               if(Altura.get(i) == obj1 ){
                   System.out.println(Jogador.get(i)+":"+obj1);
                   
                   
               }    
            }
            
             for(int i=0;i<Jogador.size();i++){
                 if(Altura.get(i)== obj2){
                     System.out.println(Jogador.get(i)+":"+obj2);
                 
                 }
               }
             break;
        case 5:
           int middle = Altura.size()/2; //Scanner para reconhecer a opção digitada pelo usuário
            double Mvalue = Altura.get(middle); //Declarando que a variável double irá receber a altura média do vetor declarado
              for(int pp=0; pp<Altura.size();pp++){ //Condição de loop
                if(pp == middle){
                  int mim3 = middle - 1; //Declarando que a variável irá receber o valor de outra variável e subtrair um.
                    System.out.println(mim3);
                      System.out.println(Altura.get(middle)+","+Altura.get(mim3));
                        double mim4 =Altura.get(middle)-Altura.get(mim3);//Declarando que a variável double irá receber a altura média e altura minima
                          double mim5 = (mim4 /2) +Altura.get(mim3); //Declarando que a variável double irá dividir outra variável por dois, e receber um valor minimo do vetor declarado
                            System.out.println(mim5);
                              break; 
        
           
          
             }
          
               
          
             }break; 
          case 6:   
              System.out.println("Fechando systema");
              System.exit(0);
    } 
       }while(Done == true);
         
      }
}



