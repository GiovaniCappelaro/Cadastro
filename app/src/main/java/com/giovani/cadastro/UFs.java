package com.giovani.cadastro;

//Enum java: https://www.devmedia.com.br/tipos-enum-no-java/25729#1

public enum UFs {
    AC ("Acre"),
    AL ("Alagoas"),
    AP ("Amapá"),
    AM ("Amazonas"),
    BA ("Bahia"),
    CE ("Ceará"),
    DF ("Distrito Federal"),
    ES ("Espírito Santo"),
    GO ("Goiás"),
    MA ("Maranhão"),
    MT ("Mato Grosso"),
    MS ("Mato Grosso do Sul"),
    MG ("Minas Gerais"),
    PA ("Pará"),
    PB ("Paraíba"),
    PR ("Paraná"),
    PE ("Pernambuco"),
    PI ("Piauí"),
    RJ ("Rio de Janeiro"),
    RN ("Rio Grande do Norte"),
    RS ("Rio Grande do Sul"),
    RO ("Rondônia"),
    RR ("Roraima"),
    SC ("Santa Catarina"),
    SP ("São Paulo"),
    SE ("Sergipe"),
    TO ("Tocantins");

    private String estado;

    UFs(String estado) {
        this.estado = estado;
    } //construtor

    @Override
    public String toString() {
        return estado;
    }
}
