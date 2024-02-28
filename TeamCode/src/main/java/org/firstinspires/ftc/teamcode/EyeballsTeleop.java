package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class EyeballsTeleop extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        //initializing hardware
        DcMotor amagusMotor, amagus2Motor, amagus3Motor, amagus4Motor;
        amagusMotor = hardwareMap.get(DcMotor.class, "firstMotor");
        amagus2Motor = hardwareMap.get(DcMotor.class, "secondMotor");
        amagus3Motor = hardwareMap.get(DcMotor.class, "thirdMotor");
        amagus4Motor = hardwareMap.get(DcMotor.class, "fourthMotor");

        amagus3Motor.setDirection(DcMotorSimple.Direction.REVERSE);
        amagus4Motor.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();
        if (isStopRequested()) return;
        while (opModeIsActive()) {

            //reading gamepad input
            if (gamepad1.left_stick_y) {
                amagusMotor.setPower(1);
                amagus2Motor.setPower(1);
            }
            else if (gamepad1.right_stick_y) {
                amagus3Motor.setPower(1);
                amagus4Motor.setPower(1);
            }
            else if (gamepad1.left_stick_y) {
                amagusMotor.setPower(-1);
                amagus2Motor.setPower(-1);
            else if (gamepad1.right_stick_y) {
                amagus3Motor.setPower(-1);
                amagus4Motor.setPower(-1);
            }
            //defaulting to 0 (no movement)
            else {
                amagusMotor.setPower(0);
                amagus2Motor.setPower(0);
                amagus3Motor.setPower(0);
                amagus4Motor.setPower(0);
            }

        }
    }
}
