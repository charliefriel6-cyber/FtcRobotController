package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.configuration.annotations.
import com.qualcomm.robotcore.eventloop.opmode.Autonomous

@Disabled
@Autonomous
public class HelloWorld extends OpMode {
    @Override
    public void init() {
        telemetry.addData("Hello", "World");
    }


    @Override
    public void loop() {







    }
}
