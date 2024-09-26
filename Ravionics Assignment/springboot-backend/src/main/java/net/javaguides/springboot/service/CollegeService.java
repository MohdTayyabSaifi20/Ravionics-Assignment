package net.javaguides.springboot.service;

import java.util.List;
import java.util.Optional;



import net.javaguides.springboot.model.College;

public interface CollegeService {

    public List<College> getCollegeDetail();
    public Optional<College> getCollegeDetail(Long id);
    public College addCollege(College college);
    public College updateCollege(College college);
    public void deleteCollege(long parseLong);

}