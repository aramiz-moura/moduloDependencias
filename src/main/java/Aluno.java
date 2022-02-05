
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@EqualsAndHashCode
@ToString
@RequiredArgsConstructor
public class Aluno {


    //TODO IMPLEMENTAR O TO STRING SEM LOMBOK;
    @Getter
    final private String nome;

}
