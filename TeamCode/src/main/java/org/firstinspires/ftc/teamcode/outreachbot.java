package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class outreachbot extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {

        DcMotor Motor1, Motor2, Motor3, Motor4;
        Motor1 = hardwareMap.get(DcMotor.class, "Motor1");
        Motor2 = hardwareMap.get(DcMotor.class, "Motor2");
        Motor3 = hardwareMap.get(DcMotor.class, "Motor3");
        Motor4 = hardwareMap.get(DcMotor.class, "Motor4");

        //initializing hardware
        watiForStart();
        if (isStopRequested()) return;
        while (opModeIsActive()) {

            //reading gamepad input
            if (gamepad1.left_stick_y) {
                Motor1.setPower(1);
                Motor2.setPower(1);
            }
            else if (gamepad1.right_stick_y) {
                Motor3.setPower(1);
                Motor4.setPower(1);
            }
            else if (gamepad1.left_stick_y) {
                Motor1.setPower(-1);
                Motor2.setPower(-1);
            else if (gamepad1.right_stick_y) {
                Motor3.setPower(-1);
                Motor4.setPower(-1);
            }
            //defaulting to 0 (no movement)
            else {
                Motor1.setPower(0);
                Motor2.setPower(0);
                Motor3.setPower(0);
                Motor4.setPower(0);


            
        }