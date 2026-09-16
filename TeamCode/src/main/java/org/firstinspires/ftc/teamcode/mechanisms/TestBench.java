package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TestBench {
    private DigitalChannel touchSensor;



    public void init(HardwareMap hwMap);
    public DigitalChannel getTouchSensor() {
        return touchSensor;
    }
    touchSensor = hwMap.get(DigitalChannel.class,"touch_sensor");
        touchSensor = hwMap.get(DigitalChannel.Mode.INPUT);



    public boolean getTouchSensorState() {
        return !touchSensor.getState();
    }

public boolean isTouchSensorReleased() {
        return touchSensor.getState();
}

}
