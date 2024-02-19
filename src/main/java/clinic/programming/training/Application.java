package clinic.programming.training;

import java.util.*;
import java.util.Collections;
public class Application {

    public void greeting(){
        List<String> list=new ArrayList<String>();
        list.add("Hello Welcome");

        for(String str:list){
            System.out.println(str);
        }

    }
    
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
    }
}