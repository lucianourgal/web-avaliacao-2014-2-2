/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if6ae.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author a951277
 */
@Entity
public class inscricao implements Serializable {
    @Id
    private Long ID;
    private String nome;
    private String cidade;
    private String estado;
    private String cpf;
    private String categoria;
    private String complemento_categoria;
    private String atuacao_empresa;
    private String fone;
    private String email;
    private String endereco;
    private String complemento;
    private String bairro;
    private String cep;
    private String participacao;
    private String datahora;
    private String situacao;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the complemento_categoria
     */
    public String getComplemento_categoria() {
        return complemento_categoria;
    }

    /**
     * @param complemento_categoria the complemento_categoria to set
     */
    public void setComplemento_categoria(String complemento_categoria) {
        this.complemento_categoria = complemento_categoria;
    }

    /**
     * @return the atuacao_empresa
     */
    public String getAtuacao_empresa() {
        return atuacao_empresa;
    }

    /**
     * @param atuacao_empresa the atuacao_empresa to set
     */
    public void setAtuacao_empresa(String atuacao_empresa) {
        this.atuacao_empresa = atuacao_empresa;
    }

    /**
     * @return the fone
     */
    public String getFone() {
        return fone;
    }

    /**
     * @param fone the fone to set
     */
    public void setFone(String fone) {
        this.fone = fone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the participacao
     */
    public String getParticipacao() {
        return participacao;
    }

    /**
     * @param participacao the participacao to set
     */
    public void setParticipacao(String participacao) {
        this.participacao = participacao;
    }

    /**
     * @return the datahora
     */
    public String getDatahora() {
        return datahora;
    }

    /**
     * @param datahora the datahora to set
     */
    public void setDatahora(String datahora) {
        this.datahora = datahora;
    }

    /**
     * @return the situacao
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
}
