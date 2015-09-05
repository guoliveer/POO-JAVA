package tarefa5;

public abstract class Animal {

		String raca;
		String idade;
		String peso;			

	
	public Animal( String x, String y, String z) {
		raca=x;
		idade=y;
		peso=z;
		
	}
	
	@SuppressWarnings("unused")
	public static void main(String[]args){
		Cachorro a=new Cachorro("poodle","3anos","54");
		Gato b=new Gato("sianes","6anos","25");
		
		System.out.println(a.raca+" - "+a.idade+" - "+a.peso);
		System.out.print(b.raca+" - "+b.idade+" - "+b.peso);
			}

	public void fazerBarulho(){
		System.out.println("Barulho");
	}

}

