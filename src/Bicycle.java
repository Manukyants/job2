public class Bicycle extends Transport {
    public Bicycle(String modelName, int wheelsCount){
        super(modelName, wheelsCount);
    }
    @Override

    public void updateTyre() {
        System.out.println("������ �������� � ����������");
    }

    @Override
    public void transportService() {
        updateTyre();

    }

    @Override
    public void diagnostik(){
    }
}
