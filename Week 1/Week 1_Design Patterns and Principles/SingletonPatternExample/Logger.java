public class Logger{
    //private static instance of Logger 
    private static Logger instance;

    // private constructor
    private Logger(){

    }

    // method to get the instance
    public static Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

}