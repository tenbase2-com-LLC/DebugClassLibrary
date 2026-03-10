/*******************************************************************
 * Created by the JDE: Tue Mar 10 17:00:13 EDT 2026
 * WARNING: If you are editing this file from outside the JDE, you
 * should make sure to load the changes back into the JDE by setting
 * the preference "Check for outside changes..." in the "Text Editor"
 * preference tab or reload the component manually.
 * Otherwise you will lose your changes next time the file is generated.
 *******************************************************************/

package DebugLibrary;


/**
 * 
 */public event SetDebugEvent extends Event {
    public boolean bDebug = false;

    #posted as
    post(boolean bDebug1)
    {
        bDebug = bDebug1;        
    }


}
