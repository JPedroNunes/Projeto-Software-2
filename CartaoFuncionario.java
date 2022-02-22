

import java.util.ArrayList;
import java.util.Scanner;

public class CartaoFuncionario {
    public void bater_ponto(Scanner sc , ArrayList<Funcionario> funcionarios){
        while(1 > 0){
            System.out.print("\nCaso deseje voltar ao menu anterior, digite 0");
            System.out.print("\nID do funcionário: ");
            int id_f = sc.nextInt();
            if((id_f <= funcionarios.size()) && funcionarios.get((id_f-1)).tipo_funcionario.equals("hourly")){
                System.out.print("\nHora da entrada: ");
                int hora_entrada = sc.nextInt();

                System.out.print("\nHora da saída: ");
                int hora_saída = sc.nextInt();

                int hora_trabalhada = hora_saída - hora_entrada;
                
                Funcionario temporário = funcionarios.get((id_f-1));
                temporário.setHoras(hora_trabalhada);
                
                // funcionarios.remove((id_f-1));
                funcionarios.set((id_f-1),temporário);

                break;
            }
            else if(id_f == 0){
                break;
            }
            else{
                System.out.println("\nID não é de um funcionário horista.");
                System.out.println("Tente novamente.\n");
            }

        }
    }
}
