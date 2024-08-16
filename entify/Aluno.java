package entify;

public class Aluno {
    private int id;
    private String nome;
    private int idade;
    private float nota_primeiro_semestre;
    private float nota_segundo_semestre;
    private String nome_professor;
    private int numero_sala;

    public int getID(){
        return id;
    }

    public void setID(int id){
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getNota_primeiro_semestre() {
        return nota_primeiro_semestre;
    }

    public void setNota_primeiro_semestre(float nota_primeiro_semestre) {
        this.nota_primeiro_semestre = nota_primeiro_semestre;
    }

    public float getNota_segundo_semestre() {
        return nota_segundo_semestre;
    }

    public void setNota_segundo_semestre(float nota_segundo_semestre) {
        this.nota_segundo_semestre = nota_segundo_semestre;
    }

    public String getNome_professor() {
        return nome_professor;
    }

    public void setNome_professor(String nome_professor) {
        this.nome_professor = nome_professor;
    }

    public int getNumero_sala() {
        return numero_sala;
    }

    public void setNumero_sala(int numero_sala) {
        this.numero_sala = numero_sala;
    }
}
