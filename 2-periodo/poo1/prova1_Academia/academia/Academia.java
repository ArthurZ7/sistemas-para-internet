package academia;

public class Academia {

    private int alunos;
    static int acessos;


    public Academia(int alunos) {
        this.alunos = alunos;
    }

    public void atualiza (int contAlunos) {
        setAlunos(contAlunos);
    }

    public int getAlunos() {
        return alunos;
    }

    public void setAlunos(int alunos) {
        this.alunos = alunos;
    }

    
    

}
