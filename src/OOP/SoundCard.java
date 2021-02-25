package OOP;

public class SoundCard extends Motherboard{
    public SoundCard(int id, String producer, String model, String serialNumber, ConnectionType connectionType, long price) {
        super(id, producer, model, serialNumber, connectionType, price);
    }


    @Override
    public String toString() {
        return "SoundCard{" +
                "id=" + id +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
