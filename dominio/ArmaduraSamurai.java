package dominio;

public class ArmaduraSamurai extends BufferDecorator {
    public ArmaduraSamurai(Personagem personagem) {
        super(personagem);
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Agora com uma armadura resistente!");
    }
}