package edu.kis.powp.jobs2d.events;

import edu.kis.powp.factories.CircleFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.factories.FiguresFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestCircleOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestCircleOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		FiguresFactory figuresFactory = new CircleFactory();
		figuresFactory.getShape(driverManager).execute();
	}
}
