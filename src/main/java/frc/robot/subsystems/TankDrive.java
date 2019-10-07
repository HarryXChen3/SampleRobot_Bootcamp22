/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import frc.robot.motors.TalonSRX;
import edu.wpi.first.wpilibj.interfaces.Gyro;

/**
 * Add your docs here.
 */
public class TankDrive extends DriveTrain {
  private TalonSRX left1;
  private TalonSRX left2;
  private TalonSRX right1;
  private TalonSRX right2;
  public TankDrive(TalonSRX leftETalonSRX1, TalonSRX rightETalonSRX1, TalonSRX leftTalonSRX2, TalonSRX rightTalonSRX2) {
    this.left1 = leftETalonSRX1;
    this.right1 = rightETalonSRX1;
    this.left2 = leftTalonSRX2;
    this.right2 = rightTalonSRX2;
  }
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void coast() {
    // TODO Auto-generated method stub
    left1.coast();
    right1.coast();
    left2.coast();
    right2.coast();
  }

  @Override
  public void disableBrownoutProtection() {
    // TODO Auto-generated method stub

  }

  @Override
  public void enableBrownoutProtection() {
    // TODO Auto-generated method stub

  }

  @Override
  public TalonSRX getLeft() {
    // TODO Auto-generated method stub
    return left1;
  }

  @Override
  public TalonSRX getRight() {
    // TODO Auto-generated method stub
    return right1;
  }

  @Override
  public void set(double speed) {
    // TODO Auto-generated method stub
    left1.set(speed);
    left2.set(speed);
    right1.set(speed);
    right2.set(speed);
  }

  @Override
  public void set(double leftSpeed, double rightSpeed) {
    // TODO Auto-generated method stub
    left1.set(leftSpeed);
    right1.set(rightSpeed);
    left2.set(leftSpeed);
    right2.set(rightSpeed);

  }

  @Override
  public void setLeft(double speed) {
    // TODO Auto-generated method stub
    left1.set(speed);
    left2.set(speed);
  }

  @Override
  public void setRight(double speed) {
    // TODO Auto-generated method stub
    right1.set(speed);
    right2.set(speed);

  }

  @Override
  public void stop() {
    // TODO Auto-generated method stub
    left1.brake();
    right1.brake();
    left2.brake();
    right2.brake();
  }

  @Override
  public void turnInPlace(boolean right, double speed) {
    // TODO Auto-generated method stub
    if (right){
      set(speed, -speed);
    } else {
      set(-speed, speed);
    }
  }

  @Override
  protected void initDefaultCommand() {
    // TODO Auto-generated method stub

  }

  @Override
  public void resetEncoders() {
    left1.getEncoder().reset();
    right1.getEncoder().reset();
  }

}
