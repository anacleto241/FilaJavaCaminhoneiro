package fila;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fabri
 */
public class Caminhoneiro {
    private String nome;
    private String placa;
    private String horarioChegada;
    private String telefone;
    private String empresa;

    public Caminhoneiro(String nome, String placa, String horarioChegada, String telefone, String empresa) {
        this.nome = nome;
        this.placa = placa;
        this.horarioChegada = horarioChegada;
        this.telefone = telefone;
        this.empresa = empresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getHorarioChegada() {
        return horarioChegada;
    }

    public void setHorarioChegada(String horarioChegada) {
        this.horarioChegada = horarioChegada;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Placa: " + placa + ", Horario de Chegada: " + horarioChegada + 
               ", Telefone: " + telefone + ", Empresa: " + empresa;
    }
}
