package Fase3;

import java.util.ArrayList;
import java.util.List;

public class Rocket {

	//Construimos la clase Rocket
	
    public String code;
    public int nProp;
    public List<Propeller> propellers = new ArrayList<>(); //Propellers es un array list compuesta por diferentes power 
    public int maxSpeed; //Nueva variable, Vmax del cohete

    public Rocket(String code){    	//constructor de code, valor inicial
        this.code = code;
    }

    public String getCode() {		//getter de code
        return code;
    }

    public int getNprop() {			//getter de Npropellers
        return propellers.size();
    }

    public String getPropellers() {		//getter de propellers
        String res = " ";
        for (Propeller p : propellers) {
            res += p.getMaxPower() + ", ";
        }
        return res;
    }
    
    public void addPropeller(int power) {   //setter metodo que inserta propellers
        Propeller p1 = new Propeller(power);
        propellers.add(p1);
    }
    
    public int getMaxSpeed() {  			//método para averiguar Vmax
        for (Propeller p : propellers) { 	//"for each mejorado que suma ptencias.
            maxSpeed += p.getMaxPower();
        }
        return maxSpeed;
    }
    public int getSpeed() {					//método para averiguar velocidad
        int Speed = 0;
        for (Propeller p : propellers) {
            Speed +=p.getPower();
        }
        return Speed;
    }

    public void accelerate (int n){				//setter de aceleración
        int acc = 10;
        int order =acc*n;
        for (Propeller p : propellers) {
            p.powerInput(order);
            //System.out.println(x);
        }
    }
    public void brake (int n) {					//setter de frenada
        int brake = -10;
        int order = brake * n;
        for (Propeller p : propellers) {
            p.powerInput(order);
        }
    }
}

