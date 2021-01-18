package company;

import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;

import company.core.Bridgewood;
import company.core.Hospedagem;
import company.core.HospedagemRegular;
import company.core.HospedagemReward;
import company.core.Hotel;
import company.core.HotelLakewood;
import company.core.Ridgewood;

public class Executor extends CalculadoraHotelImpl {

	private String tipoCliente;

	Executor(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	@Override
	Hospedagem getHospedagem() {

		return getTipoCliente().equalsIgnoreCase("Regular") ? new HospedagemRegular() : new HospedagemReward();
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public static void main(String[] args) {

		String arquivo = Arquivo.lerArquivoResource("input.txt");

		String[] tipoCliente = arquivo.split("\\:");
		String[] datas = tipoCliente[1].split(",");

		Executor executor = new Executor(tipoCliente[0]);
		List<ZonedDateTime> listDatasConvertidas = ConversorData.converterStringData(datas);
		List<Hotel> getListHotel = getListHoteis();
		Hotel hotel = executor.maisBarato(getListHotel, listDatasConvertidas);
		System.out.println(hotel.getNome());

	}
	
	private static List<Hotel> getListHoteis() {
		Hotel hotelLakewood = new HotelLakewood();

		Hotel bridgewood = new Bridgewood();

		Hotel ridgewood = new Ridgewood();

		return Arrays.asList(hotelLakewood, bridgewood, ridgewood);
	}
}
