package com.cloudcontrolled.sample.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("doc_domain", getDocCenterDomain());
        return "index";
    }

    private String getDocCenterDomain() {
        String domain = System.getenv("DOMAIN");
        if (domain == null || domain.equals("")) {
            return "cloudcontrolled.com";
        } else {
            return domain;
        }
    }
}