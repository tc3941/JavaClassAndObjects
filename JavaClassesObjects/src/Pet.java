import java.util.*;
public class Pet {
    private String name,location,type;
    private int age;

    public Pet(){

    }
    public Pet(String name, int age, String location, String type){

    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getType(){
        return this.type;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public void setAge(int age){
        this.age = age;
    }
}
