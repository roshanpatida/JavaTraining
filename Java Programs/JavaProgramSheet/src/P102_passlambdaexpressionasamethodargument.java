import java.util.ArrayList;

class P102_passlambdaexpressionasamethodargument {
    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();

   
        languages.add("java");
        languages.add("swift");
        languages.add("python");
        System.out.println("ArrayList: " + languages);

   
        languages.replaceAll(e -> e.toUpperCase());
        System.out.println("Updated ArrayList: " + languages);
    }
}