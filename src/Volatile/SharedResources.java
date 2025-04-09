package Volatile;

public class SharedResources {
    volatile private boolean flag;  //this tell JVM should always be read from main memory it should not be cached
    //all the thread should read it directly without reading it from thread cache
    SharedResources(){
        flag = false;
    }
    public void toggleFlag(){
        flag=!flag;
    }
    public boolean getFlag(){
        return flag;
    }
}
