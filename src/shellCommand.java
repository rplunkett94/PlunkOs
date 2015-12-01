import java.lang.reflect.Method;

/**
 * Created by ryanplunkett on 11/16/15.
 */
public class shellCommand {
    Object func;
    String command;
    String description;


	public shellCommand(Object func, String command, String description) {
		this.func = func;
		this.command = command;
		this.description = description;
	}
	
	public String getCommand(){
		return this.command;
	}
	
	public String getDesc(){
		return this.description;
	}

	
}
