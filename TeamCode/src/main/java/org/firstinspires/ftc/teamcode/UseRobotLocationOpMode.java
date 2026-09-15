package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class UseRobotLocationOpMode extends OpMode {
RobotLocationPractice robotlocationpractice = new RobotLocationPractice(0);


    @Override
    public void init() {
        robotlocationpractice.setAngle(0);
        robotlocationpractice.setX(0);
        robotlocationpractice.setY(0);

    }


    @Override
    public void loop() {
        if (gamepad1.a){
            robotlocationpractice.turnRobot(0.1);
        }
        else if (gamepad1.b){
            robotlocationpractice.turnRobot(-0.1);
        }

        if (gamepad1.dpad_left) {
            robotlocationpractice.changex(+0.1);
        }
        else if (gamepad1.dpad_right) {
            robotlocationpractice.changex(-0.1);
        }

        if (gamepad1.dpad_up){
            robotlocationpractice.changey(-0.1);
        }
        else if (gamepad1.dpad_down){
            robotlocationpractice.changey(+0.1);
        }


        telemetry.addData("Heading", robotlocationpractice.getHeading());
        telemetry.addData("Angle", robotlocationpractice.getAngle() );
        telemetry.addData("X value", robotlocationpractice.getX());
        telemetry.addData("Y value", robotlocationpractice.getY());






    }

}





// add a double getAngle to your RobotLocationPractice, and display in OpMode
// inside your robotlocationpractice class, create a double x, double getX(), void changeX(double changeAmount)
// when left dpad pressed + 0.1 to x