package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.TestBench;

import javax.crypto.spec.OAEPParameterSpec;
@TeleOp
public class TouchSensorPractice extends OpMode {
TestBench bench = new TestBench();

    @Override
    public void init() {
        bench.init(hardwareMap);

    }


    @Override
    public void loop() {
        telemetry.addData("Touch Sensor State", bench.getTouchSensorState());
        telemetry.addData("Touch sensor released status", bench.isTouchSensorReleased());

        if (bench.getTouchSensorState() = true) {

            telemetry.addData("Pressed!");
        }
        else {
            telemetry.addData("Not pressed",);
        }


    }
}
