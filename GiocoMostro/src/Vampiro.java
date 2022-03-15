
public class Vampiro implements Mostro {

	private int forza = 15;

	public Vampiro() {

	}

	@Override
	public int getForza() {
		// TODO Auto-generated method stub
		return forza;
	}

	@Override
	public void azzanna() {
		// TODO Auto-generated method stub
		this.forza -= 2;
	}

	public void setForza(int forza) {
		this.forza = forza;
	}

}
