package org.usfirst.frc319.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc319.Robot;

/**
 *
 */
public class ShiftToggle extends Command {
 

    public ShiftToggle() {


        requires(Robot.drivetrain);

    }

    protected void initialize() {
    	
    	if (Robot.drivetrain.shift == true)
    	{
    		Robot.drivetrain.shiftUp();
    		System.out.println("HighGear");
    	}
    	else if (Robot.drivetrain.shift == false)
    	{
    	Robot.drivetrain.shiftDown();
    	System.out.println("LowGear");
    	}
   
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return false;
    }
    protected void end() {
    }

    protected void interrupted() {
    }
}
