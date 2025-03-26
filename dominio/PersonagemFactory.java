package dominio;

public class PersonagemFactory {
    public static Personagem criarPersonagem(String tipo) {
        if (tipo.equalsIgnoreCase("Samurai")) {
            return new Samurai();
        } else if (tipo.equalsIgnoreCase("Arqueiro")) {
            return new Arqueiro();
        } else if (tipo.equalsIgnoreCase("Mago")) {
            return new Mago();
        } else {
            throw new IllegalArgumentException("Tipo de personagem desconhecido: " + tipo);
        }
    }
}