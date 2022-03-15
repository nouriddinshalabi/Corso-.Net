
public class Eroe implements Umano{

	
	private int forza = 10;
	
	public Eroe() {
		
	}
	
	
	@Override
	public int getForza() {
		// TODO Auto-generated method stub
		return forza;
	}

	@Override
	public void combatti() {
		// TODO Auto-generated method stub
		this.forza-=3;
	}


	public void setForza(int forza) {
		this.forza = forza;
	}
	
	
	
	

	
}
