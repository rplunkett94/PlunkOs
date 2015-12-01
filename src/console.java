

/**
 * Created by ryanplunkett on 11/16/15.
 */
public class console {

    public void Constructor(String currentFont, int currentFontSize, int currentYPosition){
        currentFont = globals._DefaultFontFamily;
        currentFontSize = globals._DefaultFontSize;
        currentYPosition = globals._DefaultFontSize;
        int currentXPosition = 0;
        String buffer = "";
        int[] bufferArray;
        int bufferIndex = 0;
    }
    
    public void init(){
    	this.clearScreen();
    }

    public void putText(String text){

        if(text != ""){
        	MainFrame.outputText.setText(text);
        }
    }
    
//    public void handleInput(){
//    	MainFrame.inputText.keyPressed();
//    }
    
    public void clearScreen(){
    	MainFrame.outputText.setText(null);
    	}
    
    public void advanceLine(){
    	MainFrame.outputText.setText("\n");
    	}

}
