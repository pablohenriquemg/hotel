package company;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;

import company.core.Hospedagem;
import company.core.Hotel;

public abstract class CalculadoraHotelImpl implements CalculadoraHotel {

	public Hotel maisBarato(List<Hotel> list, List<ZonedDateTime> listDatas) {
		Hotel hotelMaisBarato = null;
		BigDecimal precoAnterior = BigDecimal.ZERO;

		for (int i = 0; i < list.size(); i++) {

			BigDecimal precoAtual = getHospedagem().calcular(list.get(i), listDatas);

			if (precoAnterior == BigDecimal.ZERO) {
				precoAnterior = precoAtual;
				hotelMaisBarato = list.get(i);
			}
			if (precoAtual.compareTo(precoAnterior) == -1) {
				precoAnterior = precoAtual;
				hotelMaisBarato = list.get(i);
			}
			if (precoAtual.compareTo(precoAnterior) == 0
					&& hotelMaisBarato.getClassificacao() < list.get(i).getClassificacao()) {
				precoAnterior = precoAtual;
				hotelMaisBarato = list.get(i);
			}

		}

		return hotelMaisBarato;
	}

	abstract Hospedagem getHospedagem();

}
