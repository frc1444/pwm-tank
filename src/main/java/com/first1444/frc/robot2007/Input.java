package com.first1444.frc.robot2007;

import edu.wpi.first.wpilibj.Joystick;

public final class Input {

    private static final int LEFT_Y_AXIS = 1;
    private static final int RIGHT_Y_AXIS = 5;
    private final Joystick controllerJoystick;

    public Input() {
        controllerJoystick = new Joystick(0);
    }

    private boolean isAxisDisconnected(int axis) {
        return !controllerJoystick.isConnected() || axis >= controllerJoystick.getAxisCount();
    }

    public double getLeftDrive() {
        if (isAxisDisconnected(LEFT_Y_AXIS)) {
            return 0.0;
        }
        return -controllerJoystick.getRawAxis(LEFT_Y_AXIS);
    }
    public double getRightDrive() {
        if (isAxisDisconnected(RIGHT_Y_AXIS)) {
            return 0.0;
        }
        return -controllerJoystick.getRawAxis(RIGHT_Y_AXIS);
    }
}
