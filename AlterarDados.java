

import java.util.ArrayList;
import java.util.Scanner;

public class AlterarDados {
    public void alterar(Scanner sc, ArrayList<Funcionario> funcionarios, ArrayList<Sindicato> sindicato_f){
        while(1>0){
            System.out.println("\nDigite 0 para sair");
            int id_f;
            System.out.print("\nDigite o ID: ");
            id_f = sc.nextInt();
            if(id_f == 0){
                break;
            }
            else if(id_f <= funcionarios.size()){
                System.out.println("\nO que você deseja alterar?\n");
                System.out.println("1 - Alterar nome");
                System.out.println("2 - Alterar endereço");
                System.out.println("3 - Alterar tipo de funcionário");
                System.out.println("4 - Alterar metodo de pagamento");
                System.out.println("5 - Alterar sindicato");
                System.out.println("6 - Alterar taxa sindical");
                System.out.println("0 - sair");

                int info;
                info = sc.nextInt();
                if(info == 1){
                    Funcionario temporario = funcionarios.get((id_f-1));
                    System.out.println("\nDigite o novo nome:\n");
                    System.out.print("--> ");
                    String temp = sc.nextLine();

                    temporario.setNome(temp);

                    funcionarios.set((id_f-1), temporario);

                    System.out.println("\nNome alterado com sucesso!\n");
                    break;
                }
                else if(info == 2){
                    Funcionario temporario = funcionarios.get((id_f-1));
                    System.out.println("\nDigite o novo endereço:\n");
                    System.out.print("--> ");
                    String temp = sc.nextLine();

                    temporario.setEndereço(temp);

                    funcionarios.set((id_f-1), temporario);

                    System.out.println("\nEndereço alterado com sucesso!\n");
                    break;
                }
                else if(info == 3){
                    Funcionario temporario = funcionarios.get((id_f-1));
                    String tipo_func;
                    while(1 > 0){
                        System.out.println("\nEscolha o novo tipo de funcionario:\n");
                        System.out.println("1 - Hourly");
                        System.out.println("2 - assalaried\n");
                        System.out.print("--> ");
                        int temp = sc.nextInt();

                        if(temp == 1){
                            tipo_func = "hourly";
                            break;
                        }
                        else if(temp == 2){
                            tipo_func = "assalaried";
                            break;
                        }
                        else{
                            System.out.println("Tipo inválido");
                        }
                    }
                    temporario.setTipoFun(tipo_func);

                    funcionarios.set((id_f-1), temporario);

                    System.out.println("\nTipo de funcionário alterado com sucesso!\n");
                    break;
                }
                else if(info == 4){
                    Funcionario temporario = funcionarios.get((id_f-1));
                    String metodo;
                    while(1 > 0){
                        System.out.println("\nEscolha o metodo de pagamento:\n");
                        System.out.println("1 - Cheque por correio");
                        System.out.println("2 - Cheque em mãos");
                        System.out.println("3 - Depósito bancário\n");
                        System.out.print("--> ");
                        int temp = sc.nextInt();

                        if(temp == 1){
                            metodo = "Cheque por correio";
                            break;
                        }
                        else if(temp == 2){
                            metodo  = "Cheque em mãos";
                            break;
                        }
                        else if(temp == 3){
                            metodo = "Depótido bancário";
                            break;
                        }
                        else{
                            System.out.println("Tipo inválido");
                        }
                    }
                    temporario.setMetodoPag(metodo);

                    funcionarios.set((id_f-1), temporario);

                    System.out.println("\nSindicato alterado com sucesso!\n");
                    break;
                }
                else if(info == 5){
                    Funcionario temporario = funcionarios.get((id_f-1));
                    String sind;
                    while(1 > 0){
                        System.out.println("\nEscolha se terá sindicato:\n");
                        System.out.println("1 - Sim");
                        System.out.println("2 - Não\n");
                        System.out.print("--> ");
                        int temp = sc.nextInt();

                        if(temp == 1){
                            sind = "Sim";
                            break;
                        }
                        else if(temp == 2){
                            sind  = "Não";
                            break;
                        }
                        else{
                            System.out.println("Tipo inválido");
                        }
                    }
                    temporario.setSindicato(sind);

                    funcionarios.set((id_f-1), temporario);

                    System.out.println("\nSindicato alterado com sucesso!\n");
                    break;
                }
                else if(info == 6){
                    int x = 0;
                    while(x < sindicato_f.size()){
                        if(id_f == sindicato_f.get(x).funcionario_id){
                            break;
                        }
                        x += 1;
                    }
                    Sindicato temporario = sindicato_f.get(x);
                    System.out.println("\nDigite a nova taxa:\n");
                    System.out.print("--> ");
                    double taxa = 0.0;
                    taxa = sc.nextDouble();

                    temporario.setTaxaFixa(taxa);

                    sindicato_f.set(x, temporario);

                    System.out.println("\nTaxa alterada com sucesso!\n");
                    break;
                }
                else if(info == 0){
                    break;
                }
                else{
                    System.out.println("Opção não está dentre as listadas!");
                }
            }
            else{
                System.out.println("ID inválido!");
            }
        }
    }
}
