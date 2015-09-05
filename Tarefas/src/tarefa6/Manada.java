package tarefa6;

import java.util.ArrayList;

public abstract class Manada {

		ArrayList<Animal> x = new ArrayList<Animal>();
		
		public String estourar(){
			String som = "";
			for(Animal a : x){
				som += a.fazerBarulho();
				som += getDivisor();
			}
			 return som;
		}
		
		
		
		public void addAnimal(Animal animal){
			x.add(animal);
		}

	public abstract String getDivisor();

}