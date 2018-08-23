package ocp.chapter1;

public class ChildClass extends ParentClass {

    @Override
    public String giveMeString(int[] i) {
        return super.giveMeString(i);
    }

    public String giveMeString(int[] i, String b) {
        return super.giveMeString(i);
    }

    public void giveMeString(int[] i, String b, short c) {
//        return super.giveMeString(i);
    }

    /*
     * not possible due to clash with parent method
     */
//    public void giveMeString(){
//
//    }
}
