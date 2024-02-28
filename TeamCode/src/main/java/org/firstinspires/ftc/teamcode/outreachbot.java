package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class outreachbot extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {

        DcMotor firthMotor, twoMotor, thirdMotor, fourthMotor;
        firstMotor = hardwareMap.get(DcMotor.class, "firstMotor");
        amagus2Motor = hardwareMap.get(DcMotor.class, "secondMotor");
        amagus3Motor = hardwareMap.get(DcMotor.class, "thirdMotor");
        amagus4Motor = hardwareMap.get(DcMotor.class, "fourthMotor");


        //initializing hardware
        