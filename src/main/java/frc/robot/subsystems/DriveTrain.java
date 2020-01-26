/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  private VictorSPX motorLeft1 = new VictorSPX(Constants.MOTOR_LEFT_1_ID);
  private VictorSPX motorLeft2 = new VictorSPX(Constants.MOTOR_LEFT_2_ID);
  private VictorSPX motorRight1 = new VictorSPX(Constants.MOTOR_RIGHT_1_ID);
  private VictorSPX motorRight2 = new VictorSPX(Constants.MOTOR_RIGHT_2_ID);

  /**
   * Creates a new DriveTrain.
   */
  public DriveTrain() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void setLeftMotors(double speed){
    motorLeft1.set(ControlMode.PercentOutput, -speed*Constants.SPEED_MULTIPLIER);
    motorLeft2.set(ControlMode.PercentOutput, -speed*Constants.SPEED_MULTIPLIER);
  }

  public void setRightMotors(double speed){
    motorRight1.set(ControlMode.PercentOutput, speed*Constants.SPEED_MULTIPLIER);
    motorRight2.set(ControlMode.PercentOutput, speed*Constants.SPEED_MULTIPLIER);
  }
}
