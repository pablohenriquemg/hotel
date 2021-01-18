package company;

import static org.junit.Assert.assertEquals;

import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import company.core.Bridgewood;
import company.core.Hotel;
import company.core.HotelLakewood;
import company.core.Ridgewood;

public class CalculadoraHotelTest {

	@Test
	public void testHotelLakewoodRegularSemana() {
		Executor ex = new Executor("Regular");
		Hotel hotel = ex.maisBarato(Arrays.asList(new HotelLakewood(), new Ridgewood()), diasSemana());
		assertEquals("HotelLakewood", hotel.getNome());
	}

	@Test
	public void testHotelLakewoodRewardSemana() {
		Executor ex = new Executor("Reward");
		Hotel hotel = ex.maisBarato(Arrays.asList(new HotelLakewood(), new Ridgewood()), diasSemana());
		assertEquals("HotelLakewood", hotel.getNome());
	}
	
	@Test
	public void testHotelBridgewoodRegularFinalSemana() {
		Executor ex = new Executor("Regular");
		Hotel hotel = ex.maisBarato(Arrays.asList(new Bridgewood(), new Ridgewood()), diasSemanaEfds());
		assertEquals("Bridgewood", hotel.getNome());
	}

	@Test
	public void testHotelRidgewoodRewardFinalSemana() {
		Executor ex = new Executor("Reward");
		Hotel hotel = ex.maisBarato(Arrays.asList(new Bridgewood(), new Ridgewood()), diasSemanaEfds());
		assertEquals("Ridgewood", hotel.getNome());
	}

	private List<ZonedDateTime> diasSemana() {
		ZonedDateTime sex = ZonedDateTime.parse("2011-12-02T00:00:00+03:00");
		ZonedDateTime qui = ZonedDateTime.parse("2011-12-01T00:00:00+03:00");

		return Arrays.asList(sex, qui);
	}

	private List<ZonedDateTime> diasSemanaEfds() {
		ZonedDateTime sex = ZonedDateTime.parse("2011-12-02T00:00:00+03:00");
		ZonedDateTime sab = ZonedDateTime.parse("2011-12-03T00:00:00+03:00");

		return Arrays.asList(sab, sex);
	}
}
