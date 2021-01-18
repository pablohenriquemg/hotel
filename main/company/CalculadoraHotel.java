package company;

import java.time.ZonedDateTime;
import java.util.List;

import company.core.Hotel;

public interface CalculadoraHotel {

	Hotel maisBarato(List<Hotel> list, List<ZonedDateTime> listDatas);
}
