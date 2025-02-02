package no.hvl.dat100.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import no.hvl.dat100.jplab11.oppgave2.Bilde;
import no.hvl.dat100.jplab11.oppgave2.Tekst;
import no.hvl.dat100.jplab11.oppgave3.Blogg;
import no.hvl.dat100.jplab11.oppgave5.LesBlogg;

public class TestLesBlogg {

	private static final String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/tests/";

	private static final String FILNAVN = "bloggkorrekt.dat";

	@Test
	public void testles() {

		Blogg samling = LesBlogg.les(MAPPE, FILNAVN);

		Tekst innlegg1 = new Tekst(1, "Ole Olsen", "23-10", "en tekst");
		Bilde innlegg2 = new Bilde(2, "Oline Olsen", "24-10", "et bilde", "http://www.picture.com/oo.jpg");

		assertEquals(samling.getAntall(), 2);
		assertTrue(samling.finnes(innlegg1));
		assertTrue(samling.finnes(innlegg2));

		System.out.println(samling);
	}

}
