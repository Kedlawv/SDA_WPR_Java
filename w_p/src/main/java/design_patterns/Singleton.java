package design_patterns;

public class Singleton {

    private static Singleton instance;
    private String name;
    private String age;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){    //
                if(instance == null){          // three lines of double checked Singleton
                    instance = new Singleton();//
                }
            }
            return new Singleton();
        }
        return instance;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
