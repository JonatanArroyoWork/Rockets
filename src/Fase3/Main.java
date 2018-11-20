package Fase3;

public class Main {

    public static void main(String[] args)  {

        Rocket rocket1 = new Rocket("32WESSDS");
        
        rocket1.addPropeller(10);
        rocket1.addPropeller(30);
        rocket1.addPropeller(80);
        
        Rocket rocket2 = new Rocket("LDSFJA32");
        
        rocket2.addPropeller(30);
        rocket2.addPropeller(40);
        rocket2.addPropeller(50);
        rocket2.addPropeller(50);
        rocket2.addPropeller(30);
        rocket2.addPropeller(10);

          System.out.println("Cohete Código: " + rocket1.getCode() +
          		" con " + rocket1.getNprop() + " propulsores:" + rocket1.getPropellers());
          
          System.out.println("Cohete Código: " + rocket2.getCode() +
          		" con " + rocket2.getNprop() + " propulsores:" + rocket2.getPropellers());
      
          System.out.println("FASE 3: VELOCIDAD ACTUAL DE LOS COHETES: ");
          System.out.println("La velocidad actual del cohete 1 es: " + rocket1.getSpeed());
          System.out.println("La velocidad actual del cohete 2 es: " + rocket2.getSpeed());
          
          System.out.println("FASE 3: ACELERAR 3 VECES: ");
          rocket1.accelerate(3);
          rocket2.accelerate(3);
          
          System.out.println("La velocidad actual del cohete 1 es: " + rocket1.getSpeed());
          System.out.println("La velocidad actual del cohete 2 es: " + rocket2.getSpeed());
          
          System.out.println("FASE 3: FRENAR 5 VECES CON EL COHETE 1; ACELERAR 7 VECES CON EL COHETE 2: ");
          rocket1.brake(5);
          rocket2.accelerate(7);

          System.out.println("La velocidad actual del cohete 1 es: " + rocket1.getSpeed());
          System.out.println("La velocidad actual del cohete 2 es: " + rocket2.getSpeed());

          System.out.println("FASE 3: ACELERAR 15 VECES: ");
          rocket1.accelerate(15);
          rocket2.accelerate(15);

          System.out.println("La velocidad actual del cohete 1 es: " + rocket1.getSpeed());
          System.out.println("La velocidad actual del cohete 2 es: " + rocket2.getSpeed());
          
    	}
    }



