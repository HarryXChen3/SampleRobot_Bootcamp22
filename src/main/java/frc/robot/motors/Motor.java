package frc.robot.motors;
import frc.robot.sensors.Encoder;

public interface Motor {

	void set(double speed);

	double getPercentSpeed();
	
	void stop();

	void brake();

	void coast();

    // public void setBrakeMode(boolean enable);
    boolean hasEncoder();

    Encoder getEncoder();

	int getChannel();

	boolean isReversed();

	double getCurrent();
	
	void setEncoder(Encoder encoder);
}