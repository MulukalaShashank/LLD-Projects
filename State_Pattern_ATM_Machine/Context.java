package PState;

public class Context {
	 ATM state;
     Context()
     {
    	 this.state = new Idle();
     }
     
     void set_state(ATM state)
     {
    	 this.state = state;
     }
     
     void insert()
     {
    	 state.insertATM(this);
     }
     void password()
     {
    	 state.enterpassword(this);
     }
     void  enter()
     {
    	 state.enter();
     }
}
