package configuration;

public class LocalConfiguration
{
  private String gccPath;
  private static LocalConfiguration instance = null;
  
  
  // Edit your configuration files if you need to
  // Please do not push your own config file to Git
  
  private LocalConfiguration()
  {
	if(System.getProperty("os.arch").equals("amd64"))
	{
        gccPath = "/usr/bin/gcc";
	}
	
	else if(System.getProperty("os.arch").equals("x86"))
	{
        gccPath = "/usr/bin/gcc";
	}
  }
  
  public static LocalConfiguration getInstance()
  {
	if (instance == null)
	{
	  instance = new LocalConfiguration();
	}
	
	return instance;
  }
  
  public String getGccPath()
  {
	return gccPath;
  }
}
