

import java.util.ArrayList;
import java.util.Scanner;

public class AddFuncionario {
    public void adicionar(Scanner sc, ArrayList<Funcionario> funcionarios, ArrayList<Sindicato> sindicato_f){
        // removidos.add(false);
        Funcionario temporário = new Funcionario();
        Sindicato temp = new Sindicato();

        System.out.print("\nNome: ");
        // System.out.print("--> ");
        String nome = sc.nextLine();
        
        System.out.print("\nEndereço: ");
        // System.out.print("--> ");
        String endereço = sc.nextLine();

        System.out.println("\nTem sindicato?");
        String sindicato;
        double taxa = 0.0;
        while(1 > 0){
            System.out.println("1 - Sim");
            System.out.println("2 - Não\n");
            System.out.print("--> ");
            int op = sc.nextInt();
            if(op == 1){
                sindicato = "Sim";
                System.out.println("\nDigite a taxa fixa:\n");
                System.out.print("--> ");
                taxa = sc.nextDouble();
                temp.add_sindicato((funcionarios.size()+1), sindicato_f.size(), taxa);
                sindicato_f.add(temp);
                break;
            }
            else if(op == 2){
                sindicato = "Não";
                break;
            }
            else{
                System.out.println("\nEntrada inválida, tente novamente.");
            }
        }

        System.out.println("\nEscolha o tipo de funcionário:");
        String tipo_funcionario;
        String f_commissioned = "Não";
        double porcent = 0.0;
        String diaPaga;
        while(1 > 0){
            System.out.println("1 - hourly");
            System.out.println("2 - assalaried\n");
            System.out.print("--> ");
            int op = sc.nextInt();

            if(op == 1){
                tipo_funcionario = "hourly";
                diaPaga = "semanal 1 sexta";
                break;
            }
            else if(op == 2){
                tipo_funcionario = "assalaried";
                System.out.println("\nEste(a) funcionário(a) terá comissão?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não\n");
                System.out.print("--> ");
                int aux = sc.nextInt();
                if(aux == 1){
                    diaPaga = "semanal 2 sexta";
                    f_commissioned = "Sim";
                    System.out.print("\nDigite a porcentagem que ganhará por comissão: ");
                    porcent = sc.nextDouble();
                    
                }
                else{
                    diaPaga = "mensal $";
                }
                break;
            }
            else{
                System.out.println("\nEntrada Inválida, tente novamente.");
            }
        }

        double salário = 0.0;
        
        if(tipo_funcionario.equals("hourly")){
            System.out.println("\nQual o valor a receber por hora?\n");
            System.out.print("--> ");
            salário = sc.nextDouble();
        }
        else if(tipo_funcionario.equals("assalaried")){
            System.out.println("\nQual o valor a receber mensalmente?\n");
            System.out.print("--> ");
            salário = sc.nextDouble();
        }
        
        String metodo_pag;
        while(1 > 0){
            System.out.println("\n\nEscolha o metodo de pagamento:\n");
            System.out.println("1 - Cheque por correio");
            System.out.println("2 - Cheque em mãos");
            System.out.println("3 - Depósito bancário\n");
            System.out.print("--> ");
            int aux = sc.nextInt();

            if(aux == 1){
                metodo_pag = "Cheque por correio";
                break;
            }
            else if(aux == 2){
                metodo_pag  = "Cheque em mãos";
                break;
            }
            else if(aux == 3){
                metodo_pag = "Depótido bancário";
                break;
            }
            else{
                System.out.println("Tipo inválido");
            }
        }
        temporário.setMetodoPag(metodo_pag);
        
        temporário.setReg(nome, endereço, sindicato, tipo_funcionario, f_commissioned, salário, porcent);
        temporário.setDia(diaPaga);
        funcionarios.add(temporário);
        

        System.out.println("\nFuncionário criado!\n");
        System.out.println("\n---------Dados do funcionário criádo---------\n");
        System.out.println("ID: "+funcionarios.size());
        funcionarios.get((funcionarios.size()-1)).dados();
    }
}
