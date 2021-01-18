package company;

import static org.junit.Assert.assertEquals;

import java.time.DayOfWeek;
import java.time.ZonedDateTime;
import java.util.List;

import org.junit.Test;

import company.ConversorData;

public class ConversorDataTest {

	@Test
	public void testConversaoData() {
		String[] datas = { "16Mar2009" };
		List<ZonedDateTime> listDatasConvertidas = ConversorData.converterStringData(datas);
		assertEquals(DayOfWeek.MONDAY, listDatasConvertidas.stream().findFirst().get().getDayOfWeek());

	}

	@Test(expected = RuntimeException.class)
	public void testConversaoDataNull() {
		ConversorData.converterStringData(null);

	}
}
