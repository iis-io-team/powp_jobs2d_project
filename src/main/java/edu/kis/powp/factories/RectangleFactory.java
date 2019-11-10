package edu.kis.powp.factories;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class RectangleFactory implements FiguresFactory{
    private ComplexCommand complexCommand = new ComplexCommand();

    @Override
    public DriverCommand getShape(DriverManager driver) {
        complexCommand.addCommand(new SetPositionCommand(-100, -100, driver.getCurrentDriver()));
        complexCommand.addCommand(new OperateToCommand(-100, 100, driver.getCurrentDriver()));
        complexCommand.addCommand(new OperateToCommand(100, 100, driver.getCurrentDriver()));
        complexCommand.addCommand(new OperateToCommand(100, -100, driver.getCurrentDriver()));
        complexCommand.addCommand(new OperateToCommand(-100, -100, driver.getCurrentDriver()));

        return complexCommand;
    }
}
