package Course_ToDo5;

public class InterfaceTotalAvgFees implements CourseInfoProcessor {

	@Override
	public float processCourseInfo(Course[] courseObj, CourseInfo courseInfo) {
		// TODO Auto-generated method stub
		
		int totalFees=0;
		for(Course currCourse:courseObj)
		{
			CourseInfo currInfo=new CourseInfo(currCourse.getProvider(), currCourse.getDuration());
			
			if(courseInfo.equals(currInfo))
				totalFees+=currCourse.getFees();
		}
		float avg=totalFees/(courseObj.length-1);
		return avg;
	}

}
