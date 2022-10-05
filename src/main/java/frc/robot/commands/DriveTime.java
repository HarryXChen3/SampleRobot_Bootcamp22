package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.DriveTrain;

public class DriveTime extends Command {
    private final double duration;
    private final double speed;
    private final DriveTrain drivetrain;
    private final Timer timer;

    public DriveTime(final double speed, final double duration, final DriveTrain drivetrain) {
        this.speed = speed;
        this.duration = duration;
        this.drivetrain = drivetrain;
        this.timer = new Timer();
        requires(Robot.drive);
    }

    @Override
    protected void initialize() {
        drivetrain.set(0);
        drivetrain.resetEncoders();
        timer.start();
    }

    @Override
    protected void execute() {
        drivetrain.set(speed);
    }

    @Override
    protected boolean isFinished() {
        return timer.hasPeriodPassed(duration);
    }

    @Override
    protected void end() {
        drivetrain.stop();
        drivetrain.resetEncoders();
    }
}
