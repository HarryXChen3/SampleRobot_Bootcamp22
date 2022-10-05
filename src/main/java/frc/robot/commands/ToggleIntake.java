package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.subsystems.Intake;

public class ToggleIntake extends InstantCommand {
    private final Intake intake;
    public ToggleIntake(final Intake intake) { this.intake = intake; }

    @Override
    public void execute() { intake.toggle(); }
}
