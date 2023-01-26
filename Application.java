import src.model.*;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        FuncionarioComissionado funcionarioComissionado = new FuncionarioComissionado(
                "Manoel",
                565725,
                10,
                10000.
        );
        FuncionarioAssalariadoComissionado funcionarioAssalariadoComissionado = new FuncionarioAssalariadoComissionado(
                "Luiza",
                664756,
                1000.,
                12,
                8500.
        );

        FuncionarioHorista funcionarioHorista =new FuncionarioHorista(
                "José",
                256458,
                44,
                8.45
        );
        FuncionarioAssalariado funcionarioAssalariado = new FuncionarioAssalariado(
                "Maria",
                345687,
                2300.
        );
        FuncionarioProducao funcionarioProducao = new FuncionarioProducao(
                "Joaquim",
                465789,
                3200.,
                1100
        );

        List<Funcionario> funcionarios = List.of(
                funcionarioComissionado,
                funcionarioAssalariadoComissionado,
                funcionarioHorista,
                funcionarioAssalariado,
                funcionarioProducao
        );

        funcionarios.forEach(funcionario -> {
            funcionario.display();
        });
    }
}
