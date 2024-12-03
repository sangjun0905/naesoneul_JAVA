import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class SmartHome {

	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("Enter a ID");
		String bright = JOptionPane.showInputDialog("Enter a Bright level");
		
		// 부품들을 어떻게 이요할 지 단계 정하기
		// 1. 엘리베이터 콜
		Elevator myElevator = new Elevator(id);
        myElevator.callForUp(1);
        
        // 2. Security off 
        Security mySecurity = new Security(id);
        mySecurity.off();
        
        // 3. 불 키키
        Lighting hallLamp = new Lighting(id+" / Hall Lamp");
        hallLamp.on();
        
        Lighting floorLamp = new Lighting(id+" / floorLamp");
        floorLamp.on();
        
        DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
        moodLamp.setBright(Double.parseDouble(bright)); //문자열을 실수로 변환
        moodLamp.on();

	}

}
