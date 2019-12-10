import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
    
    private static Singleton instance = null;   

    public String str; 

    private Singleton() 
    { 
        str = "Hello I am a string part of Singleton class"; 
    } 

    public static Singleton getSingleInstance() 
    { 
        if (instance == null) 
            instance = new Singleton(); 

        return instance; 
    } 
}