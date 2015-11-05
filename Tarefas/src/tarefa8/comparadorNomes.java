package tarefa8;
import java.util.Comparator;
	
public class comparadorNomes implements Comparator<Animal>{
	@Override
	public int compare(Animal animal, Animal outroAnimal) {
		return animal.getNome().compareTo(outroAnimal.getNome());
}
}


