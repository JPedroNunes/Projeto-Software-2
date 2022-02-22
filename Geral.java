
import java.util.ArrayList;
import java.util.Scanner;

public class Geral{
    
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        ArrayList<Sindicato> sindicato_f = new ArrayList<Sindicato>();
        ArrayList<Agenda> dia_do_pagamento = new ArrayList<Agenda>();
        int padrão = 0;
        while(padrão < 3){
            Agenda dia_temp = new Agenda();
            if(padrão == 0){
                dia_temp.setPag("semana 1 sexta");
                dia_do_pagamento.add(dia_temp);
            }
            else if(padrão == 1){
                dia_temp.setPag("semana 2 sexta");
                dia_do_pagamento.add(dia_temp);
            }
            else{
                dia_temp.setPag("mensal $");
                dia_do_pagamento.add(dia_temp);
            }
            padrão+=1;
        }

        int opção = -1;
        while(opção != 0){
            Menu menu = new Menu();
            menu.show();

            Scanner sc = new Scanner(System.in);
            opção = Integer.parseInt(sc.nextLine());
            
            if(opção == 1){
                AddFuncionario add = new AddFuncionario();
                add.adicionar(sc, funcionarios, sindicato_f);
            }
            else if(opção == 2){
                RemoverFuncionario remover = new RemoverFuncionario();
                remover.remover(sc, funcionarios);
            }
            else if(opção == 3){
                ListarFuncionarios listar = new ListarFuncionarios();
                listar.listar(funcionarios);
            }
            else if(opção == 4){
                CartaoFuncionario cartao = new CartaoFuncionario();
                cartao.bater_ponto(sc, funcionarios);
            }
            else if(opção == 5){
                LancarVenda venda = new LancarVenda();
                venda.venda(sc, funcionarios);
            }
            else if(opção == 6){
                TaxaServico taxa = new TaxaServico();
                taxa.taxa(sc, sindicato_f);
            }
            else if(opção == 7){
                AlterarDados mudar = new AlterarDados();
                mudar.alterar(sc, funcionarios, sindicato_f);
            }
            else if(opção == 8){
                Pagamento pagar = new Pagamento();
                pagar.pagar(funcionarios);
            }
            else if(opção == 9){
                AlterarAgenda alterar = new AlterarAgenda();
                alterar.alterar(sc, funcionarios, dia_do_pagamento);
            }
            else if(opção == 10){
                CriarNovaAgenda new_agenda = new CriarNovaAgenda();
                new_agenda.criar(sc, funcionarios, dia_do_pagamento);
            }
            else if(opção == 0){
                System.out.println("\nSaindo...");
            }
            else{
                System.out.println("\nEntrada inválida, tente novamente.");
            }
        }
    }
}