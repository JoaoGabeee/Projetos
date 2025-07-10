package cidades.buscador;

import main.Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ConsultorCidades {

    private static String[] coluna;

    public static void Listar() {
        String linha;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/cidades/cidades.MUNICCSV"))) {
            while ((linha = bufferedReader.readLine()) != null) {

                coluna = linha.replace("\"", "").split(";");

                linha = "Código: " + coluna[0] + "\nCidade: " + coluna[1] + "\n";

                System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    public static void BuscarCodigo() {

        String codigoDesejado = Main.console.readString("Qual o codigo da cidade?");

        String linha, colunaCodigo;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/cidades/cidades.MUNICCSV"))) {

            while ((linha = bufferedReader.readLine()) != null) {

                coluna = linha.replace("\"", "").split(";");

                colunaCodigo = coluna[0];
                coluna[0] = Integer.toString(Integer.parseInt(coluna[0]));
                if (coluna[0].equals(codigoDesejado.strip())) {

                    linha = "Código: " + colunaCodigo + "\nCidade: " + coluna[1] + "\n";
                    System.out.println(linha);
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    public static void BuscarNome() {

        String nomeDesejado = Main.console.readString("Qual o nome da cidade?");

        String linha;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/cidades/cidades.MUNICCSV"))) {

            while ((linha = bufferedReader.readLine()) != null) {

                coluna = linha.replace("\"", "").split(";");
                if (coluna[1].equals(nomeDesejado.toUpperCase().strip())) {

                    linha = "Código: " + coluna[0] + "\nCidade: " + coluna[1] + "\n";
                    System.out.println(linha);
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

}
