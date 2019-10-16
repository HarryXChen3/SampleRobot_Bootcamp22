/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class Turn extends Command {
  private double speed;
  private double angle;
  private double kP = 0.8;
  public Turn(double speed, double angle) {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    this.speed = speed;
    this.angle = angle;
    requires(Robot.drive);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.gyro.reset();
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    if (angle > 0){
      Robot.drive.set(speed, -speed);
    } else {
      Robot.drive.set(-speed, speed);
    }
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return Math.abs(Robot.gyro.getAngle()) > Math.abs(kP * angle);
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.drive.set(0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
