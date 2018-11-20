

package Fase2;

public class Main {

    public static void main(String[] args)  throws Exception{

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
    }
  }