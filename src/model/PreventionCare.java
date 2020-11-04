package model;

public class PreventionCare {
	private String careNumber;

	public void setCareNumber(String careNumber) {
		this.careNumber = careNumber;
	}
	
	public String getTextCare() {
		String textCare = "";
		switch(careNumber) {
		case "1":
			textCare = "Wash your hands with soap frequently";
			break;
			
		case "2":
			textCare = "Sneeze or cough into your flexed elbow";
			break;
			
		case "3":
			textCare = "Avoid touching your eyes, nose and mouth";
			break;
			
		case "4":
			textCare = "Keep spaces well ventilated";
			break;
			
		case "5":
			textCare = "Disinfect frequently used objects";
			break;
			
		default:
			textCare = "Care not found";
			break;
		}
		
		return textCare;
	}
	
	public String getImgCare() {
		String imgCare = "";
		switch(careNumber) {
		case "1":
			imgCare = "img/WashHands.PNG";
			break;
			
		case "2":
			imgCare = "img/SneezeElbow.PNG";
			break;
			
		case "3":
			imgCare = "img/AvoidTouching.PNG";
			break;
			
		case "4":
			imgCare = "img/KeepVentilated.PNG";
			break;
			
		case "5":
			imgCare = "img/DesinfectObjects.PNG";
			break;
		}
		
		return imgCare;
	}
}
