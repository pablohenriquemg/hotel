package company.core;

import java.math.BigDecimal;

public class HospedagemRegular extends Hospedagem {

	@Override
	BigDecimal calculoSemana(Hotel hotel) {
		return hotel.getSemanaRegular();
	}

	@Override
	BigDecimal calculoFinalSemana(Hotel hotel) {
		return hotel.getFimSemanaRegular();
	}
}
