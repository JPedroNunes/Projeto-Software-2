

import java.util.ArrayList;
import java.util.Scanner;

public class TaxaServico {
    public void taxa(Scanner sc, ArrayList<Sindicato> sindicato_f){
        while(1 > 0){
            System.out.println("\nDigite 0 para sair");
            int id_s;
            System.out.println("Digite o ID do funcionário no sindicato: ");
            id_s = sc.nextInt();
            if(id_s == 0){
                break;
            }
            else if(id_s <= sindicato_f.size()){
                double taxa = 0.0;
                System.out.print("Digite a taxa de serviço: ");
                taxa = sc.nextDouble();

                Sindicato temp = sindicato_f.get((id_s-1));
                temp.serviço(taxa);

                sindicato_f.set((id_s-1), temp);
                break;
            }
            else{
                System.out.println("\nID inválido, tente novamente");
            }
        }
    }
}
