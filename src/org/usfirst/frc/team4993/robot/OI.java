package org.usfirst.frc.team4993.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team4993.robot.RobotMap;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public static final Joystick controller = new Joystick(0);//XBOX Controller

	JoystickButton AButton = new JoystickButton(controller,RobotMap.A_BUTTON);//A Button on XBOX
	JoystickButton BButton = new JoystickButton(controller,RobotMap.B_BUTTON);//B Button on XBOX
	JoystickButton XButton = new JoystickButton(controller,RobotMap.X_BUTTON);//Y Button on XBOX
	JoystickButton YButton = new JoystickButton(controller,RobotMap.Y_BUTTON);//Y Button on XBOX
	
	public OI(){
		//AButton.whenPressed(new ShootBall());

		
		
	}
}

