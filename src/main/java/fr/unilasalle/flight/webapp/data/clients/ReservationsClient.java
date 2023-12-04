package fr.unilasalle.flight.webapp.data.clients;

import fr.unilasalle.flight.webapp.data.constants.Constants;
import fr.unilasalle.flight.webapp.data.dtos.FlightDTO;
import fr.unilasalle.flight.webapp.data.dtos.ReservationDTO;
import fr.unilasalle.flight.webapp.data.dtos.error.ErrorWrapperDTO;
import kong.unirest.core.GenericType;
import kong.unirest.core.Unirest;

import java.util.ArrayList;
import java.util.List;

public class ReservationsClient {

    public List<ReservationDTO> getReservations(FlightDTO flight) {
        return new ArrayList<>();
    }

    public boolean deleteReservation(ReservationDTO reservation) {
       return true;
    }
}
