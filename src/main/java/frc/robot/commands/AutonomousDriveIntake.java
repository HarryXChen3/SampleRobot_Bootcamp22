package frc.robot.commands;

import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Intake;

public class AutonomousDriveIntake extends CommandGroup {
    private final static double SPEED = 0.5;

    public AutonomousDriveIntake(final DriveTrain drivetrain, final Intake intake) {
        addSequential(new DriveTime(SPEED, 10, drivetrain));
        addSequential(new ToggleIntake(intake));
        addSequential(new DriveTime(-SPEED, 10, drivetrain));
    }
}
