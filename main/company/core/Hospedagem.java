package company.core;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.ZonedDateTime;
import java.util.List;

public abstract class Hospedagem {

	public Hospedagem() {
		super();
	}

	public BigDecimal calcular(Hotel hotel, List<ZonedDateTime> listaDatas) {

		BigDecimal total = BigDecimal.ZERO;

		for (int i = 0; i < listaDatas.size(); i++) {

			if (isFinalSemana(listaDatas.get(i))) {
				total = total.add(calculoFinalSemana(hotel));
			} else {
				total = total.add(calculoSemana(hotel));
			}

		}

		return total;

	}

	private static boolean isFinalSemana(ZonedDateTime zdt) {
		return zdt.getDayOfWeek().equals(DayOfWeek.SATURDAY) || zdt.getDayOfWeek().equals(DayOfWeek.SUNDAY);
	}

	abstract BigDecimal calculoSemana(Hotel hotel);

	abstract BigDecimal calculoFinalSemana(Hotel hotel);

}