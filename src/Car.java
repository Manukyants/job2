public class Car extends Transport {
        public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void diagnostik() {

    }

    public void updateTyre() {
        System.out.println("������ �������� ����������" + " " + getModelName());
    }

    @Override
    public void transportService(){
        updateTyre();
        checkEngine();

    }

    public void checkEngine() {
        System.out.println("��������� ��������� ����������" + " " + getModelName());
    }
}
