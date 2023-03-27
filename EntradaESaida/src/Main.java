import model.Aluno;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        final String ENTRADA = "EntradaESaida/src/entrada.txt";
        final String SAIDA = "EntradaESaida/src/saida.txt";
        List<Aluno> alunos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(ENTRADA))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                String nome = dados[0];
                double nota = Double.parseDouble(dados[1]);
                Aluno aluno = new Aluno(nome, nota);
                alunos.add(aluno);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        Collections.sort(alunos);

        try (PrintWriter pw = new PrintWriter(new FileWriter(SAIDA))) {
            double somaNotas = 0;
            int qtdAprovados = 0;
            for (Aluno aluno : alunos) {
                if (aluno.getNota() >= 6) {
                    pw.println(aluno.getNome() + " - " + aluno.getNota());
                    somaNotas += aluno.getNota();
                    qtdAprovados++;
                }
            }

            double mediaAprovados = somaNotas / qtdAprovados;
            pw.println();
            pw.println("Média dos alunos aprovados: " + mediaAprovados);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
