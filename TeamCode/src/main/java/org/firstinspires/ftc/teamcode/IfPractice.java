package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class IfPractice extends OpMode  {


    @Override
    public void init() {

    }

    @Override
    public void loop() {
      double leftY = gamepad1.left_stick_y;
      boolean Turbo = gamepad1.a;
      double motorSpeed = gamepad1.left_stick_y;

      if (leftY < 0.1 && leftY > -0.1); {
          telemetry.addData("Left stick", "in Dead Zone");

        }
      if (!Turbo); {
          motorSpeed *= 0.5;
        }

        }
















    telemetry.addData("Left stick value", leftY);
}
