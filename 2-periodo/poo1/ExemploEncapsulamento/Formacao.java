public class Formacao {
    
    public String nivel;
    public boolean concluido;
    public String instituicao;
    public int ano;

    public Formacao(String nivel, boolean concluido, String instituicao, int ano) {
        this.nivel = nivel;
        this.concluido = concluido;
        this.instituicao = instituicao;
        this.ano = ano;
    }

    public String exibe (){
        return "\n -- FORMAÇÃO -- \nNÍVEL: " + nivel + "\nCONCLUIDO: " + concluido + "\nINSTITUIÇÃO: " + instituicao + "\nANO: " + ano;
    }

}
