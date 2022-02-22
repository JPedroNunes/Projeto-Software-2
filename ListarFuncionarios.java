

import java.util.ArrayList;

public class ListarFuncionarios {
    public void listar(ArrayList<Funcionario> funcionarios){
        int x = 0;
        while(x < funcionarios.size()){
            System.out.println("\nID: "+ (x+1));
            funcionarios.get((x)).dados();
            x++;
        }
    }
}
