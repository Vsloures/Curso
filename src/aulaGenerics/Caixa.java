package aulaGenerics;

public class Caixa<T> {
    private T conteudo;
    
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }
    
    public T getConteudo() {
        return conteudo;
    }

}
