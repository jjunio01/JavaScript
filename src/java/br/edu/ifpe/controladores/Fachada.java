/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.controladores;

import br.edu.ifpe.infraestrutura.repositorios.implementacoes.RepositorioClienteImplMEMO;
import br.edu.ifpe.infraestrutura.repositorios.implementacoes.RepositorioPlanoImplMEMO;
import br.edu.ifpe.infraestrutura.repositorios.interfaces.RepositorioGenerico;
import br.edu.ifpe.negocio.Cliente;
import br.edu.ifpe.negocio.Funcionario;
import br.edu.ifpe.negocio.Plano;
import java.util.List;

/**
 *
 * @author 1860915
 */
public class Fachada {

    private static Fachada myself = null;

    RepositorioGenerico<Cliente> repositorioCliente = null;
    RepositorioGenerico<Plano> repositorioPlanos = null;

    public static Fachada getInstance() {
        if (myself == null) {
            myself = new Fachada();
        }

        return myself;
    }

    private Fachada() {
        this.repositorioCliente = new RepositorioClienteImplMEMO();
        this.repositorioPlanos = new RepositorioPlanoImplMEMO();
    }

    public void inserir(Cliente c) {
        this.repositorioCliente.inserir(c);
    }

    public void alterar(Cliente c) {
        this.repositorioCliente.alterar(c);
    }

    public Cliente recuperarCliente(int codigo) {
        return this.repositorioCliente.recuperar(codigo);
    }

    public void deletar(Cliente c) {
        this.repositorioCliente.deletar(c);
    }

    public List<Cliente> recuperarTodosClientes() {
        return this.repositorioCliente.recuperarTodos();
    }

    public void inserir(Plano p) {
        this.repositorioPlanos.inserir(p);
    }

    public void alterar(Plano p) {
        this.repositorioPlanos.alterar(p);
    }

    public Plano recuperarPlano(int codigo) {
        return this.repositorioPlanos.recuperar(codigo);
    }

    public void deletar(Plano p) {
        this.repositorioPlanos.deletar(p);
    }

    public List<Plano> recuperarTodosPlanos() {
        return this.repositorioPlanos.recuperarTodos();
    }

    public Funcionario recuperarFuncionario(int codigo) {
        return null;
    }

    public void inserir(Funcionario f) {

    }

}
