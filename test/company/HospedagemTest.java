package company;

import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import company.core.Hospedagem;
import company.core.HospedagemRegular;
import company.core.HospedagemReward;
import company.core.HotelLakewood;

public class HospedagemTest {

	private Hospedagem hospedagemRegular;
	private Hospedagem hospedagemReward;
	
	@Before
	public void before() {
		hospedagemRegular = new HospedagemRegular();
		hospedagemReward = new HospedagemReward();
	}
	
	@Test
	public void testHospedagemRegularSemana() {
		
		BigDecimal result = hospedagemRegular.calcular(new HotelLakewood(), diasSemana());
		assertTrue(BigDecimal.valueOf(220).compareTo(result) == 0);
	}
	
	@Test
	public void testHospedagemRegularSemanaEFinalSemana() {
		
		BigDecimal result = hospedagemRegular.calcular(new HotelLakewood(), diasSemanaEfds());
		assertTrue(BigDecimal.valueOf(200).compareTo(result) == 0);
	}
	
	@Test
	public void testHospedagemRewardSemana() {
		
		BigDecimal result = hospedagemReward.calcular(new HotelLakewood(), diasSemana());
		assertTrue(BigDecimal.valueOf(160).compareTo(result) == 0);
	}
	
	@Test
	public void testHospedagemRewardSemanaEFinalSemana() {
		
		BigDecimal result = hospedagemReward.calcular(new HotelLakewood(), diasSemanaEfds());
		assertTrue(BigDecimal.valueOf(160).compareTo(result) == 0);
	}
	
	private List<ZonedDateTime> diasSemana(){
		ZonedDateTime sex = ZonedDateTime.parse("2011-12-02T00:00:00+03:00");
		ZonedDateTime qui = ZonedDateTime.parse("2011-12-01T00:00:00+03:00");

		return Arrays.asList(sex,qui);
	}
	
	private List<ZonedDateTime> diasSemanaEfds(){
		ZonedDateTime sex = ZonedDateTime.parse("2011-12-02T00:00:00+03:00");
		ZonedDateTime sab = ZonedDateTime.parse("2011-12-03T00:00:00+03:00");

		return Arrays.asList(sab,sex);
	}
}
