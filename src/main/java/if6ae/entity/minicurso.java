/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if6ae.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author a951277
 */

@Entity
public class minicurso {
    @Id
    private Long ID;
    private String descricao;
    private String ministrante;
    private String vagas;
    
    
    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the ministrante
     */
    public String getMinistrante() {
        return ministrante;
    }

    /**
     * @param ministrante the ministrante to set
     */
    public void setMinistrante(String ministrante) {
        this.ministrante = ministrante;
    }

    /**
     * @return the vagas
     */
    public String getVagas() {
        return vagas;
    }

    /**
     * @param vagas the vagas to set
     */
    public void setVagas(String vagas) {
        this.vagas = vagas;
    }
    
}
