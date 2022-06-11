package userbuilder;

public class Builder extends UserBuilder {

    @Override
    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public UserBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public UserBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public UserBuilder setAge(Integer age) {
        this.age = age;
        return this;
    }

    @Override
    public UserBuilder setSalary(Double salary) {
        this.salary = salary;
        return this;
    }

}
