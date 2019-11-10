package edu.kis.powp.factories;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class CircleFactory implements FiguresFactory {
    private ComplexCommand complexCommand = new ComplexCommand();
    private DriverManager driver;

    @Override
    public DriverCommand getShape(DriverManager driver) {
        this.driver = driver;
        int xc = 0, yc = 0, r = 150;
        circle(xc, yc, r);
        return complexCommand;
    }

    private void drawCircle(int xc, int yc, int x, int y)
    {
       positionSetOperate(xc+x, yc+y);
       positionSetOperate(xc-x, yc+y);
       positionSetOperate(xc+x, yc-y);
       positionSetOperate(xc-x, yc-y);
       positionSetOperate(xc+y, yc+x);
       positionSetOperate(xc-y, yc+x);
       positionSetOperate(xc+y, yc-x);
       positionSetOperate(xc-y, yc-x);
    }

    private void positionSetOperate(int x,int y){
        complexCommand.addCommand(new SetPositionCommand(x, y, driver.getCurrentDriver()));
        complexCommand.addCommand(new OperateToCommand(x, y, driver.getCurrentDriver()));
    }

    private void circle(int xc, int yc, int r)
    {
        int x = 0, y = r;
        int d = 3 - 2 * r;
        drawCircle(xc, yc, x, y);
        while (y >= x)
        {
            x++;
            if (d > 0)
            {
                y--;
                d = d + 4 * (x - y) + 10;
            }
            else
                d = d + 4 * x + 6;
            drawCircle(xc, yc, x, y);
        }
    }
}
