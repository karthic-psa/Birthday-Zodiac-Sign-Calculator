package BirthDay;

import static org.junit.Assert.*;

import org.junit.Test;

public class testingZodiac {

	@Test
	public void testing()  {
		  
		zodiacSign zo = new zodiacSign();
		assertEquals("Aries",zo.zodaicSign(3,26));
	}
	@Test
	public void testing1()  {
		  
		zodiacSign zo = new zodiacSign();
		assertEquals("Taurus",zo.zodaicSign(4,29));
	}
	@Test
	public void testing2()  {
		  
		zodiacSign zo = new zodiacSign();
		assertEquals("Gemini",zo.zodaicSign(5,26));
	}
	@Test
	public void testing3()  {
		  
		zodiacSign zo = new zodiacSign();
		assertEquals("Cancer",zo.zodaicSign(6,30));
	}
	@Test
	public void testing4()  {
		  
		zodiacSign zo = new zodiacSign();
		assertEquals("Leo",zo.zodaicSign(7,28));
	}
	@Test
	public void testing5()  {
		  
		zodiacSign zo = new zodiacSign();
		assertEquals("Virgo ",zo.zodaicSign(8,25));
	}
	@Test
	public void testing6()  {
		  
		zodiacSign zo = new zodiacSign();
		assertEquals("Libra",zo.zodaicSign(10,18));
	}
	@Test
	public void testing7()  {
		  
		zodiacSign zo = new zodiacSign();
		assertEquals("Scorpio",zo.zodaicSign(10,27));
	}
	@Test
	public void testing8()  {
		  
		zodiacSign zo = new zodiacSign();
		assertEquals("Sagittarius",zo.zodaicSign(11,23));
	}
	@Test
	public void testing9()  {
		  
		zodiacSign zo = new zodiacSign();
		assertEquals("Capricorn",zo.zodaicSign(12,25));
	}
        @Test
	public void testing10()  {
		  
		zodiacSign zo = new zodiacSign();
		assertEquals("Aquarius",zo.zodaicSign(1,24));
       }
       @Test
	public void testing11()  {
		  
		zodiacSign zo = new zodiacSign();
		assertEquals("Pisces",zo.zodaicSign(2,28));
       }
}
