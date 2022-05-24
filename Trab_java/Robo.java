import java.util.Scanner;

public class Robo {

  int bateria;
  int gastabateria;
  int gastabateria2;
  int programa;

  void estetica(){
    System.out.println("*******************************************************");
  }

  void estetica2(){
    System.out.println("        ");
  }
  
  void gastaBateria(){
    bateria = bateria - gastabateria;
  }

    void gastaBateria2(){
    bateria = bateria - gastabateria2;
  }
  
  void inicializar(){


    while (programa == 1){

      if(bateria > 30){

        this.estetica();
        System.out.println("Qual direção o robo deve virar em graus? 90/180/270");
        this.estetica2();
        System.out.println("Carga = " + this.bateria);
        this.estetica();
        Scanner memoria = new Scanner(System.in);
    
        int direcao = memoria.nextInt();
      
        if(direcao == 90){

          this.estetica();
          System.out.println("Rotacionou 90 graus e tirou uma foto");
          this.gastaBateria();
          this.estetica2();
          System.out.println("Carga = " + this.bateria);
          this.estetica();
          
        }else if(direcao == 180){

          this.estetica();
          System.out.println("Rotacionou 180 graus e tirou uma foto");
          this.gastaBateria();
          this.estetica2();
          System.out.println("Carga = " + this.bateria);
          this.estetica();
          
        }else if(direcao == 270){

          this.estetica();
          System.out.println("Rotacionou 270 graus e tirou uma foto");
          this.gastaBateria2();
          this.estetica();
          System.out.println("Carga = " + this.bateria);
          this.estetica();
          
        }else{
          
          System.out.println("Não é possível realizar essa ação");
          
        }
      if(bateria > 30){

        this.estetica();
        System.out.println("O Robo deve ir para frente = W ou para Trás = S (digite uma das letras para o comando)");
        this.estetica2();
        System.out.println("Carga = " + this.bateria);
        this.estetica();

        Scanner memoria2 = new Scanner(System.in);
        String frente_tras = memoria2.nextLine();

        if(frente_tras.contains("W")||frente_tras.contains("w")){

          this.estetica();
          System.out.println("O Robo andou para frente");
          this.gastaBateria2();
          this.estetica2();
          System.out.println("Carga = " + this.bateria);
          this.estetica();
          
        }else if(frente_tras.contains("S")||frente_tras.contains("s")){

          this.estetica();
          System.out.println("O Robo andou para frente");
          this.gastaBateria2();
          this.estetica2();
          System.out.println("Carga = " + this.bateria);
          this.estetica();
          
        }else{

        this.estetica();
        System.out.println("Não é possível realizar essa ação");
        this.estetica();
        
      }
      }
        
        
      }else{
        
        this.estetica();
        System.out.println("O Robo entrou em modo de carregamento pois está com a bateria abaixo de 30%");
        this.estetica();
        programa = 0;
      }
    }    
  }



  
  
}