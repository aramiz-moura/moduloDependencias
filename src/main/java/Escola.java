import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Escola {

    //TODO: MUDAR DE SET PARA OUTRO QUE RETORNE EM ORDEM ALFABETICA
    Set<Turma> todasAsTurmasDaEscola = new HashSet<>();


    void adicionarTurma(Turma turma) {
        todasAsTurmasDaEscola.add(turma);
    }

    Set<Aluno> retornaTodosOsAlunos() {
        Set<Aluno> alunosUnicos = new HashSet<>();
        for(Turma turma: todasAsTurmasDaEscola) {
            alunosUnicos.addAll(turma.getAlunos());
        }
        return alunosUnicos;
    }
}
