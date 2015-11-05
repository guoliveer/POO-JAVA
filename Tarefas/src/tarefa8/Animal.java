package tarefa8;


public abstract class Animal implements Comparable<Animal>{
		String nome;
		String raca;
		String idade;
		int peso;			

	
	public Animal( String f ,String x, String y, int z) {
		nome=f;
		raca=x;
		idade=y;
		peso=z;
		
	}
	public String getNome(){
		return nome;
	}
	
	public String getRaca(){
		return raca;
	}
	
	public String getIdade() {
		return idade;
	}
	
	public int getPeso(){
		return peso;
	}
	
	public abstract String fazerBarulho();
	
	
	public String toString() {
		if(this.getNome() != null)
			return this.nome + ": " + this.peso;
		return "Sem nome";
	}
	
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Animal other = (Animal) obj;
		if(other.getRaca() == raca)
			return true;
			
		return false;
	}
	
	public int compareTo(Animal animal) {
		if (this.peso < animal.peso) {
            return -1;
        }
        if (this.peso > animal.peso) {
            return 1;
        }
        return 0;
	}

	

}
