package OOP;

public class VideoCard extends Motherboard{
    public VideoCard(int id, String producer, String model, String serialNumber, ConnectionType connectionType, double price) {
        super(id, producer, model, serialNumber, connectionType, price);
    }

    @Override
    public String toString() {
        return "VideoCard{" +
                "id=" + id +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
