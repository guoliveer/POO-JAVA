package tarefa6;

import static org.junit.Assert.*;

import org.junit.Test;

public class teste {

	@Test
	public void test() {
		Gato gato = new Gato("Sianes", "12 anos", "12 kg");
		Cachorro cach = new Cachorro("PITBULL", "10 anos", "40 kg");
		
		ManadaVirgula v = new ManadaVirgula();
		v.addAnimal(gato);
		v.addAnimal(cach);
		v.addAnimal(gato);
		v.addAnimal(cach);
		
		ManadaSustenido s = new ManadaSustenido();
		s.addAnimal(cach);
		s.addAnimal(gato);
		s.addAnimal(cach);
		s.addAnimal(gato);
		
		System.out.println(v.estourar());
		System.out.println(s.estourar());
	}

}