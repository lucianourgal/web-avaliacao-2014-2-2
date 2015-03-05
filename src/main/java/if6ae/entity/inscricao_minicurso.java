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
public class inscricao_minicurso implements Serializable {
    @Id
    private Long ID, minicurso, data_hora, situacao;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
        
    }

    /**
     * @return the minicurso
     */
    public Long getMinicurso() {
        return minicurso;
    }

    /**
     * @param minicurso the minicurso to set
     */
    public void setMinicurso(Long minicurso) {
        this.minicurso = minicurso;
    }
    
}
