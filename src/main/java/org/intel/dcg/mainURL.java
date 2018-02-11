package org.intel.dcg;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class mainURL {
    @RequestMapping("/")
    public String index() {
        return "Hello World!";
    }
}
