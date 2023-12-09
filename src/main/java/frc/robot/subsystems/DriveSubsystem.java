// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveSubsystem extends SubsystemBase{
 
  private final PWMVictorSPX m_rearRight = new PWMVictorSPX(Constants.m_rearRight);
  private final PWMVictorSPX m_frontRight = new PWMVictorSPX(Constants.m_frontRight);
  private final PWMVictorSPX m_rearLeft = new PWMVictorSPX(Constants.m_rearLeft);
  private final PWMVictorSPX m_frontLeft = new PWMVictorSPX(Constants.m_fronLeft);
  public DriveSubsystem() {}
    
  @Override
  public void periodic(){

  }

  public void setMotors(double speedLeft, double speedRight){
    m_rearRight.set(speedRight);
    m_frontRight.set(speedRight);
    m_rearLeft.set(speedLeft);
    m_frontLeft.set(speedLeft);
  }
}
