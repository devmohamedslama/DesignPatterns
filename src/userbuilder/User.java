package userbuilder;

import java.util.concurrent.atomic.AtomicInteger;

class User {
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int id;
    String name;
    String address;
    String email;
    Integer age;
    Double salary;


    User(String name, String address, String email, Integer age, Double salary) {
        id = count.incrementAndGet();
        this.name = name;
        this.address = address;
        this.email = email;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }


}