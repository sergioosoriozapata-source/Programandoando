package guia2.JavAirlines.Model;

public class Vuelo {

    private int flightId;
    private String destiny;
    private int capability;
    private String status;
    private String origin;

    public Vuelo() {
    }

    public Vuelo(String destiny, int capability, String status, String origin) {
        this.destiny = destiny;
        this.capability = capability;
        this.status = status;
        this.origin = origin;
    }

    public Vuelo(int flightId, String destiny, int capability, String status, String origin) {
        this.flightId = flightId;
        this.destiny = destiny;
        this.capability = capability;
        this.status = status;
        this.origin = origin;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public int getCapability() {
        return capability;
    }

    public void setCapability(int capability) {
        this.capability = capability;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Vuelo #" + flightId + " | " + origin + " -> " + destiny +
               " | Capacidad: " + capability + " | Estado: " + status;
    }
}
