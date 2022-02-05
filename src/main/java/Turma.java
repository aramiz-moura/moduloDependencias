import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class Turma {

    final private String nome;

    @Getter
    final private List<Aluno> alunos = new ArrayList<>();


    void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    void adicionarAluno(String nome) {
        Aluno novoAluno = new Aluno(nome);
        alunos.add(novoAluno);
    }


    String todosOsAlunos() {
        return alunos.stream().map(aluno -> aluno.getNome()).collect(Collectors.joining(","));
    }

    @Override
    public String toString() {
        String todosAlunos = "";
        for(Aluno aluno: alunos){
            todosAlunos += aluno.getNome() + ",";
        }
        return todosAlunos;
    }
}
