package edu.kis.powp.jobs2d;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverCommand;

public class ComplexCommandTest {
    public static void main(String[] args) {
        ComplexCommand complexCommand = new ComplexCommand();
        int x = 4;
        int y = 8;
        DriverCommand dc1 = new SetPositionCommand(x,y);
        DriverCommand dc2 = new OperateToCommand(x,y);


        complexCommand.addCommand(dc1);
        complexCommand.addCommand(dc2);

        complexCommand.execute();
    }
}
