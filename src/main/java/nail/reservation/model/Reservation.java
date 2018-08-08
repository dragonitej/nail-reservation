package nail.reservation.model;

import java.util.Date;
import java.util.List;

public class Reservation {
	
	private long id;
	private RESERVATION_STATE state;
	private Date creationDate;
	private Date appointmentDate;
	private Client client;
	private Nailler nailer;
	private List<Care> jobs;
	private int duration; //in minutes
}
