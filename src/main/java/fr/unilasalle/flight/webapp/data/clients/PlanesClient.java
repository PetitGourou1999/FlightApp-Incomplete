package fr.unilasalle.flight.webapp.data.clients;

import fr.unilasalle.flight.webapp.data.dtos.PlaneDTO;
import fr.unilasalle.flight.webapp.data.dtos.error.ErrorWrapperDTO;
import jakarta.enterprise.context.Dependent;

import java.util.ArrayList;
import java.util.List;

@Dependent
public class PlanesClient {

    public List<PlaneDTO> getPlanes() {
        return new ArrayList<>();
    }

    public ErrorWrapperDTO createPlane(PlaneDTO plane) {
        return new ErrorWrapperDTO();
    }

}
