package dominio;

public abstract class BufferDecorator implements Personagem {
    protected Personagem personagem;

    public BufferDecorator(Personagem personagem) {
        this.personagem = personagem;
    }

    @Override
    public void exibirInformacoes() {
        personagem.exibirInformacoes();
        
    }
}