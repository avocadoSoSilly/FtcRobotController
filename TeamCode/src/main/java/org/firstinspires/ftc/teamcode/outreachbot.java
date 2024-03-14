package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class outreachbot extends LinearOpMode {
    private DcMotorEx Motor1, Motor2, Motor3, Motor4;
    @Override
    public void runOpMode() throws InterruptedException {

        DcMotor Motor1, Motor2, Motor3, Motor4;
        Motor1 = hardwareMap.get(DcMotorEx.class, "Motor1");
        Motor2 = hardwareMap.get(DcMotorEx.class, "Motor2");
        Motor3 = hardwareMap.get(DcMotorEx.class, "Motor3");
        Motor4 = hardwareMap.get(DcMotorEx.class, "Motor4");
        IntakeMotor1 = hardwareMap.get(DcMotorEx.class, "IntakeMotor1");
        IntakeMotor2 = hardwareMap.get(DcMotorEx.class, "IntakeMotor2");
        OuttakeLoadServo = hardwareMap.get(DcServo.class, "OuttakeLoadServo");
        OuttakeMotor1 = hardwareMap.get(DcMotorEx.class, "OuttakeMotor1");
        OuttakeMotor2 = hardwareMap.get(DcMotorEx.class, "OuttakeMotor2");
        

        //initializing hardware
        watiForStart();
        if (isStopRequested()) return;
        while (opModeIsActive()) {

            //reading gamepad input
            Motor1.setPower(gamepad1.left_stick_y + gamepad1.right_stick_x);
            Motor2.setPower(gamepad1.left_stick_y) + gamepad1.right_stick_x);
            Motor3.setPower(-gamepad1.left_stick_y + gamepad1.right_stick_x);
            Motor4.setPower(-gamepad1.left_stick_y + gamepad1.right_stick_x);
            

            
        }
