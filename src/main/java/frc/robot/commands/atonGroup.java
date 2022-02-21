package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandGroupBase;

public class atonGroup extends CommandGroupBase{

    public static Timer timer = new Timer();
    public static int stage = 0;

    @Override
    public void addCommands(Command... commands) {
        addCommands(new aton1(),
                    new aton2());
    }
    
}
