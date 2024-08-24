public class FahrenheitACelsios implements ConversionTemperatura {
    public FahrenheitACelsios(){

    }


    @Override
    public double convertir(double valor) {
        return (valor - 32) / 1.8;
    }


}