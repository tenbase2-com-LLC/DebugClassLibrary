/*******************************************************************
 * Created by the JDE: Tue Mar 10 17:00:13 EDT 2026
 * WARNING: If you are editing this file from outside the JDE, you
 * should make sure to load the changes back into the JDE by setting
 * the preference "Check for outside changes..." in the "Text Editor"
 * preference tab or reload the component manually.
 * Otherwise you will lose your changes next time the file is generated.
 *******************************************************************/

package DebugLibrary;

import aos.jack.jak.beliefset.*;
import aos.jack.jak.util.timer.DilatedClock;
import aos.jack.util.thread.Semaphore;

/**
 * 
 */public agent DebugAgent extends Agent {
    #has capability DebugCapability debugCap;
    #private data Semaphore mutex();

    public DebugAgent()
    {
        super("DebugAgent");
        Init();
    }

    private void Init()
    {
        this.timer = new DilatedClock(100d, this.timer);
        this.timer.setTime(0L);
    }

    //insert into client agent
    public DebugBeliefSet GetDebugBeliefSet()
    {        
        return debugCap.debug;       
    }

    public void SetDebug(boolean bDebug)
    {
        postEvent(debugCap.sde.post(bDebug));        
        mutex.threadWait();
    }

}
