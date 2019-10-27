package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverCommand;

public class SetPositionCommand implements DriverCommand {
    private int x;
    private int y;
    Job2dDriver job2dDriver;

    public SetPositionCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        job2dDriver.setPosition(x,y);
    }
}

