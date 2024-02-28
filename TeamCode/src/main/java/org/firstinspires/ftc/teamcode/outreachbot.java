package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class outreachbot extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {

        DcMotor Motor1, Motor2, thirdMotor, fourthMotor;
        Motor1 = hardwareMap.get(DcMotor.class, "firstMotor");
        Motor2 = hardwareMap.get(DcMotor.class, "secondMotor");
        thirdMotor = hardwareMap.get(DcMotor.class, "thirdMotor");
        fourthMotor = hardwareMap.get(DcMotor.class, "fourthMotor");


        //initializing hardware
        