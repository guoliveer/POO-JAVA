package tarefa8;

public class Cachorro extends Animal {

	public Cachorro(String f,String x,String y, int z) {
		super(f,x,y,z);
		System.out.println("Cachorro ADD");
// TODO Auto-generated constructor stub
	}

	@Override
	public String fazerBarulho() {
		// TODO Auto-generated method stub
		return "auau";
	}
	

}