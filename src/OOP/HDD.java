package OOP;

public class HDD extends Motherboard{

    public HDD(int id, String producer, String model, String serialNumber, ConnectionType connectionType, double price) {
        super(id, producer, model, serialNumber, connectionType, price);
    }

    @Override
    public String toString() {
        return "HDD connected : " +
                "id=" + id +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'';
    }
}
