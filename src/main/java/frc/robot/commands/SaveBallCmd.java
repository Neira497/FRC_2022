// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.ElevatorSubsystem;

public class SaveBallCmd extends CommandBase {
  private final ElevatorSubsystem elevatorSubsystem;

  public SaveBallCmd(ElevatorSubsystem elevatorSubsystem) {
    this.elevatorSubsystem = elevatorSubsystem;
    addRequirements(elevatorSubsystem);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    elevatorSubsystem.setMotors(Constants.reverseHalfPower, Constants.reverseHalfPower);
  }

  @Override
  public void end(boolean interrupted) {
    elevatorSubsystem.setMotors(Constants.offPower, Constants.offPower);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
