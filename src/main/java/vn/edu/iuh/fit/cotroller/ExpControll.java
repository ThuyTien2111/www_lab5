package vn.edu.iuh.fit.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import vn.edu.iuh.fit.dao.ExperienceDao;
import vn.edu.iuh.fit.entity.Candidate;
import vn.edu.iuh.fit.entity.Skill;

import java.util.List;

@Controller
public class ExpControll {
    private ExperienceDao experienceDao;

    public ExpControll(ExperienceDao experienceDao) {
        this.experienceDao = experienceDao;
    }
    @GetMapping("/no-exp-candidate")
    public String showAddJobForm(Model model) {
        List<Candidate> candidates=experienceDao.getNotHaveExpCandidate();
        model.addAttribute("candidates", candidates);
        return "no-exp-candidate";
    }
}

