import java.util.List;

public class Main {
    public static void main(String[] args) {
        Escola saoBento = new Escola();
        Turma java = new Turma("Java");
        Turma bancoDeDados = new Turma("Banco de Dados");

        saoBento.adicionarTurma(bancoDeDados);
        saoBento.adicionarTurma(java);


        java.adicionarAluno("Projeto - Mod. Dependencias Externas");
        java.adicionarAluno("Alexandre Martins");
        java.adicionarAluno("Vitor Hugo Lima");
        java.adicionarAluno("Esther Rodrigues");
        java.adicionarAluno("Lavínia Cunha");
        java.adicionarAluno("Yago Ramos");
        java.adicionarAluno("Letícia Cunha");
        java.adicionarAluno("Srta. Ana Júlia Ramos");
        java.adicionarAluno("Pietra Martins");
        java.adicionarAluno("Thomas Peixoto");
        java.adicionarAluno("Thales Farias");


        bancoDeDados.adicionarAluno("Vitor Hugo Lima");
        bancoDeDados.adicionarAluno("Esther Rodrigues");
        bancoDeDados.adicionarAluno("Nathan Nascimento");
        bancoDeDados.adicionarAluno("Lavínia Cunha");
        bancoDeDados.adicionarAluno("Natália Gomes");
        bancoDeDados.adicionarAluno("Dra. Lavínia Lopes");
        bancoDeDados.adicionarAluno("Yago Ramos");
        bancoDeDados.adicionarAluno("Letícia Cunha");
        bancoDeDados.adicionarAluno("Luiz Miguel Azevedo");
        bancoDeDados.adicionarAluno("Srta. Ana Júlia Ramos");
        bancoDeDados.adicionarAluno("Thales Farias");
        bancoDeDados.adicionarAluno("Dra. Alana Porto");


        System.out.println(java.getNome());
        System.out.println(bancoDeDados.getNome());

        //função que retorna TODOS os alunos da ESCOLA
        System.out.println(saoBento.retornaTodosOsAlunos());
        System.out.println(saoBento.totalAlunos());


//        System.out.println(java.todosOsAlunos());

//        Turma java = new Turma("Java", List.of(new Aluno("Gabriel"),));
    }
}
