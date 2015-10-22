package es.upm.miw.pd.factoryMethod.naturalnumber;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.miw.pd.factoryMethod.naturalNumber.CreateNatNumEn;
import es.upm.miw.pd.factoryMethod.naturalNumber.CreateNatNumEs;
import es.upm.miw.pd.factoryMethod.naturalNumber.CreateNatNumFr;
import es.upm.miw.pd.factoryMethod.naturalNumber.LanguageManager;
import es.upm.miw.pd.factoryMethod.naturalNumber.NaturalNumber;
import es.upm.miw.pd.factoryMethod.naturalNumber.NaturalNumberCreator;

public class FactoryMethodTest {
	
	LanguageManager manager = new LanguageManager();
	NaturalNumberCreator number[] = {new CreateNatNumEs(), new CreateNatNumEn(), new CreateNatNumFr()};
	NaturalNumber natural;

	@Test
	public void FactoryTestEspanol(){
		manager.setNaturalNumber(number[0]);
		natural = number[0].createNaturalNumber(0);
		assertEquals("cero",natural.getTextValue());
		natural = number[0].createNaturalNumber(1);
		assertEquals("uno",natural.getTextValue());
		natural = number[0].createNaturalNumber(2);
		assertEquals("dos",natural.getTextValue());
		natural = number[0].createNaturalNumber(3);
		assertEquals("tres",natural.getTextValue());
		natural = number[0].createNaturalNumber(4);
		assertEquals("cuatro",natural.getTextValue());
		natural = number[0].createNaturalNumber(5);
		assertEquals("cinco",natural.getTextValue());
	}
	
	@Test
	public void FactoryTestEnglish(){
		manager.setNaturalNumber(number[1]);
		natural = number[1].createNaturalNumber(0);
		assertEquals("zero",natural.getTextValue());
		natural = number[1].createNaturalNumber(1);
		assertEquals("one",natural.getTextValue());
		natural = number[1].createNaturalNumber(2);
		assertEquals("two",natural.getTextValue());
		natural = number[1].createNaturalNumber(3);
		assertEquals("three",natural.getTextValue());
		natural = number[1].createNaturalNumber(4);
		assertEquals("four",natural.getTextValue());
		natural = number[1].createNaturalNumber(5);
		assertEquals("five",natural.getTextValue());
	}
	
	@Test
	public void FactoryTestFrench(){
		manager.setNaturalNumber(number[2]);
		natural = number[2].createNaturalNumber(0);
		assertEquals("zéro",natural.getTextValue());
		natural = number[2].createNaturalNumber(1);
		assertEquals("un",natural.getTextValue());
		natural = number[2].createNaturalNumber(2);
		assertEquals("deux",natural.getTextValue());
		natural = number[2].createNaturalNumber(3);
		assertEquals("trois",natural.getTextValue());
		natural = number[2].createNaturalNumber(4);
		assertEquals("quatre",natural.getTextValue());
		natural = number[2].createNaturalNumber(5);
		assertEquals("cinq",natural.getTextValue());
	}

}
