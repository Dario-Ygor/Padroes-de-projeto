package dominio;

public class MagiaDeLuz extends BufferDecorator {
    public MagiaDeLuz(Personagem personagem) {
        super(personagem);
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Agora com uma poderosa magia de luz!");
    }
}