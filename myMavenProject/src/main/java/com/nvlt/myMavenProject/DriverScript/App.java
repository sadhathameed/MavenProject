package com.nvlt.myMavenProject.DriverScript;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.util.SheetBuilder;

import com.nvlt.myMavenProject.Executor.Executor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Executor ex = new Executor();
    	ex.printName();
        System.out.println( "Hello World!" );
        
                        
    }
}
