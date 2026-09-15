package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class GamePadPractice extends OpMode {
    j

    @Override
    public void init() {

    }

    @Override
    public void loop() {
double speedForward =gamepad1.left_stick_y / 2.0;
double diffXJoysticks = gamepad1.left_stick_x - gamepad1.right_stick_x;
double sumTriggers = gamepad1.left_trigger + gamepad1.right_trigger


        telemetry.addData("x1", gamepad1.left_stick_x );
        telemetry.addData("y1", speedForward );

        telemetry.addData("a button", gamepad1.a);
        telemetry.addData("b button", gamepad1.b);

        telemetry.addData("x2", gamepad1.right_stick_x);
        telemetry.addData("y2", gamepad1.right_stick_y);

        telemetry.addData("difference between X joysticks", diffXJoysticks);
        telemetry.addData("sum of triggers", sumTriggers);



    }
}

