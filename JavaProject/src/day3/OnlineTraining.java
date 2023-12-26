package day3;

public class OnlineTraining extends Training {

private String meetingLink;
	
	public OnlineTraining() {
		
	}

	public OnlineTraining(String moduleName, int duration, String meetingLink) {
		super(moduleName, duration);
		this.meetingLink = meetingLink;
	}

	public String getMeetingLink() {
		return meetingLink;
	}

	public void setMeetingLink(String meetingLink) {
		this.meetingLink = meetingLink;
	}

	@Override
	public void conductTraining() {
		System.out.println("Conducting the training by connecting to : " + meetingLink);
	}
	
	@Override
	public String getDetails() {
		String trainingDetails = super.getDetails();            //Invoking 'getDetails()' from super class: Training
		String allTrainingDetails = trainingDetails + ", " + meetingLink;
		return allTrainingDetails;
	}
	
}
