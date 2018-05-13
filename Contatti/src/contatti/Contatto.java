/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contatti;

/**
 *
 * @author marco.pistollato
 */
public class Contatto {

    private String persona;
    private String nome;
    private String cognome;
    private String email;

    public Contatto(String persona, String nome, String cognome, String email) {
        this.persona = persona;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
    }

    public String getPersona() {
        return persona;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getEmail() {
        return email;
    }
}
