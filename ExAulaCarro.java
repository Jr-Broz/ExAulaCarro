package com.mycompany.exaulacarro;


public class ExAulaCarro {

    //Set atribui valor a variavel
    //get le o valor da variável;
 
    public static void main(String[] args) {

      Carro car1 = new Carro();
          
      Carro car2 = new Carro("VM", "Fusca", "Azul", "LRT1234");
        
      
      car1.printCar();
      car2.printCar();
      car1.Ligar();
   /*
     car1.cor = "Branco";      
     car1.marca = "VW";
     car1.modelo = "fusca";
     car1.placa = "ABC1234";
    
      System.out.println(car1.cor);
      System.out.println(car1.marca);
      System.out.println(car1.modelo);
      System.out.println(car1.placa);;
   */
//      System.out.println(car1.getMarca());
//      System.out.println(car1.getCor());
//      System.out.println(car1.getModelo());
//      System.out.println(car1.getPlaca());
//      System.out.println("================");
//      System.out.println(car2.getMarca());
//      System.out.println(car2.getCor());
//      System.out.println(car2.getModelo());
//      System.out.println(car2.getPlaca());
      
 

  }
    
}
