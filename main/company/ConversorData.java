package company;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class ConversorData {

	public static List<ZonedDateTime> converterStringData(String[] datas) {
		try {
			List<String> stringsDatas = Arrays.asList(datas);
			List<ZonedDateTime> list = new ArrayList<ZonedDateTime>();

			stringsDatas.stream().forEach(dataString -> {

				String dia = dataString.replaceAll("\\s+", "").substring(0, 2);
				String mes = dataString.replaceAll("\\s+", "").substring(2, 5);
				String ano = dataString.replaceAll("\\s+", "").substring(5, 9);
				LocalDate localDate = LocalDate
						.parse(ano.concat("-").concat(getNumMesDeUmaString(mes)).concat("-").concat(dia));

				ZonedDateTime zdt = localDate.atStartOfDay(ZoneOffset.UTC);
				list.add(zdt);
			});

			return list;
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e.getCause());
		}
	}

	private static String getNumMesDeUmaString(String mes) {
		String mesRetorno = null;

		switch (mes) {
		case "Jan":
			mesRetorno = "01";
			break;
		case "Fev":
			mesRetorno = "02";
			break;
		case "Mar":
			mesRetorno = "03";
			break;
		case "Abr":
			mesRetorno = "04";
			break;
		case "Mai":
			mesRetorno = "05";
			break;
		case "Jun":
			mesRetorno = "06";
			break;
		case "Jul":
			mesRetorno = "07";
			break;
		case "Ago":
			mesRetorno = "08";
			break;
		case "Set":
			mesRetorno = "09";
			break;
		case "Out":
			mesRetorno = "10";
			break;
		case "Nov":
			mesRetorno = "11";
			break;
		case "Dez":
			mesRetorno = "12";
			break;
		}

		return mesRetorno;
	}
}
