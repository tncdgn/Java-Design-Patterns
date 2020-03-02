public class CommandExecutor {

    private BasketCommand command;

    public CommandExecutor(BasketCommand basketCommand) {
        this.command = basketCommand;
    }

    public void executeCommand(Basket basket, Product product) {
        command.execute(basket,product);
    }
}
