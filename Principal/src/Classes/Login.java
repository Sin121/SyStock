package Classes;
// Generated 05/07/2014 23:51:54 by Hibernate Tools 3.6.0



/**
 * Login generated by hbm2java
 */
public class Login  implements java.io.Serializable {


     private Integer codLogin;
     private String usuario;
     private String senha;

    public Login() {
    }

    public Login(String usuario, String senha) {
       this.usuario = usuario;
       this.senha = senha;
    }
   
    public Integer getCodLogin() {
        return this.codLogin;
    }
    
    public void setCodLogin(Integer codLogin) {
        this.codLogin = codLogin;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }




}


