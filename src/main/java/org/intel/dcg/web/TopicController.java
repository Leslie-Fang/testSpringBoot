package org.intel.dcg.web;
import org.intel.dcg.domain.Topic;
import org.intel.dcg.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topics")
public class TopicController {

    //Auto DI the dependency
    @Autowired
    private TopicService topicService;

    @RequestMapping("")
    public List<Topic> getTopic() {
        return topicService.getAllTopics();
    }
    @RequestMapping(value="/{topicID}",method = RequestMethod.GET)
    public Topic getTopicbyID(@PathVariable int topicID) {
        return topicService.getTopic(topicID);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }
}
