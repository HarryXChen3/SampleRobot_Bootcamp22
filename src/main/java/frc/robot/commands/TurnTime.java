package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.DriveTrain;

public class TurnTime extends Command {
    private final double duration;
    private final double rotSpeed;
    private final DriveTrain drivetrain;
    private final Timer timer;

    public TurnTime(final double rotSpeed, final double duration, final DriveTrain drivetrain) {
        this.rotSpeed = rotSpeed;
        this.duration = duration;
        this.drivetrain = drivetrain;
        this.timer = new Timer();
    }

    @Override
    protected void initialize() {
        drivetrain.set(0);
        drivetrain.resetEncoders();
    }

    @Override
    protected void execute() {
        drivetrain.setLeft(rotSpeed);
        drivetrain.setLeft(-rotSpeed);
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
