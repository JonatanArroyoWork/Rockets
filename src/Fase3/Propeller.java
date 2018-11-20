package Fase3;

//Creamos la clase Propeller

public class Propeller {
	
	 public int maxPower;
	 
	 public int power; //potencia actual que inicializaremos a 0
	
	 public Propeller (int maxPower)  {  //constructor valor inicial
		 
	     this.maxPower = maxPower;
	 }
	
	 public int getMaxPower() {   // getter de maxPower
		 
	     return maxPower;
	 }
	 
	 public int getPower() {   // getter de power
		 
		 return power;
	 }
	 
	 public void powerInput(int input) { // Método que regula la potencia
		 //si es <0 será =0 y no puede ser > que Max Power
		 
		 //power = 0; //inicializo la potencia a 0
		 
		 power += input;
		 
		 if (power > maxPower) {
			 power = maxPower;
			 
		 }else if (power < 0) {
				 power = 0;
		 } 
	 }
}
