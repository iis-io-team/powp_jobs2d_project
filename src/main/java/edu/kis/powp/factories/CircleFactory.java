package edu.kis.powp.factories;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class CircleFactory implements FiguresFactory {
    private ComplexCommand complexCommand = new ComplexCommand();

    @Override
    public DriverCommand getShape(DriverManager driver) {
        int r = 75;
        complexCommand.addCommand(new SetPositionCommand(r, 0, driver.getCurrentDriver()));
        for(int i = 0;  i < 360;  i++) {
            int x = (int)(r * Math.cos(i));
            int y = (int)(r * Math.sin(i));
            complexCommand.addCommand(new OperateToCommand(x, y, driver.getCurrentDriver()));
        }

        return complexCommand;
    }
}
