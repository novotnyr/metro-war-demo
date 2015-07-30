package sk.upjs.ics.novotnyr.metrowardemo;

import java.util.Date;

import javax.jws.WebService;

@WebService
public class DateService {
	public Date getCurrentDate() {
		return new Date();
	}
}
