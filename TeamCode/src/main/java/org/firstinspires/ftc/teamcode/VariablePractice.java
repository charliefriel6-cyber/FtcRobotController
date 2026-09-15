package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.openftc.easyopencv.LIFO_OpModeCallbackDelegate;
@TeleOp
public class VariablePractice extends OpMode {

/* variables always start with lower, then next words are upper*/


    @Override
    public void init() {
        int teamNumber = 23014;
        double motorSpeed = 0.75;
        boolean clawClosed = true;
        String name = "Methodist College Belfast";
        int motorAngle = 124';
    '


       telemetry.addData("Team Number", teamNumber);
       telemetry.addData("Motor Speed", motorSpeed);
       telemetry.addData("Claw state", clawClosed);
       telemetry.addData("Team name", name);
       telemetry.addData("Motor angle", motorAngle);
    }

    @Override
    public void loop() {

    }
}
