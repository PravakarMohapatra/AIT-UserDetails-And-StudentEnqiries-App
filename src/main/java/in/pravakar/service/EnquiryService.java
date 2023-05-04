package in.pravakar.service;

import java.util.List;

import in.pravakar.binding.DashboardResponse;
import in.pravakar.binding.EnquiryForm;
import in.pravakar.binding.EnquirySearchCriteria;
import in.pravakar.entity.StudentEnqEntity;

public interface EnquiryService {

	public DashboardResponse getDashboardData(Integer userId);

	public List<String> getCourses();

	public List<String> getEnqStatuses();

	public boolean saveEnquiry(EnquiryForm form);

	public List<StudentEnqEntity> getEnquiries();
	
	public List<StudentEnqEntity> getFilteredEnqs(EnquirySearchCriteria criteria, Integer userId);

}
