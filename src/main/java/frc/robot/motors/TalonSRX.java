package frc.robot.motors;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;

import frc.robot.sensors.Encoder;

public class TalonSRX extends com.ctre.phoenix.motorcontrol.can.TalonSRX implements Motor {

    private static final int TIMEOUT_MS = 30;
    public static final int CURRENT_LIMIT = 41;
    public static final int CURRENT_LIMIT_THRESHOLD = 41;
    public static final int LIMIT_TIMEOUT = 200; // ms
    private Encoder encoder;

    public TalonSRX(int channel, boolean reversed) {
        super(channel);
        super.setInverted(reversed);
    }

    public TalonSRX(int channel, boolean reversed, Encoder encoder) {
        super(channel);
        super.setInverted(reversed);
        this.encoder = encoder;
    }

    @Override
    public void brake() {
        // TODO Auto-generated method stub
        this.set(0);
        super.setNeutralMode(NeutralMode.Brake);

    }

    @Override
    public void coast() {
        // TODO Auto-generated method stub
        this.set(0);
        super.setNeutralMode(NeutralMode.Coast);
    }

    @Override
    public int getChannel() {
        // TODO Auto-generated method stub
        return super.getDeviceID();
    }

    @Override
    public double getCurrent() {
        // TODO Auto-generated method stub
        return super.getOutputCurrent();
    }

    @Override
    public double getPercentSpeed() {
        // TODO Auto-generated method stub
        return super.getMotorOutputPercent();
    }

    @Override
    public boolean isReversed() {
        // TODO Auto-generated method stub
        return super.getInverted();
    }

    @Override
    public void set(double speed) {
        // TODO Auto-generated method stub
        if (speed > 1) {
            speed = 1;
        }
        if (speed < -1) {
            speed = -1;
        }
        super.set(ControlMode.PercentOutput, speed);
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        set(0);
    }

    @Override
    public boolean hasEncoder() {
        // TODO Auto-generated method stub
        return !(encoder == null);
    }
    public Encoder getEncoder(){
        return encoder;
    }

    @Override
    public void setEncoder(Encoder encoder) {
        this.encoder = encoder;
    }
    

}




