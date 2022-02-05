import java.util.*;

public class Escola {

    Set<Turma> todasAsTurmasDaEscola = new HashSet<>();


    void adicionarTurma(Turma turma) {
        todasAsTurmasDaEscola.add(turma);
    }

    SortedSet<Aluno> retornaTodosOsAlunos() {
        SortedSet<Aluno> alunosUnicos = new TreeSet<>();
        for(Turma turma: todasAsTurmasDaEscola) {
            alunosUnicos.addAll(turma.getAlunos());
        }
        return alunosUnicos;
    }

    int totalAlunos () {
       return retornaTodosOsAlunos().size();
    }
}
