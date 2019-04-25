package rechard.learn.springboot.springstatemachine.demo.groupadd;

import java.util.EnumSet;
import java.util.Iterator;

/**
 * Event
 */
public enum ActionType {
 APPROVE(1), REJECT(2);
	
	private int action;
	
	private ActionType(int action) {
		this.action = action;
	}


	public static ActionType valueOf(int event) {
		Iterator<ActionType> iterator = EnumSet.allOf(ActionType.class).iterator();
		while (iterator.hasNext()){
			ActionType actionType=iterator.next();
			if(actionType.action==event)
				return actionType;
		}
		throw new IllegalArgumentException("invalid ACTIONTYPE code");
	}


	public int getAction() {
		return action;
	}
}
