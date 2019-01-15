package testJava;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class testJava {

	public static void main(String[] args) {
		
		Integer[] l1 = new Integer[] {1, 2, 3, 4, 5};
		
		System.out.println(getSousListes(Arrays.asList(l1), 1));

		
		
		
	}

	// Retourne une liste de sous liste, où chaque sous liste a au maximum "taille" éléments
	static List<List<Integer>> getSousListes(List<Integer> liste, int taille) {
		// Liste qui contiendra les sous listes
		List<List<Integer>> sousListes = new LinkedList<List<Integer>>();
		// Pour chaque portion de liste inférieur ou égale à "taille", on ajoute la sous liste correspondante
		for (int i = 0; i < liste.size(); i += taille) {
			sousListes.add(liste.subList(i, Math.min(i + taille, liste.size())));
		}

		return sousListes;
	}

}
