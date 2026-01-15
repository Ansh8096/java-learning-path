package accessModifiers.ZOO;

public class _Animals{
    private String name;
    protected String Sound;

    public _Animals(String name,String Sound) {
        this.name = name;
        this.Sound = Sound;
    }

    public void makesSound(){
        System.out.println(name + "makes a Sound : " + Sound);
    }

    // protected specifier used : means if you want to use this method outside its package then this can only be accessible in the subclasses of this particular class...
    // but if u want to use this method within the same package (then the class in which we are using is not necessarily needs  to be a subclass)
    protected void changeSound(String newSound){
        this.Sound = newSound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return Sound;
    }

}
