
public class Licantropo implements Umano,Mostro {

	private boolean isUomo;
	private int forzaUmano=10;
	private int forzaMostro=15;
	
	public Licantropo() {
		
	}

	@Override
	public int getForza() {
		// TODO Auto-generated method stub
		return forzaUmano;
	}

	@Override
	public void azzanna() {
		// TODO Auto-generated method stub
		this.forzaMostro-=2;
	}

	@Override
	public void combatti() {
		// TODO Auto-generated method stub
		this.forzaUmano-=3;
	}

	public boolean isUomo() {
		return isUomo;
	}

	public void setUomo(boolean isUomo) {
		this.isUomo = isUomo;
	}

	public int getForzaUmano() {
		return forzaUmano;
	}

	public void setForzaUmano(int forzaUmano) {
		this.forzaUmano = forzaUmano;
	}

	public int getForzaMostro() {
		return forzaMostro;
	}

	public void setForzaMostro(int forzaMostro) {
		this.forzaMostro = forzaMostro;
	}
	
	
	
	
	
}
