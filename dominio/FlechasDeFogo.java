package dominio;

public class FlechasDeFogo extends BufferDecorator {
    public FlechasDeFogo(Personagem personagem) {
        super(personagem);
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Agora com flechas de fogo!");
    }
}