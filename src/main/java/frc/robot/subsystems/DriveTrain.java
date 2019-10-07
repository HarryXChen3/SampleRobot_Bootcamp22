/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.motors.TalonSRX;;

/**
 * Add your docs here.
 */
public abstract class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public abstract void set(double speed);
	
	public abstract void set(double leftSpeed, double rightSpeed);

	public abstract void stop();

	public abstract void coast();

	public abstract TalonSRX getLeft();

	public abstract TalonSRX getRight();
	/**
	 * @param right
	 *            True if should turn right (clockwise), false if left
	 * @param speed
	 *            Speed of motors
	 */
	public abstract void turnInPlace(boolean right, double speed);

	public abstract void setLeft(double speed);

	public abstract void setRight(double speed);
		
	public abstract void enableBrownoutProtection();
	
	public abstract void disableBrownoutProtection();

	public abstract void resetEncoders();
}

