package tarefa6;


public abstract class Animal {

		String raca;
		String idade;
		String peso;			

	
	public Animal( String x, String y, String z) {
		raca=x;
		idade=y;
		peso=z;
		
	}
	
	public String getRaca(){
		return raca;
	}
	
	public String getIdade() {
		return idade;
	}
	
	public String getPeso(){
		return peso;
	}
	
	public abstract String fazerBarulho();
	

}

