

import java.util.ArrayList;
import java.util.Scanner;

public class CriarNovaAgenda {
    public void dias(){
        System.out.println("\nEscolha o dia:");
        System.out.println("1 - domingo");
        System.out.println("2 - segunda");
        System.out.println("3 - terça");
        System.out.println("4 - quarta");
        System.out.println("5 - quinta");
        System.out.println("6 - sexta");
        System.out.println("7 - sábado\n");
        System.out.print("--> ");
    }
    public void criar(Scanner sc, ArrayList<Funcionario> funcionarios, ArrayList<Agenda> dia_do_pagamento){
        Agenda dia_temp = new Agenda();
                String dia_def;
                while(1 > 0){
                    System.out.println("\nEscolha uma opção:");
                    System.out.println("1 - semanal");
                    System.out.println("2 - mensal\n");
                    System.out.print("--> ");

                    int aux = sc.nextInt();
                    int aux2;
                    int dia;
                    
                    if(aux == 1){
                        while(1>0){
                            System.out.println("\nDigite a cada quantas semanas:");
                            System.out.println("1 - A cada 1 semana");
                            System.out.println("2 - A cada 2 semanas\n");
                            System.out.print("--> ");
                            aux2 = sc.nextInt();
                            if(aux2 == 1){
                                while(1 > 0){
                                    dias();
                                    dia = sc.nextInt();
                                    if(dia == 1){
                                        dia_def = "semanal 1 domingo";
                                        break;
                                    }
                                    else if(dia == 2){
                                        dia_def = "semanal 1 segunda";
                                        break;
                                    }
                                    else if(dia == 3){
                                        dia_def = "semanal 1 terça";
                                        break;
                                    }
                                    else if(dia == 4){
                                        dia_def = "semanal 1 quarta";
                                        break;
                                    }
                                    else if(dia == 5){
                                        dia_def = "semanal 1 quinta";
                                        break;
                                    }   
                                    else if(dia == 6){
                                        dia_def = "semanal 1 sexta";
                                        break;
                                    }
                                    else if(dia == 7){
                                        dia_def = "semanal 1 sábado";
                                        break;
                                    }
                                    else{
                                        System.out.println("\nOpção inválida!");
                                    }
                                }
                                break;
                            }
                            else if(aux2 == 2){
                                while(1 > 0){
                                    dias();
                                    dia = sc.nextInt();
                                    if(dia == 1){
                                        dia_def = "semanal 2 domingo";
                                        break;
                                    }
                                    else if(dia == 2){
                                        dia_def = "semanal 2 segunda";
                                        break;
                                    }
                                    else if(dia == 3){
                                        dia_def = "semanal 2 terça";
                                        break;
                                    }
                                    else if(dia == 4){
                                        dia_def = "semanal 2 quarta";
                                        break;
                                    }
                                    else if(dia == 5){
                                        dia_def = "semanal 2 quinta";
                                        break;
                                    }   
                                    else if(dia == 6){
                                        dia_def = "semanal 2 sexta";
                                        break;
                                    }
                                    else if(dia == 7){
                                        dia_def = "semanal 2 sábado";
                                        break;
                                    }
                                    else{
                                        System.out.println("\nOpção inválida!");
                                    }
                                }
                                break;
                            }
                            else{
                                System.out.println("\nOpção inexistente!\n");
                            }
                            
                        }
                        break;
                    }
                    else if(aux == 2){
                        while(1>0){
                            System.out.print("\nDigite o dia do mês (1 a 31): ");
                            aux2 = sc.nextInt();
                            if(aux2 < 1 || aux2 > 31){
                                System.out.println("\nDia inexistente!\n");
                                continue;
                            }
                            else{
                                dia_def = "mensal ";
                                String auux2 = Integer.toString(aux2);
                                dia_def = dia_def + auux2;
                                break;
                            }
                        }
                        break;
                    }
                    else{
                        System.out.println("\nOpção inválida!");
                    }
                }
                dia_temp.setPag(dia_def);
                dia_do_pagamento.add(dia_temp);
    }
}
