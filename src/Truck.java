public class Truck extends Transport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void diagnostik() {

    }

    public void updateTyre() {
        System.out.println("������ �������� ��������� ����" + " " + getModelName());
    }

    @Override
    public void transportService() {
        updateTyre();
        checkEngine();
        checkTrailer();

    }
    public void checkEngine() {
        System.out.println("��������� ��������� ��������� ����" + " " + getModelName());
    }

    public void checkTrailer() {
        System.out.println("��������� ������ � ��������� ����"  + " " + getModelName());
    }
}
