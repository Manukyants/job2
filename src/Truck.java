public class Truck extends Transport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void diagnostik() {

    }

    public void updateTyre() {
        System.out.println("������ �������� ��������� ����");
    }

    @Override
    public void transportService() {
        updateTyre();
        checkEngine();
        checkTrailer();

    }
    public void checkEngine() {
        System.out.println("��������� ��������� ��������� ����");
    }

    public void checkTrailer() {
        System.out.println("��������� ������ � ��������� ����");
    }
}
