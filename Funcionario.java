import java.util.ArrayList;

public class Funcionario extends Geral{
    command var;
    String nome;
    String endereço;
    String sindicato;
    public String tipo_funcionario;
    public String f_commissioned;
    String metodo_pagamento;
    public String dia_pagamento;
    public double salário;
    public double salário_extra;
    public double horas;
    public double hora_extra;
    double comissão;
    public double porcent;

    public void dados(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Endereço: "+this.endereço);
        System.out.println("Tem sindicato? "+this.sindicato);
        System.out.println("Tipo de funcionario: "+this.tipo_funcionario);
        System.out.println("Tem comissão? "+this.f_commissioned);
        System.out.println("Metodo de recebimento: "+this.metodo_pagamento);
        System.out.println("Dia do pagamento: "+this.dia_pagamento);
        if(this.tipo_funcionario.equals("hourly")){
            System.out.println("Valor ganho por hora: "+this.salário);
            System.out.println("Horas trabalhadas: "+this.horas);
            System.out.println("Horas extras: "+this.hora_extra);
        }
        else if(this.f_commissioned.equals("Sim")){
            System.out.println("Valor ganho por mês: "+this.salário);
            System.out.println("Valor extra ganho no mês: "+this.salário_extra);
        }
        else{
            System.out.println("Valor ganho por mês: "+this.salário);
        }
    }

    public void comission_value(double salário_extra){
        this.salário_extra += salário_extra;
    }

    public void setReg(String nome, String endereço, String sindicato, String tipo_funcionario, String f_commissioned, Double salário, Double porcent){
        this.nome = nome;
        this.endereço = endereço;
        this.sindicato = sindicato;
        this.tipo_funcionario = tipo_funcionario;
        this.f_commissioned = f_commissioned;
        this.salário = salário;
        this.porcent = porcent;
    }

    public void setHoras(double horas){
        ArrayList<Double> parametro = new ArrayList<>();
        if(horas > 8){
            this.hora_extra += horas - 8;
            parametro.add(horas);
            parametro.add(this.hora_extra);
            var = new Hora_mais();
        }
        else{
            var = new Hora_menos();
        }
        this.horas += var.valor_d(parametro);
    }

    public void zerarHora(){
        this.hora_extra = 0;
        this.horas = 0;
    }

    public void setDia(String dia_pagamento){
        this.dia_pagamento = dia_pagamento;
    }

    public void setComission(double comissão){
        this.comissão = comissão;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEndereço(String endereço){
        this.endereço = endereço;
    }

    public void setTipoFun(String tipo_funcionario){
        this.tipo_funcionario = tipo_funcionario;
    }

    public void setMetodoPag(String metodo_pagamento){
        this.metodo_pagamento = metodo_pagamento;
    }

    public void setSindicato(String sindicato){
        this.sindicato = sindicato;
    }

}

