// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ElevatorSubsystem extends SubsystemBase {
  private final Spark elevator = new Spark(Constants.m_elevator);
  private final Spark lanzador = new Spark(Constants.m_lanzador);
  public ElevatorSubsystem() {}

  @Override
  public void periodic() {
    
  }

  public void setMotors(double speedElevator, double speedLanzador){
    elevator.set(speedElevator);
    lanzador.set(speedLanzador);
  }
}
