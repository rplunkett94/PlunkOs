


/**
 * Created by ryanplunkett on 11/16/15.
 */

public class cpu {
    String code;
    Integer PC;
    Integer Acc;
    Integer Xreg;
    Integer Yreg;
    Integer Zflag;
    Boolean isExecuting;

    public cpu(){
        this.code = "";
        this.PC = 0;
        this.Acc = 0;
        this.Xreg = 0;
        this.Yreg = 0;
        this.Zflag = 0;
        this.isExecuting = false;
    }

    public void cyle(){

    }
}

