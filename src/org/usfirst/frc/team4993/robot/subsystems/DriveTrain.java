package org.usfirst.frc.team4993.robot.subsystems;

import org.usfirst.frc.team4993.robot.OI;
import org.usfirst.frc.team4993.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {

	CANTalon backLeft = new CANTalon(RobotMap.BACK_LEFT_TALON);
	CANTalon backRight = new CANTalon(RobotMap.BACK_RIGHT_TALON);
	CANTalon frontLeft = new CANTalon(RobotMap.FRONT_LEFT_TALON);
	CANTalon frontRight = new CANTalon(RobotMap.FRONT_RIGHT_TALON);
	
	RobotDrive drive = new RobotDrive(frontLeft,backLeft,frontRight,backRight);
	
	public void arcadeDrive(){
		drive.arcadeDrive(-OI.controller.getRawAxis(RobotMap.LEFT_STICK_Y), -OI.controller.getRawAxis(RobotMap.LEFT_STICK_X));
	}
	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

