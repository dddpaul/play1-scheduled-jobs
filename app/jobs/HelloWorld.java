package jobs;

import play.Logger;
import play.jobs.Every;
import play.jobs.Job;

@Every( "5s" )
public class HelloWorld extends Job
{
    public void doJob()
    {
        Logger.info( "Hello world" );
    }
}
