package main;

import cidades.buscador.ConsultorCidades;
import console.Console;

public class Main {
    public static Console console;

    public static void main(String[] args) {
        Iniciar();
    }

    public static void Iniciar() {
        console = new Console();

        while (true) {

            int escolhaInicio = console.readInt("Oque deseja fazer?\n[0] Consultar cidades\n[1] Sair");

            if (escolhaInicio == 0) {
                ConsultaCidades();
            } else if (escolhaInicio == 1) {
                System.out.println("encerrando");
                break;
            }
        }
    }

    public static void ConsultaCidades() {

        int escolhaConsultaCidade = console.readInt("Oque deseja fazer?\n[0] Listar cidades\n[1] Buscar por código\n[2] Buscar por nome\n[3] Voltar");

        switch (escolhaConsultaCidade) {

            case 0 -> ConsultorCidades.Listar();
            case 1 -> ConsultorCidades.BuscarCodigo();
            case 2 -> ConsultorCidades.BuscarNome();

            default -> {
            }
        }

    }
}