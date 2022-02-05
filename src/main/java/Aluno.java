
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;


@EqualsAndHashCode
@RequiredArgsConstructor
public class Aluno implements Comparable<Aluno>{



    @Getter
    final private String nome;

    @Override
    public String toString() {
        return this.getNome();
    }


    @Override
    public int compareTo(Aluno o) {
        return this.nome.compareTo(o.nome);
    }
}
