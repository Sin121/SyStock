package Classes;
// Generated 05/07/2014 23:51:54 by Hibernate Tools 3.6.0



/**
 * Fabricante generated by hbm2java
 */
public class Fabricante  implements java.io.Serializable {


     private Integer codFabricante;
     private String nome;

    public Fabricante() {
    }

    public Fabricante(String nome) {
       this.nome = nome;
    }
   
    public Integer getCodFabricante() {
        return this.codFabricante;
    }
    
    public void setCodFabricante(Integer codFabricante) {
        this.codFabricante = codFabricante;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }




}


