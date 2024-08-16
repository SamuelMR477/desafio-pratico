import entify.Aluno;
import dao.AlunoDAO;

public class App {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.setNome("Jurandir");
        a.setIdade(27);
        a.setNota_primeiro_semestre(8);
        a.setNota_segundo_semestre(10);
        a.setNome_professor("Lamelo");
        a.setNumero_sala(6);

        new AlunoDAO().cadastrarAluno(a);

        Aluno d = new Aluno();

        d.setID(7);
        new AlunoDAO().deletarAluno(d);

        Aluno e = new Aluno();
        e.setID(6);
        e.setNome("Marcos");
        e.setIdade(20);
        e.setNota_primeiro_semestre(9);
        e.setNota_segundo_semestre(9);
        e.setNome_professor("Carlos");
        e.setNumero_sala(5);
        new AlunoDAO().atualizarDados(e);
        
    }
}
