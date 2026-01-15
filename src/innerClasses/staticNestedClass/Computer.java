package innerClasses.staticNestedClass;

public class Computer {
    private String brand;
    private String model;

    private operatingSystem os; // I can create member inner class dataType variable here also...

    public Computer(String brand, String model, String osName1) {
        this.model = model;
        this.brand = brand;
        this.os = new operatingSystem(osName1);
    }

    // I can also create member inner class getter method here also...
    public operatingSystem getOs() {
        return os;
    }

// STATIC NESTED CLASS:---------->
    // these type of classes are directly attached to the main class rather than the instance of that class...
    // if the main class instance is created, it won't have any relation with this class, and then this class won't take any space...
    static class USB{
        private String type;

        public USB(String type){
            this.type = type;
        }

        public void displayInfo(){
            System.out.println("USB TYPE : " + type);
        }
    }

// MEMBER INNER CLASS...
    class operatingSystem{
        private String osName;

        // 'operatingSystem' class public constructor...
        public operatingSystem(String osName){
            this.osName = osName;
        }

        public void displayInfo(){
            System.out.println("Computer model is : " + model + " and OS Name is : " + osName);
        }
    }
}
