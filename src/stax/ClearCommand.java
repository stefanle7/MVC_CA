package stax;

import mvc.Command;
import mvc.Model;

public class ClearCommand extends Command {
    public ClearCommand(Model model) {
        super(model);
    }

    @Override
    public void execute() throws Exception {
        Calculator calc = (Calculator) model;
        calc.clear();
    }
}
