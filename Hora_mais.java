import java.util.ArrayList;

public class Hora_mais implements command{
    @Override
    public double valor_d(ArrayList<Double> hora){
        return hora.get(0)-hora.get(1);
    }
}
