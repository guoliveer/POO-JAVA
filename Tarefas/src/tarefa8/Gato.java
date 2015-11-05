package tarefa8;

public class Gato extends Animal{

	public Gato(String f,String x, String y, int z) {
		super(f,x, y, z);
		System.out.println("Gato ADD");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String fazerBarulho() {
		// TODO Auto-generated method stub
		return "miua";
	}

}