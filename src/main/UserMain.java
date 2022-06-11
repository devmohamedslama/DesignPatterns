package main;

import userbuilder.Builder;

public class UserMain {
    public static void main(String[] args) {

        Builder builder = new Builder();
        builder.setName("Mohamed Salama 1")
                .setAddress("Giza")
                .setSalary(123.123)
                .setEmail("mohamed@gamil.com")
                .setAge(22);
        System.out.println(builder.build());

    }

}
