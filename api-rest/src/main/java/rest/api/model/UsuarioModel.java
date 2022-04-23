package rest.api.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer codigo;

    @Column
    public String nome;

    @Column
    public String login;

    @Column
    public String senha;
    
    
    public static List<UsuarioModel> converter(List<UsuarioModel> usuarioModels) {
		return null;
	}

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
