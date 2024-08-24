public class CelsiosAFahrenheit implements ConversionTemperatura {
    
    public CelsiosAFahrenheit(){
        
    }
        
    @Override
    public double convertir(double valor) {
        return valor * 1.8 + 32;
    }
}