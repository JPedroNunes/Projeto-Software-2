

import java.util.ArrayList;
import java.util.Scanner;

public class RemoverFuncionario {
    public void remover(Scanner sc, ArrayList<Funcionario> funcionarios){
        System.out.println("\nDigite o ID correspondente ao funcionário:\n");
                System.out.print("--> ");
                int remover = sc.nextInt();
                while(true){
                    System.out.println("\n1 - Conferir dados");
                    System.out.println("2 - Confirmar remoção");
                    System.out.println("3 - Voltar ao menu anterior\n");
                    System.out.print("--> ");

                    int confirm = sc.nextInt();
                    if(confirm == 1){
                        System.out.println("\n---------Dados do funcionário---------\n");
                        System.out.println("ID: "+(remover));
                        funcionarios.get((remover-1)).dados();
                        continue;
                    }
                    else if(confirm == 2){
                        funcionarios.remove((remover-1));
                        System.out.println("\nFuncionário removido com sucesso\n");
                        break;
                    }
                    else if(confirm == 3){
                        break;
                    }
                    else{
                        System.out.println("\nEntrada inválida, tente novamente.");
                    }
                }
    }
    
}
