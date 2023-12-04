package fr.unilasalle.flight.webapp.data.clients;

import fr.unilasalle.flight.webapp.data.dtos.FlightDTO;
import fr.unilasalle.flight.webapp.data.dtos.error.ErrorWrapperDTO;

import java.util.ArrayList;
import java.util.List;

public class FlightsClient {

    public List<FlightDTO> getFlights() {
        return new ArrayList<>();
    }

    public ErrorWrapperDTO createFlight(FlightDTO flight) {
        return new ErrorWrapperDTO();
    }

    public ErrorWrapperDTO deleteFlight(FlightDTO flight) {
        return new ErrorWrapperDTO();
    }
}
