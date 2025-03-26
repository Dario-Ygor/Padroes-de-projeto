import dominio.ArmaduraSamurai;
import dominio.FlechasDeFogo;
import dominio.MagiaDeLuz;
import dominio.Personagem;
import dominio.PersonagemFactory;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Escolha:\n 1-Para Samurai\n 2-Para arqueiro\n 3-Para mago\n Escolha uma opção : ");
            String tipo = scanner.next();
            Personagem personagem;

            switch (tipo) {
                case "1" -> {
                    personagem = PersonagemFactory.criarPersonagem("Samurai");
                    personagem.exibirInformacoes();
                    
                    System.out.println("Deseja evoluir seu personagem? (s/n)");
                    if (scanner.next().equalsIgnoreCase("s")) {
                        personagem = new ArmaduraSamurai(personagem);
                        System.out.println("Seu personagem evoluiu!");
                        personagem.exibirInformacoes();
                    }
                }
                case "2" -> {
                    personagem = PersonagemFactory.criarPersonagem("Arqueiro");
                    personagem.exibirInformacoes();
                    
                    System.out.println("Deseja evoluir seu personagem? (s/n)");
                    if (scanner.next().equalsIgnoreCase("s")) {
                        personagem = new FlechasDeFogo(personagem);
                        System.out.println("Seu personagem evoluiu!");
                        personagem.exibirInformacoes();
                    }
                }

                case "3" -> {
                    personagem = PersonagemFactory.criarPersonagem("Mago");
                    personagem.exibirInformacoes();
                    
                    System.out.println("Deseja evoluir seu personagem? (s/n)");
                    if (scanner.next().equalsIgnoreCase("s")) {
                        personagem = new MagiaDeLuz(personagem);
                        System.out.println("Seu personagem evoluiu!");
                        personagem.exibirInformacoes();
                    }
                }
                default -> {
                    System.out.println("Opção inválida!");
                    return;
                }
            }

        }
    }
}
