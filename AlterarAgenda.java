

import java.util.ArrayList;
import java.util.Scanner;

public class AlterarAgenda {
    public void alterar(Scanner sc , ArrayList<Funcionario> funcionarios, ArrayList<Agenda> dia_do_pagamento){
        int id_f;
                while(1 > 0){
                    System.out.println("\nDigite o id do funcionário: ");
                    id_f = sc.nextInt();
                    if(id_f <= funcionarios.size() && id_f >= 1){
                        break;
                    }
                    else{
                        System.out.println("Funcionario inexistente\n");
                    }
                }
                System.out.println("\nAgenda:\n");
                int i = 0;
                while(i < dia_do_pagamento.size()){
                    System.out.println((i+1)+" - "+dia_do_pagamento.get(i).dia_pagamento);
                    i+=1;
                }
                while(1 > 0){
                    System.out.print("\nEscolha uma das opções anteriores: ");
                    i = sc.nextInt();
                    if(i <= dia_do_pagamento.size()){
                        Funcionario f_temp = new Funcionario();
                        f_temp = funcionarios.get((id_f-1));
                        f_temp.setDia(dia_do_pagamento.get((i-1)).dia_pagamento);

                        funcionarios.set((id_f-1), f_temp);
                        break;
                    }
                    else{
                        System.out.println("\nOpção inválida!\n");
                    }
                }
    }
}
