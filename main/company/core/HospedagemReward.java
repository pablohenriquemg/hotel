package company.core;

import java.math.BigDecimal;

public class HospedagemReward extends Hospedagem {

	@Override
	BigDecimal calculoSemana(Hotel hotel) {
		return hotel.getSemanaReward();
	}

	@Override
	BigDecimal calculoFinalSemana(Hotel hotel) {
		return hotel.getFimSemanaReward();
	}

}
