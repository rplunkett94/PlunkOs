import java.util.ArrayList;

public class shell {
    public static String promptStr;
    public ArrayList commandList;
    static String curses = "[fuvg],[cvff],[shpx],[phag],[pbpxfhpxre],[zbgureshpxre],[gvgf]";
    static String apologies = "[sorry]";
    shellCommand sc;
    shell myShell = new shell();


    public shell(){
        promptStr = ">";
       shellCommand[] commandList = new shellCommand[10];

    }
    

    

    public void main(){
        

       sc = new shellCommand(this.shellVer(MainFrame.inputText.getText()), "ver", "- Displays the current os version");
        this.commandList.add(sc);

        sc = new shellCommand(myShell.shellHelp(), "Help", "- ");
        
        
        // Displays the initial prompt
        this.putPrompt();
    }
    
    public void putPrompt() {
       	MainFrame.inputText.setText(this.promptStr);;
    }
   
    public void shellVer(String args){
    	MainFrame.outputText.append(globals.APP_NAME + " version " + globals.APP_VERSION);
    }
    
    public void shellHelp(String args) {
    	MainFrame.outputText.setText("Commands:");
        for (int i = 0; i < commandList.size(); i++) {
        	Object data = commandList.get(i);
        	data = data.getClass();
        	System.out.println(data);
        	MainFrame.outputText.setText("\n");
        	MainFrame.outputText.setText("  " + commandList + " " + shellCommand.class.getCommand);
        }
    }
    
    public void execute(fn, args){
    	// We just got a command, so advance the line...
        console.this.advanceLine();
        // ... call the command function passing in the args with some über-cool functional programming ...
        fn(args);
        // Check to see if we need to advance the line again
        if (_StdOut.currentXPosition > 0) {
            console.this.advanceLine();
        }
        // ... and finally write the prompt again.
        this.putPrompt();
    }
    
   


}
