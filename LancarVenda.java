

import java.util.ArrayList;
import java.util.Scanner;

public class LancarVenda {
    public void venda(Scanner sc , ArrayList<Funcionario> funcionarios){
        System.out.print("\nID do funcionário que vendeu: ");
        int id_f = sc.nextInt();
        if((id_f <= funcionarios.size()) && funcionarios.get((id_f-1)).f_commissioned.equals("Sim")){
            System.out.print("\nInforme o valor do item vendido: ");
            double valor_venda = 0.0;
            valor_venda = sc.nextDouble();
            valor_venda = valor_venda * (funcionarios.get((id_f-1)).porcent/100);

            Funcionario temporário = funcionarios.get((id_f-1));
            temporário.comission_value(valor_venda);
                    
            // funcionarios.remove((id_f-1));
            funcionarios.set((id_f-1),temporário);

        }
    }
}
