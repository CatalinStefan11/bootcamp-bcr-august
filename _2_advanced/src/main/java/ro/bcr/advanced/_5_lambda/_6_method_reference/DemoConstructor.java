package ro.bcr.advanced._5_lambda._6_method_reference;

@FunctionalInterface
interface Robot {
    Command execute(String order);
}

class Command {
    private String command;

    public Command(String command) {
        this.command = command;
        System.out.println("Command given: " + command);
    }

    @Override
    public String toString() {
        return "Command{" +
                "command='" + command + '\'' +
                '}';
    }
}

public class DemoConstructor {

    public static void main(String[] args) {

        Robot oldRobot = (String input) -> new Command(input);
        oldRobot.execute("REBOOT");

        System.out.println("--------------");

        Robot newRobot = Command::new;
        newRobot.execute("REBOOT");




    }
}
