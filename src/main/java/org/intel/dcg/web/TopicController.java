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
        //return topicService.getAllTopics();
        return topicService.getAllTopics2();
    }
    @RequestMapping(value="/{topicID}",method = RequestMethod.GET)
    public Topic getTopicbyID(@PathVariable int topicID) {
        return topicService.getTopic(topicID);
    }
//Use postman to send post request
//Request header: Content-Type:application/json
//Request Body: json format data. For example:
//{
//    "id": 3,
//        "name": "lovemango",
//        "description": "hhh3"
//}
    @RequestMapping(value = "", method = RequestMethod.POST)
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }
}
