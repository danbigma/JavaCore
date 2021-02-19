package com.test.capture;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class CaptureScreen {

	public static void main(String[] args) {
		try {
			captureScreen("capturetest");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void captureScreen(String fileName) throws Exception {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle screenRectangle = new Rectangle(screenSize);
		Robot robot = new Robot();
		BufferedImage image = robot.createScreenCapture(screenRectangle);
		ImageIO.write(image, "png", new File(fileName));
	}

}
