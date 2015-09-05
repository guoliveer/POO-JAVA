package tarefa6;

public class Cachorro extends Animal {

	public Cachorro(String x,String y, String z) {
		super(x,y,z);
		System.out.println("Cachorro ADD");
// TODO Auto-generated constructor stub
	}

	@Override
	public String fazerBarulho() {
		// TODO Auto-generated method stub
		return "auau";
	}
	

}