
import java.util.ArrayList;
import java.util.List;

public class SystemLog
   {
   private List<LogMessage> messageList;
   
   public SystemLog() {
       messageList=new ArrayList<LogMessage>();
       messageList.add(new LogMessage("CLIENT3:security alert"));
       messageList.add(new LogMessage("Webserver:disk offline"));
       messageList.add(new LogMessage("SERVER1:file not found"));
       messageList.add(new LogMessage("SERVER2:read error on disk dsk1"));
       messageList.add(new LogMessage("SERVER1:write error on disk dsk2"));
       messageList.add(new LogMessage("Webserver:error on /dev/disk"));
       
       
    }
   
   public List<LogMessage> removeMessages( String keyword ){
      
                   
          // to be completed in part c    
          return null;
      } // end method removeMessages
       


      public String toString() {
          String output=new String();
          for(LogMessage currentMsg: messageList) {
            output+=currentMsg+"\n";
        
        
          }
      
        return output;
      
   } 
}// end class SystemLog