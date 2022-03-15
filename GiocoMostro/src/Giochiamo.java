
public class Giochiamo {

	public static void main(String[] args) {
		//stato notte
		String notte = "luna piena";

		//instanze di: Eroe , Licantropo, Vampiro
		Eroe eroe = new Eroe();
		Licantropo licantropo = new Licantropo();
		Vampiro vampiro = new Vampiro();

		//check se Licantropo e mostro o umano (dipende dalla notte)
		if (notte.equals("luna ")) {
			licantropo.setUomo(false);
		} else {
			licantropo.setUomo(true);
		}

		//combatti se uomo azzanna se mostro(2 volte)
		if (licantropo.isUomo() == false) {
			for (int i = 0; i < 2; i++) {

				licantropo.azzanna();

			}
			System.out.println("licantropo(licantropo)" + licantropo.getForzaMostro());
		} else {
			for (int i = 0; i < 2; i++) {

				licantropo.combatti();

			}
			System.out.println("umano(licantropo)" + licantropo.getForzaUmano());
		}
		
		//combatti eroe (3 volte)
		for (int i = 0; i < 3; i++) {

			eroe.combatti();
		}

		//azanna vampiro 
		vampiro.azzanna();

		
		//stampa forza eroe e vampiro finale
		System.out.println("eroe " + eroe.getForza());

		System.out.println("vampiro " + vampiro.getForza());

	}

}
