package com.giovani.cadastro;

public class Formulario {
    private String nome;
    private String telefone;
    private String email;
    private boolean aceitoLista;
    private String sexo;
    private String cidade;
    private String uf;

    //constr

    public Formulario(String nome, String telefone, String email, boolean aceitoLista, String sexo, String cidade, String uf) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.aceitoLista = aceitoLista;
        this.sexo = sexo;
        this.cidade = cidade;
        this.uf = uf;
    }


    public String retornaString(){
        return "Nome: " + nome +
                "\n\tTelefone: " + telefone +
                "\n\tEmail: " + email +
                "\n\tAceitoLista: " + aceitoLista +
                "\n\tSexo: " + sexo +
                "\n\tCidade: " + cidade +
                " - " + uf ;
    }

}
