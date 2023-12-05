package com.codeguruozzy.jobfinder.controller;

import com.codeguruozzy.jobfinder.JobRepository;
import com.codeguruozzy.jobfinder.model.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@RestController
public class JobController {

    @Autowired
    JobRepository repo;
    // DEFINE METHODS
    //1. enable swagger
    @ApiIgnore // ignore predefined apis
    @RequestMapping("/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }
    //2. get all jobs
    @GetMapping("/jobs")
    public List<Job> getAllJobs()  {
        return repo.findAll();
    }
}
