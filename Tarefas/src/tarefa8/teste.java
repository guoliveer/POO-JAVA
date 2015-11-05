package tarefa8;


import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class teste {

	@Test
	public void test() {
		List<Animal> animais= new ArrayList<Animal>();
		
		Gato gato = new Gato("Juca","Sianes", "12 anos", 50);
		Cachorro cach = new Cachorro("Tobby","PITBULL", "10 anos", 35);
		Gato gato1 = new Gato("Neymar","Felino","3 anos",45);
		Cachorro cach1 = new Cachorro("Pingo","Goldem Retriver", "10 anos", 79);

		ManadaVirgula v = new ManadaVirgula();
		v.addAnimal(gato);
		v.addAnimal(cach);
		v.addAnimal(gato1);
		v.addAnimal(cach1);
		
		
		Gato gato2 = new Gato("Bob","felix", "8 anos", 32);
		Cachorro cach2 = new Cachorro("Morena","Poodle", "9 anos", 55);
		Gato gato3 = new Gato("Messi","jogador","5 anos",42);
		Cachorro cach3 = new Cachorro("Lenny","York CHID", "14 anos", 14);
		
		ManadaSustenido s = new ManadaSustenido();
		s.addAnimal(cach2);
		s.addAnimal(gato2);
		s.addAnimal(cach3);
		s.addAnimal(gato3);
		
		System.out.println(v.estourar());
		System.out.println(s.estourar());
		
		animais.add(gato);
		animais.add(gato1);
		animais.add(gato2);
		animais.add(gato3);
		animais.add(cach);
		animais.add(cach1);
		animais.add(cach2);
		animais.add(cach3);
		
		
		this.ordenarPorNome(animais);
		System.out.println("Ordenando de acordo com os nomes: " + animais);
		
		Collections.sort(animais);
		System.out.println("Ordenando de acordo com os pesos: " + animais);
	
	}
	private void ordenarPorNome(List<Animal> animais) {
		comparadorNomes comp = new comparadorNomes();
		Collections.sort(animais, comp);
}

}