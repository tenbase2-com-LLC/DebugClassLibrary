
import DebugLibrary.DebugAgent;

public class Program {    
    
    public static boolean bDebug = true;
    
    public static void main( String args[] )
    {   
        try
        {            
            DebugAgent agent1 = new DebugAgent();

            System.out.println("Setting debug.");
            
            agent1.SetDebug(true);
            
            System.out.println("done.");
            
            agent1.GetDebugBeliefSet();
           
            try
            {
                System.in.read();
            }
            catch (Exception e)
            {}

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        System.exit(0);
    }  
}
