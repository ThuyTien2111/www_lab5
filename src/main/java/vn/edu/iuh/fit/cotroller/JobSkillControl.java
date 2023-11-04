package vn.edu.iuh.fit.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import vn.edu.iuh.fit.dao.CandidateSkillDao;
import vn.edu.iuh.fit.dao.JobSkillDao;
import vn.edu.iuh.fit.entity.Job;

import java.util.List;

@Controller
public class JobSkillControl {
    private final JobSkillDao jobSkillDao;

    @Autowired
    public JobSkillControl(JobSkillDao jobSkillDao) {
        this.jobSkillDao = jobSkillDao;
    }

}
