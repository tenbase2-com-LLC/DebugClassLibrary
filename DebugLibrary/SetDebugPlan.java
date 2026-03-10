/*******************************************************************
 * Created by the JDE: Tue Mar 10 17:00:13 EDT 2026
 * WARNING: If you are editing this file from outside the JDE, you
 * should make sure to load the changes back into the JDE by setting
 * the preference "Check for outside changes..." in the "Text Editor"
 * preference tab or reload the component manually.
 * Otherwise you will lose your changes next time the file is generated.
 *******************************************************************/

package DebugLibrary;

import aos.jack.jak.beliefset.BeliefSetException;
import aos.jack.util.thread.Semaphore;

/**
 * 
 */public plan SetDebugPlan extends Plan {

    #handles event SetDebugEvent sde1;
    #uses data DebugBeliefSet debug;
    #uses data Semaphore mutex;
    
    static boolean relevant(SetDebugEvent sde1)
    {
        return true;
    }
    
    context()
    {
        true;
    }

    #reasoning method
    body()
    {
        try
        {                     
            debug.add(0, sde1.bDebug);
        }
        catch (BeliefSetException e)
        {
            e.printStackTrace();
        } 
        finally
        {
            mutex.signal();
        }
    }

}
