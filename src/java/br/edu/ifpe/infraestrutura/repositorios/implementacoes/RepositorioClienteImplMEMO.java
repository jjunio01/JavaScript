/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.infraestrutura.repositorios.implementacoes;

import br.edu.ifpe.infraestrutura.repositorios.interfaces.RepositorioGenerico;
import br.edu.ifpe.negocio.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1860915
 */
public class RepositorioClienteImplMEMO implements RepositorioGenerico<Cliente>{
    
    private List<Cliente> clientes = null;

    public RepositorioClienteImplMEMO() {
        this.clientes = new ArrayList<>();
    }
    
    @Override
    public void inserir(Cliente cliente) {
        this.clientes.add(cliente);
    }

    @Override
    public void alterar(Cliente t) {
        for(Cliente c:this.clientes){
            if(t.getCodigo()==c.getCodigo()){
                c.setCpf(t.getCpf());
                c.setDataNascimento(t.getDataNascimento());
                c.setEmail(t.getEmail());
                c.setEndereco(t.getEndereco());
                c.setNome(t.getNome());
                c.setTelefone(t.getTelefone());
                return;
            }
        }
        
    }

    @Override
    public Cliente recuperar(int codigo) {
        for(Cliente c:this.clientes){
            if(c.getCodigo()==codigo){
                return c;
            }
        }
        return null;
    }

    @Override
    public void deletar(Cliente t) {
        this.clientes.remove(t);
    }

    @Override
    public List<Cliente> recuperarTodos() {
        return this.clientes;
    }
    
}
