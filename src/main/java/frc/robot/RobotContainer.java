// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.PS4Controller;
import frc.robot.commands.ArcadeDriveCmd;
import frc.robot.commands.SaveBallCmd;
import frc.robot.commands.throwCmd;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.ElevatorSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class RobotContainer {

  private final PS4Controller ps4Controller = new PS4Controller(Constants.control);
  private final ElevatorSubsystem elevatorSubsystem = new ElevatorSubsystem();
  private final DriveSubsystem driveSubsystem = new DriveSubsystem();
  
  public RobotContainer() {
    driveSubsystem.setDefaultCommand(new ArcadeDriveCmd(driveSubsystem, () -> -ps4Controller.getRawAxis(1), () -> ps4Controller.getRawAxis(4)));
    configureButtonBindings();
  }

  private void configureButtonBindings() {
    new JoystickButton(ps4Controller, Constants.X).whileActiveOnce(new throwCmd(elevatorSubsystem));
    new JoystickButton(ps4Controller, Constants.Y).whileActiveOnce(new SaveBallCmd(elevatorSubsystem));
  }

  public Command getAutonomousCommand() {
    return new throwCmd(elevatorSubsystem);
  }
}
