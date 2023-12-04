package fr.unilasalle.flight.webapp.ui.views.reservations;

import fr.unilasalle.flight.webapp.data.clients.FlightsClient;
import fr.unilasalle.flight.webapp.data.clients.ReservationsClient;
import fr.unilasalle.flight.webapp.data.dtos.FlightDTO;
import fr.unilasalle.flight.webapp.data.dtos.ReservationDTO;

import java.util.ArrayList;
import java.util.List;

public class ReservationsPresenter {
    private final ReservationsClient reservationsClient;

    private final FlightsClient flightsClient;

    private final ReservationsView view;

    public ReservationsPresenter(ReservationsView view) {
        this.reservationsClient = new ReservationsClient();
        this.flightsClient = new FlightsClient();
        this.view = view;
    }

    private List<FlightDTO> loadFlights() {
        var allFlights = flightsClient.getFlights();
        return allFlights == null ? new ArrayList<>() : allFlights;
    }

    private List<ReservationDTO> loadReservations(FlightDTO flight) {
        var allReservations = reservationsClient.getReservations(flight);
        return allReservations == null ? new ArrayList<>() : allReservations;
    }

    protected void displayFilter() {
        view.constructFilter(loadFlights());
    }

    protected void refreshGrid(FlightDTO flight) {
        view.constructGrid(loadReservations(flight));
    }
}
