package OOP;

public class SSD extends Motherboard{

    public SSD(int id, String producer, String model, String serialNumber, ConnectionType connectionType, double price) {
        super(id, producer, model, serialNumber, connectionType, price);
    }



    @Override
    public String toString() {
        return "SDD connected : " +
                "id=" + id +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' ;
    }
}
