package Events;
/*Event is an object which is used to described the changing feature
 *  in source. It is happened because of user interact with the Component
 *   in Graphical user Interface.
 *   
 *   Source is an Object which is used to created an event or many event.
 *   Source always note the listerner to receive the signal about event
 *   which certify. Each event has it own noting method.
 *  General Syntax : public void TypeListener(TypeListerner el)
 *  				Type, is the name of event , and el is event listener.
 *  EX : addKeyListener() : is method which not the keyboard board event listener
 *   addMouseMotionListener() : note the event of mouse motion listener
 *   
 *   When event happened in all listeners which is noted and copied of event 
 *   object that's what we call this feature multicasting the event.
 *   
 *   Some source allowed listener noted only 1 . 
 *   General syntax of this method
 *   public void addTypeListener(TypeListener el)throws java.util.TooManyListenerExcepton
 *   
 *   Source must provide a method for listener for removing note for any event
 *   which identify.
 *   General syntax 
 *   public void remove TypeListener(TypeListener el)
 *   
 *   Example : To remove keyboard listener is "removeKeyListener()"
 *   
 *   
 *   About Event Listeners
 *   Listener is an object which determined when event happened.
 *   + Note source many for receiving signal to note each events
 *   + Use method to receiving signal and process the signal 
 *   Methods which receive events and process events is determined in 
 *   the collecition of interface in java.awt.event.
 *   Ex : MouseMotionListener interface has methods for receiving signal 
 *  mouse , when mouse is moved and clicked.
 *  
 *  *************************************************************************
 *  *************************************************************************
 *  
 *  USING DELEGATION EVENT MODEL
 *  
 *  To implement the DELEGATION EVENT MODEL WE HAVE TOE FOLLOW THE 2 BASIC RULE
 *  + Implement the interface which is semitry with listener, therefore it will receive the mandatory event
 *  + Use code for noting and no noting (if possible) listener is the same as receiver noting event
 *  REMEMBER : source can create many event . Each event has to note separately.
 *  An object can note for receiving many kind of events but it has to use all interfaces 
 *  which is the requirement for all events.
 *  
 */
public class Introduction_Event {

}
