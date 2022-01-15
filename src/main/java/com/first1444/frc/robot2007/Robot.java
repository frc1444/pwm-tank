package com.first1444.frc.robot2007;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.motorcontrol.Victor;

public class Robot extends TimedRobot {

    private final Victor leftMotor;
    private final Victor rightMotor;

    private final Input input;


    public Robot() {
        leftMotor = new Victor(0);
        rightMotor = new Victor(1);
        input = new Input();

        rightMotor.setInverted(true);
    }

    @Override
    public void disabledInit() {
        leftMotor.disable();
        rightMotor.disable();
    }

    @Override
    public void teleopPeriodic() {
        leftMotor.set(input.getLeftDrive());
        rightMotor.set(input.getRightDrive());
    }
}
