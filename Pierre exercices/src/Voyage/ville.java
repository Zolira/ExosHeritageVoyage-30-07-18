package Voyage;


public class ville{

	public static void main(String argv[]) {
		
		Voyage monPays = new Voyage();
		
		
		monPays.setPays("France");
		monPays.setVille("Paris");
		monPays.setTransports("Avion");
		System.out.println("Mon pays d'origine est la " + monPays.getPays() + " et ma ville est " + monPays.getVille() 
		+ "! Pour aller au Japon je dois prendre l'" + monPays.getTransports());
	}

}

