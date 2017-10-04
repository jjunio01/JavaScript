/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.negocio;

/**
 *
 * @author 1860915
 */
public class Plano {

    private int codigo;
    private String nome;
    private String descricao;
    private String valorMensal;

    public Plano(int codigo, String nome, String descricao, String valorMensal) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.valorMensal = valorMensal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(String valorMensal) {
        this.valorMensal = valorMensal;
    }

}
