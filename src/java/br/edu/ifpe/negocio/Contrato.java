/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.negocio;

import java.util.Date;
import java.util.List;

/**
 *
 * @author 1860915
 */
public class Contrato {
    
    private int codigo;
    private Date adesao;
    private Funcionario funcionario;
    private Cliente cliente;
    private List<Plano> planos;

    public Contrato(int codigo, Date adesao, Funcionario funcionario, Cliente cliente, List<Plano> planos) {
        this.codigo = codigo;
        this.adesao = adesao;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.planos = planos;
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getAdesao() {
        return adesao;
    }

    public void setAdesao(Date adesao) {
        this.adesao = adesao;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Plano> getPlanos() {
        return planos;
    }

    public void setPlanos(List<Plano> planos) {
        this.planos = planos;
    }
    
    public double getValorContrato(){
        double valorAuxiliar = 0;
        for(Plano plano:planos){
            valorAuxiliar+=plano.getValorMensal();
        }
        return valorAuxiliar;
    }
    
    
    
}
