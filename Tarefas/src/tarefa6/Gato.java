package tarefa6;

public class Gato extends Animal{

	public Gato(String x, String y, String z) {
		super(x, y, z);
		System.out.println("Gato ADD");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String fazerBarulho() {
		// TODO Auto-generated method stub
		return "miua";
	}

}