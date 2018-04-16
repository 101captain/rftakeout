package com.bunfly.dao;

import com.bunfly.entity.FemaleHealthForm;
import com.bunfly.entity.MaleHealthForm;

public interface HomeHealthMapper {
	
	
	MaleHealthForm getMaleStudentHealth(Integer id);
	
	
	
	FemaleHealthForm getFemaleStudentHealth(Integer id);
}
