public class KelvinAFahrenheit implements ConversionTemperatura {

    public KelvinAFahrenheit() {
    }
    
     @Override
            public double convertir(double valor) {
                return 1.8 * (valor - 273.15) + 32;
                
            }
    
}
