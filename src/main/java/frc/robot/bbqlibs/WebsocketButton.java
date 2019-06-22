package frc.robot.bbqlibs;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class WebsocketButton extends JoystickButton {

    private static final GenericHID m_joystick = null;
    private boolean buttonState = false;

    WebsocketButton() {
        super(m_joystick, 0);
    }

    public void set(boolean newValue){
        buttonState = newValue;
    }

    public boolean get(){
        return buttonState;
    }

}