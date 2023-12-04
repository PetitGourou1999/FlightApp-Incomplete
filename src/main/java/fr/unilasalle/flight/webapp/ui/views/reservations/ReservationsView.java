package fr.unilasalle.flight.webapp.ui.views.reservations;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import fr.unilasalle.flight.webapp.MainLayout;
import fr.unilasalle.flight.webapp.data.dtos.FlightDTO;
import fr.unilasalle.flight.webapp.data.dtos.ReservationDTO;

import java.util.List;

@Route(value = "reservations", layout = MainLayout.class)
@PageTitle("Reservations")
public class ReservationsView extends VerticalLayout {
    private final ReservationsPresenter presenter;

    private final ComboBox<FlightDTO> filter = new ComboBox<>("Please select a Flight Number...");
    ;

    private Grid<ReservationDTO> grid;

    public ReservationsView() {
        presenter = new ReservationsPresenter(this);
        presenter.displayFilter();
    }

    protected void constructFilter(List<FlightDTO> flights) {
        filter.setWidthFull();

        filter.setItems(flights);
        filter.setItemLabelGenerator(FlightDTO::getNumber);
        filter.addValueChangeListener(e -> presenter.refreshGrid(e.getValue()));

        this.add(filter);
    }

    protected void constructGrid(List<ReservationDTO> reservations) {
        if (grid == null) {
            grid = new Grid<>(ReservationDTO.class, false);
            grid.addColumn(ReservationDTO::getFlightNumber).setHeader("Flight Number").setAutoWidth(true);
            grid.addColumn(ReservationDTO::getPassengerName).setHeader("Passenger Name").setAutoWidth(true);

            this.add(grid);
        }
        grid.setItems(reservations);
    }

}
