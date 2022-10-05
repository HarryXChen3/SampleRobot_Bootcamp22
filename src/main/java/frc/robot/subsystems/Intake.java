package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.motors.TalonSRX;

public class Intake extends Subsystem {
    private static final double INTAKE_SPEED = 0.75;
    private final TalonSRX talonSRX;
    private final Solenoid solenoid;

    public Intake(final TalonSRX talonSRX, final Solenoid solenoid) {
        this.talonSRX = talonSRX;
        this.solenoid = solenoid;
    }

    public void reset() {
        talonSRX.set(0);
        solenoid.set(false);
    }

    public boolean state() { return solenoid.get(); }
    public void set(final boolean state) {
        solenoid.set(state);
        talonSRX.set(state ? INTAKE_SPEED : 0);
    }
    public void toggle() {
        set(!state());
    }

    public void toggleSolenoid(final boolean state) { solenoid.set(state); }
    public void toggleSolenoid() { toggleSolenoid(!solenoid.get()); }

    public void toggleMotor(final boolean state) { talonSRX.set(state ? INTAKE_SPEED : 0); }
    public void toggleMotor() { toggleMotor(!state()); }

    @Override
    public void initDefaultCommand() {}
}
