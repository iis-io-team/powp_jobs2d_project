package edu.kis.powp.factories;

import edu.kis.powp.jobs2d.drivers.DriverCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public interface FiguresFactory {
    DriverCommand getShape(DriverManager driver);
}
