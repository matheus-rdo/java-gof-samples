import java.util.List;

/**
 * Motivação: Emitir chamadas a objetos sem saber nada sobre quem será o receptor ou qual operação específica será realizada
 * O Command desacopla o objeto que invoca a operação do objeto que sabe como executá-la, através de uma interface ou classe base abstrata.
 */
public class CommandClient {

    public static void main(String[] args) {
        List<Command> commands = List.of(new DomesticEngineer(), new Politician(), new Programmer());

        commands.stream()
                .forEach(command -> command.execute());
    }


    interface Command {
        void execute();
    }

    static class DomesticEngineer implements Command {
        public void execute() {
            System.out.println("take out the trash");
        }
    }

    static class Politician implements Command {
        public void execute() {
            System.out.println("take money from the rich, take votes from the poor");
        }
    }

    static class Programmer implements Command {
        public void execute() {
            System.out.println("sell the bugs, charge extra for the fixes");
        }
    }


}
