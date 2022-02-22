

public class Sindicato{
    public int funcionario_id;
    int sindicato_id;
    double taxa_fixa;
    double taxa_de_serviço;

    public void add_sindicato(int funcionario_id, int sindicato_id, double taxa_fixa){
        this.funcionario_id = funcionario_id;
        this.sindicato_id = sindicato_id;
        this.taxa_fixa = taxa_fixa;
    }

    public void serviço(double taxa_de_serviço){
        this.taxa_de_serviço += taxa_de_serviço;
    }

    public void setTaxaFixa(double taxa_fixa){
        this.taxa_fixa = taxa_fixa;
    }
}