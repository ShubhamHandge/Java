package Course_ToDo5;

public class InterfaceTotalCount implements CourseInfoProcessor {

	@Override
	public float processCourseInfo(Course[] courseObj, CourseInfo courseInfo) {
		// TODO Auto-generated method stub
		int count=0;
		
		for(Course currCourse:courseObj)
		{
			CourseInfo currInfo=new CourseInfo(currCourse.getProvider(), currCourse.getDuration());
			
			if(courseInfo.equals(currInfo))
				count++;
		}
		return count;
	}

}
