package Fase1;
class Rocket {
	
	private final String code;
	private int nProp;
	
	public Rocket(String code, int nProp)
	{
		this.code = code;
		this.nProp = nProp;		
	}

	// Creo los getters
	
	public String getCode() {
		return code;
	}

	public int getnProp() {
		return nProp;
	}

	// Creo un setter para los propulsores (FASE 2) 
	
	public void setnProp(int nProp) {
		this.nProp = nProp;
	}
		
}


