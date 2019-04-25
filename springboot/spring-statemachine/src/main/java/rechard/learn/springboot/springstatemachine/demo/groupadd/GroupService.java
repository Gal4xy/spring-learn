package rechard.learn.springboot.springstatemachine.demo.groupadd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.state.State;
import org.springframework.statemachine.transition.Transition;
import rechard.learn.springboot.springstatemachine.demo.persist.Order;

import javax.annotation.PostConstruct;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@org.springframework.stereotype.Service
public class GroupService {

    @Autowired
    private PersistStateMachineHandler handler;


    public boolean handleAction(int groupId, ActionType event) {
       // Group group = repository.findGroupById(groupId);
        Group group=new Group(123,"hello");
        return handler.handleEventWithState(event);

    }


    public String showStatus(Group group){
        String statusMsg="=== Group Status=="+group.getState();
        return statusMsg;
    }

   /**
    public void create(Group group) {
        repository.create(group);
    }
    public List listAll() {
        return repository.listAll();
    }**/
}
