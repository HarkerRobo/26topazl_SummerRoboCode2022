package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.oi;
import frc.robot.subsystems.WristRollers;

public class WristRollerManual extends CommandBase{
    public WristRollerManual(){
        addRequirements(WristRollers.getInstance());
    }
    public void execute(){
        double output = oi.getInstance().getDriver().getLeftTrigger();
        if(intaking == true){
            output = 0.3;
        }
        else if(output > 0.5){
            output
        }
    } 

}
