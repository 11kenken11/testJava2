package testJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class testJava2 {

	@Test
	public void  testGetSousListes() {
		// on teste la fonction getSousListes avec une partition de taille 2
		List<List<Integer>> result = new ArrayList<>();
		result.add(Arrays.asList(1, 2));
		result.add(Arrays.asList(3, 4));
		result.add(Arrays.asList(5));
		final List<List<Integer>> sousListes = testJava.getSousListes(Arrays.asList(1, 2, 3, 4, 5), 2);
		Assert.assertEquals(result, sousListes);
		
		// on teste la fonction getSousListes avec une partition de taille 3
		result = new ArrayList<>();
		result.add(Arrays.asList(1, 2, 3));
		result.add(Arrays.asList(4, 5));
		final List<List<Integer>> sousListes2 = testJava.getSousListes(Arrays.asList(1, 2, 3, 4, 5), 3);
		Assert.assertEquals(result, sousListes2);
		
		// on teste la fonction getSousListes avec une partition de taille 1
		result = new ArrayList<>();
		result.add(Arrays.asList(1));
		result.add(Arrays.asList(2));
		result.add(Arrays.asList(3));
		result.add(Arrays.asList(4));
		result.add(Arrays.asList(5));
		final List<List<Integer>> sousListes3 = testJava.getSousListes(Arrays.asList(1, 2, 3, 4, 5), 1);
		Assert.assertEquals(result, sousListes3);
	}
}
