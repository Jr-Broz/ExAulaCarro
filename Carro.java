package com.mycompany.exaulacarro;

public class Carro {
    
  private String marca, modelo, cor, placa;
  private String ligar = "Ligando o carro";
  
//Sem parametros
Carro(){
    
    marca = "fiat";
    modelo = "MOBI";
    cor = "Branca";
    placa = "ABC1234";
}

//Com parametros
Carro(String marca, String modelo, String cor, String placa){
    
    
    this.marca = marca;
    this.cor = cor;
    this.placa = placa;
    this.modelo = modelo;
    
}

//criou um método pra colocar o valor em Marca
  void setMarca(String marca){
      
      this.marca = marca;
  }
  
  String getMarca(){
    
    return this.marca;
}
 //========================
  
//Setar e pegar modelo
  void setModelo(String modelo){
      
      this.modelo = modelo;
  }
  
  String getModelo(){
      
       return this.modelo;
  } 
//=======================  
  
//Setar e pegar Cor
void setCor(){
      
      this.cor = cor;
  }
  
String getCor(){
      
      return this.cor;
  }
//==================
   

//Setar e pegar Placa
void setPlaca(){
      
      this.placa = placa;
  }
  
String getPlaca(){
      
      return this.placa;
  }


void setLigar(){
    
   this.ligar = ligar;
    
}

String getLigar(){
    
    return this.ligar;
}

//Métodos
void Ligar(){
     
     System.out.println(ligar);
 }
 
void Desligar(){
     

 }

void acelerar(){
    
    
}
 
void frear(){
     
 } 

//Método que Chama outro Método.
 void printCar() { 
     
     System.out.println(getMarca());
     System.out.println(getPlaca());
     System.out.println(getCor());
     System.out.println(getModelo());    
 }
 
}
//THIS Para acessar algo do escopo global.
