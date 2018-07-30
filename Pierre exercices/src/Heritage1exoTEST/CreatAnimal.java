package Heritage1exoTEST;

public class CreatAnimal {


		public static void main(String argv[]) {
			
			Chien monChien = new Chien();
			monChien.setNom("Medor");
			monChien.setCouleur("Noir");
			System.out.println("Mon chien s'appelle" + monChien.getNom() + " et il fait" + monChien.aboie());
		}
	
}
