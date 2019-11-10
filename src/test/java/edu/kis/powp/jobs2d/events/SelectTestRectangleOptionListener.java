package edu.kis.powp.jobs2d.events;

import edu.kis.powp.factories.FiguresFactory;
import edu.kis.powp.factories.RectangleFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestRectangleOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestRectangleOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		FiguresFactory figuresFactory = new RectangleFactory();
		figuresFactory.getShape(driverManager).execute();
	}
}
