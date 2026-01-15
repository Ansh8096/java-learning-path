package accessModifiers._School_;

public class REVISION_College_ {

    private static REVISION_College_ CU;

    private REVISION_College_(){};

    public static REVISION_College_ getInstance(){
        if(CU == null){
           CU = new REVISION_College_();
            System.out.println("the instance is created ");
        }
        return CU;
    }
}
