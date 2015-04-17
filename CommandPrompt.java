import java.io.File;
import java.io.IOException;


public class CommandPrompt {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Create a run time
		Runtime rt = Runtime.getRuntime();
		// String to pass commands
		
		String cmd = "dir";
		
		rt.exec("cmd.exe /c start "+cmd+"", null, new File("C:\\Users\\varun_sriram\\Downloads\\html2xhtml\\data"));
		
		/* 
		 * cmd.exe starts command prompt
		 * new File(path) - this argument sets the current directory for command prompt
		 * 
		 * cmd is the command that is executed in command prompt @path location
		 * 
		 * */
		
	}

}
