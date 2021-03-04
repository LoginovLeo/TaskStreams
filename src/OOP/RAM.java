package OOP;

public class RAM extends Motherboard {


    public RAM(int id, String producer, String model, String serialNumber, ConnectionType connectionType, double price, int memoryVolume) {
        super(id, producer, model, serialNumber, connectionType, price, memoryVolume);
    }


    @Override
    public String toString() {
        return "RAM connected : " +
                "id=" + id +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' ;
    }
}
