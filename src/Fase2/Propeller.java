package Fase2;

// Creamos la clase Propeller

public class Propeller {
    public int maxPower;

    public Propeller (int maxPower)  {  //constructor valor inicial
        this.maxPower = maxPower;
    }

    public int getMaxPower() {   // getter de maxPower
        return maxPower;
    }
}