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

/**
 * 
 */public beliefset DebugBeliefSet extends ClosedWorld {
    #key field int id;
    #value field boolean bDebug;
    #indexed query get(int id, logical boolean bDebug);


    public DebugBeliefSet(boolean bDebug1)
    {    
        try
        {
            //insert default
            add(0, bDebug1);
        }
        catch (BeliefSetException e)
        {
            e.printStackTrace();
        } 
    }

}
