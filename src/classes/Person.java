package classes;

import javax.sound.midi.SysexMessage;

/**
 * Created by JPMPC-B216 on 11/10/2016.
 */
public class Person {

    private String name;
    private int age;
    private float weight;
    private float height;
    private String email;
    private String gender;



    public String introduceYourself(String eName,String email ){

        return  eName + " " + email;

    }
    public String introduceYourself(){
        return this.name;

    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }

    public float getHeight() {
        return height;
    }

    public String getEmail() {
        return email;
    }
    public String getGender(){
        return  gender;
    }



}


