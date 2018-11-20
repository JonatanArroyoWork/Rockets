package Fase2;

import java.util.ArrayList;
import java.util.List;

public class Rocket {

	//Construimos la clase Rocket
	
    public String code;
    public int nProp;
    public List<Propeller> propellers = new ArrayList<>(); //Propellers es un array list compuesta por diferentes power 


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
    
    public void addPropeller(int maxPower) {   //setter metodo que inserta propellers
        Propeller p1 = new Propeller(maxPower);
        propellers.add(p1);
    }
}