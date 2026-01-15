package innerClasses.memberInnerClass;

public class _Car_ {
    private String model;
    private boolean isEngineOn;


    public _Car_(String model) {
        this.model = model;
        isEngineOn = false;
    }

    // MEMBER INNER CLASS:--->
    // Engine class is also the member of the '_Car_' class...
    // we can access this class by creating the instance of '_Car_' and then we can use that instance to access this 'Engine' class...
    class Engine {

        public void starts(){
            if(!isEngineOn){
                isEngineOn = true;
                System.out.println(model + "Engine is turned on...");
            }
            else System.out.println(model + "Engine was already on...");
        }

        public void stops(){
            if(isEngineOn){
                isEngineOn = false;
                System.out.println(model + "Engine is turned off...");
            }
            else System.out.println(model + "Engine was already off...");
        }


    }

}
