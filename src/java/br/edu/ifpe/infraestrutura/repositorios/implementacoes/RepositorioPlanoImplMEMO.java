/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.infraestrutura.repositorios.implementacoes;

import br.edu.ifpe.infraestrutura.repositorios.interfaces.RepositorioGenerico;
import br.edu.ifpe.negocio.Plano;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose Junio
 */
public class RepositorioPlanoImplMEMO implements RepositorioGenerico<Plano> {

    private List<Plano> planos = null;

    public RepositorioPlanoImplMEMO() {
        this.planos = new ArrayList<>();
    }

    @Override
    public void inserir(Plano t) {
        this.planos.add(t);
    }

    @Override
    public void alterar(Plano t) {
        //Implementar
    }

    @Override
    public Plano recuperar(int codigo) {

        for (Plano p : this.planos) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void deletar(Plano t) {
        this.planos.remove(t);
    }

    @Override
    public List<Plano> recuperarTodos() {
        return this.planos;
    }

}
