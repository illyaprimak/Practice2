import java.util.Collection;

public class HelloWorld {

    private String name;
    private int amount;
    private Collection<String> lines;

    public void setLines(Collection<String> lines) {
        this.lines = lines;
    }

    //    private String[] lines = {
//            "I love JAVA", "I love JAVA", "I love JAVA", "I love JAVA", "I love JAVA"
//    };


    public HelloWorld(){

    }
    public HelloWorld(int amount){
        this.amount = amount;
//        this.name = "Max";
    }

    public HelloWorld(String name, int amount){
        this.name = name;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void printLines(){
        for (int i = 0; i < lines.size() ; i++) {
            System.out.println(lines.toArray()[i]);
        }
    }

    public void printHello() {
        for (int i = 0; i < amount; i++) {
            System.out.println("Spring Framework: Hello, " + name + "!");
        }

    }

}