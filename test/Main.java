
import br.edu.ifpe.controladores.Fachada;
import br.edu.ifpe.negocio.Plano;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jose Junio
 */
public class Main {

    public static void main(String[] args) {

        List<Plano> planos = Fachada.getInstance().recuperarTodosPlanos();

        if (planos.isEmpty()) {
            System.out.println("Vazio");
        }
    }
}
