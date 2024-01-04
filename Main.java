public class Main {
    private static ClassNameValidate className;
    public static final String[] validateName = new String[]{"C0223G", "A0323K"};
    public static final String[] invalidateName = new String[]{"M0318G", "P0323A"};
    public static void main(String[] args) {
        className = new ClassNameValidate();
        for (String s: validateName){
            boolean isValid = className.validate(s);
            System.out.println("Class name "+s+" is valid: "+isValid);
        }
        for (String s: invalidateName){
            boolean isValid = className.validate(s);
            System.out.println("Class name "+s+" is valid: "+isValid);
        }

    }
}
