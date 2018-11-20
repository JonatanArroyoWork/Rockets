package Fase1;


public class Main {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub

		Rocket rocket1 = new Rocket("32WESSDS", 3);
		
		Rocket rocket2 = new Rocket("LDSFJA32", 5);
		
		System.out.println("El codigo de cohete1 es " + rocket1.getCode() + " y tiene  " + rocket1.getnProp() + " propulsores");

		System.out.println("El codigo de cohete2 es " + rocket2.getCode() + " y tiene  " + rocket2.getnProp() + " propulsores");
	
	}

}
