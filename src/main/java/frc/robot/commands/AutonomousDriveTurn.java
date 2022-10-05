package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.subsystems.DriveTrain;

public class AutonomousDriveTurn extends CommandGroup {
    private static final double DRIVE_SPEED = 0.5;
    private static final double ROT_SPEED = 0.5;

    public AutonomousDriveTurn(final DriveTrain drivetrain) {
        addSequential(new DriveTime(DRIVE_SPEED, 5, drivetrain));
        addSequential(new TurnTime(ROT_SPEED, 2, drivetrain));
        addSequential(new DriveTime(DRIVE_SPEED, 5, drivetrain));
    }
}
