package Classes;
// Generated 05/07/2014 23:51:54 by Hibernate Tools 3.6.0



/**
 * TipoEquipamento generated by hbm2java
 */
public class TipoEquipamento  implements java.io.Serializable {


     private Integer codTipo;
     private String nomeTipoEquip;
     private String descricao;

    public TipoEquipamento() {
    }

    public TipoEquipamento(String nomeTipoEquip, String descricao) {
       this.nomeTipoEquip = nomeTipoEquip;
       this.descricao = descricao;
    }
   
    public Integer getCodTipo() {
        return this.codTipo;
    }
    
    public void setCodTipo(Integer codTipo) {
        this.codTipo = codTipo;
    }
    public String getNomeTipoEquip() {
        return this.nomeTipoEquip;
    }
    
    public void setNomeTipoEquip(String nomeTipoEquip) {
        this.nomeTipoEquip = nomeTipoEquip;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return nomeTipoEquip + ", " + descricao;
    }




}


