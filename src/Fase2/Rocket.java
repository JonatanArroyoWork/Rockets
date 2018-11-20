package Fase2;

import java.util.ArrayList;
import java.util.List;

public class Rocket {

	//Construimos la clase Rocket
	
    public String code;
    public List<Propeller> propellers = new ArrayList<>(); //Propellers es un array list compuesta por diferentes power 


    public Rocket(String code) throws Exception { 	//constructor de code, valor inicial
    	if (code.length() < 8) throw new Exception("Code must have 8 characters");
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
    
    public void addPropeller(int maxPower)  throws Exception {   //setter metodo que inserta propellers
        Propeller p1 = new Propeller(maxPower);
        propellers.add(p1);
    }
}