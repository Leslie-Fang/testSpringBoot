package org.intel.dcg.service;

import org.intel.dcg.domain.Topic;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.intel.dcg.dao.TopicDAO;
import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> myTopics = new ArrayList<Topic>();

    //auto wired the topicDAO
    @Autowired
    private TopicDAO topicDAO;

    public TopicService(){
        myTopics.add(new Topic(1,"leslie","hhh"));
        myTopics.add(new Topic(2,"mango","hhh2"));
    }

    public List<Topic> getAllTopics(){
        return myTopics;
    }

    public List<Topic> getAllTopics2(){
        //test the topicDAO to connect the database
        return topicDAO.test();
    }

    public Topic getTopic(int id){
        for(Topic topic:myTopics){
            if(topic.getId() == id){
                return topic;
            }
        }
        return new Topic(id,"new leslie","new hhh");
    }

    public void addTopic(Topic topic){
        myTopics.add(topic);
    }
}
