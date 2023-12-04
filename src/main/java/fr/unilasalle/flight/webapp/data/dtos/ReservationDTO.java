package fr.unilasalle.flight.webapp.data.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ReservationDTO implements Serializable {
    private Long id;

    private FlightDTO flight;

    private PassengerDTO passenger;


    public String getFlightNumber() {
        return flight.getNumber();
    }

    public String getPassengerName() {
        return String.format("%s %s", passenger.getSurname(), passenger.getFirstname());
    }
}
