

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;
import java.time.format.TextStyle;

public class Pagamento {
    public void pagar(ArrayList<Funcionario> funcionarios){
        System.out.println("\nFuncionarios pagos:\n");
                LocalDate today = LocalDate.now();
                int data_hoje = today.getDayOfMonth();
                String pagamento_hoje = "mensal " + String.valueOf(data_hoje);
                int i = 0;
                while(i < funcionarios.size()){
                    if(pagamento_hoje.equals(funcionarios.get(i).dia_pagamento)){
                        System.out.print("ID: "+(i+1)+"; Valor recebido: ");
                        if(funcionarios.get(i).tipo_funcionario.equals("hourly")){
                            double soma = ((funcionarios.get(i).salário*funcionarios.get(i).horas)+((funcionarios.get(i).salário*1.5)*funcionarios.get(i).hora_extra));
                            System.out.println(soma);
                            Funcionario f_t = funcionarios.get(i);
                            f_t.zerarHora();
                            funcionarios.set(i, f_t);
                        }
                        else if(funcionarios.get(i).tipo_funcionario.equals("assalaried")){
                            if(funcionarios.get(i).f_commissioned.equals("Sim")){
                                System.out.println(funcionarios.get(i).salário+"+"+funcionarios.get(i).salário_extra);
                                double soma = (funcionarios.get(i).salário + funcionarios.get(i).salário_extra);
                                System.out.println(soma);
                                Funcionario f_t = funcionarios.get(i);
                                f_t.comission_value(0);
                                funcionarios.set(i, f_t);
                            }
                            else{
                                System.out.println(funcionarios.get(i).salário);
                            }
                        }
                    }
                    i+=1;
                }

                i = 0;
                int semana = Calendar.WEEK_OF_MONTH;
                if(semana % 2 == 0){
                    semana = 2;
                }
                else{
                    semana = 1;
                }
                String name_dia = today.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.getDefault());
                if(name_dia.equals("dom")){
                    name_dia = "domingo";
                }
                else if(name_dia.equals("seg")){
                    name_dia = "segunda";
                }
                else if(name_dia.equals("ter")){
                    name_dia = "terça";
                }
                else if(name_dia.equals("qua")){
                    name_dia = "quarta";
                }
                else if(name_dia.equals("qui")){
                    name_dia = "quinta";
                }
                else if(name_dia.equals("sex")){
                    name_dia = "sexta";
                }
                else if(name_dia.equals("sab")){
                    name_dia = "sábado";
                }
                pagamento_hoje = "semanal " + String.valueOf(semana) + " " + name_dia;
                // System.out.println(pagamento_hoje);

                while(i < funcionarios.size()){
                    if(pagamento_hoje.equals(funcionarios.get(i).dia_pagamento)){
                        System.out.print("ID: "+(i+1)+"; Valor recebido: ");
                        if(funcionarios.get(i).tipo_funcionario.equals("hourly")){
                            double soma = ((funcionarios.get(i).salário*funcionarios.get(i).horas)+((funcionarios.get(i).salário*1.5)*funcionarios.get(i).hora_extra));
                            System.out.println(soma);
                            Funcionario f_t = funcionarios.get(i);
                            f_t.zerarHora();
                            funcionarios.set(i, f_t);
                        }
                        else if(funcionarios.get(i).tipo_funcionario.equals("assalaried")){
                            if(funcionarios.get(i).f_commissioned.equals("Sim")){
                                System.out.println(funcionarios.get(i).salário+"+"+funcionarios.get(i).salário_extra);
                                double soma = (funcionarios.get(i).salário + funcionarios.get(i).salário_extra);
                                System.out.println(soma);
                                Funcionario f_t = funcionarios.get(i);
                                f_t.comission_value(0);
                                funcionarios.set(i, f_t);
                            }
                            else{
                                System.out.println(funcionarios.get(i).salário);
                            }
                        }
                    }
                    i+=1;
                }
    }
}
