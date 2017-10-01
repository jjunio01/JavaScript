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
public class Funcionario {
    
    private int codigo;
    private String nome;
    private String funcao;

    public Funcionario(int codigo, String nome, String funcao) {
        this.codigo = codigo;
        this.nome = nome;
        this.funcao = funcao;
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

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    
    
}
