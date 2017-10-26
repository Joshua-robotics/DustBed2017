// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc319;

import org.usfirst.frc319.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc319.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

    public JoystickButton xButton;
    public JoystickButton yButton;
    public JoystickButton aButton;
    public JoystickButton bButton;
    public JoystickButton rightBumper;
    public JoystickButton leftBumper;
    public JoystickButton startButton;
    public JoystickButton selectButton;
    public Joystick xBoxController;

 
    public OI() {


        xBoxController = new Joystick(0);
        
        selectButton = new JoystickButton(xBoxController, 1);
        selectButton.whenPressed(new CommandGroup1());
        startButton = new JoystickButton(xBoxController, 1);
        startButton.whenPressed(new ShiftToggle());
        leftBumper = new JoystickButton(xBoxController, 1);
        leftBumper.whenPressed(new Command5());
        rightBumper = new JoystickButton(xBoxController, 1);
        rightBumper.whenPressed(new ShiftToggle());
        bButton = new JoystickButton(xBoxController, 2);
        bButton.whenPressed(new Command4());
        aButton = new JoystickButton(xBoxController, 1);
        aButton.whenPressed(new Command3());
        yButton = new JoystickButton(xBoxController, 3);
        yButton.whenPressed(new Command2());
        xButton = new JoystickButton(xBoxController, 4);
        xButton.whenPressed(new Command1());


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("ShiftToggle", new ShiftToggle());
        SmartDashboard.putData("Command 1", new Command1());
        SmartDashboard.putData("Command 2", new Command2());
        SmartDashboard.putData("Command 3", new Command3());
        SmartDashboard.putData("Command 4", new Command4());
        SmartDashboard.putData("Command 5", new Command5());
        SmartDashboard.putData("Command Group 1", new CommandGroup1());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getxBoxController() {
        return xBoxController;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}
