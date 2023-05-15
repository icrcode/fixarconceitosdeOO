import java.util.ArrayList;
import java.util.List;

class Aluno {
    private String matricula;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;

    public Aluno(String matricula, String nome, String endereco, String telefone, String email) {
        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class Professor {
    private String nome;
    private String titulacao;
    private String endereco;
    private String telefone;
    private String email;

    public Professor(String nome, String titulacao, String endereco, String telefone, String email) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class Disciplina {
    private String codigo;
    private String nome;
    private int cargaHoraria;
    private String ementa;
    private Professor professor;
    private List<Matriculado> matriculados;

    public Disciplina(String codigo, String nome, int cargaHoraria, String ementa, Professor professor) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.ementa = ementa;
        this.professor = professor;
        this.matriculados = new ArrayList<>();
    }

    public void adicionarMatriculado(Matriculado matriculado) {
        matriculados.add(matriculado);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

       public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Matriculado> getMatriculados() {
        return matriculados;
    }

    public void setMatriculados(List<Matriculado> matriculados) {
        this.matriculados = matriculados;
    }
}

class Curso {
    private String nome;
    private int duracao;
    private List<Disciplina> disciplinas;

    public Curso(String nome, int duracao) {
        this.nome = nome;
        this.duracao = duracao;
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void matricularAlunoEmDisciplina(Aluno aluno, Disciplina disciplina, int ano, int semestre) {
        Matriculado matriculado = new Matriculado(aluno, disciplina, ano, semestre);
        disciplina.adicionarMatriculado(matriculado);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}

class Matriculado {
    private Aluno aluno;
    private Disciplina disciplina;
    private int ano;
    private int semestre;

    public Matriculado(Aluno aluno, Disciplina disciplina, int ano, int semestre) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.ano = ano;
        this.semestre = semestre;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
}
