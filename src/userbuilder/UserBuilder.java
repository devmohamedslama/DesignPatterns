package userbuilder;

import java.util.HashMap;
import java.util.Map;

public abstract class UserBuilder {
    protected String name;
    protected String address;
    protected String email;
    protected Integer age;
    protected Double salary;


    public User build() {
        for (Map.Entry<String, Object> entry : getArguments().entrySet()) {
            if (entry.getValue() == null)
                throw new IllegalArgumentException(entry.getKey());
        }
        return new User(name, address, email, age, salary);
    }

    private Map<String, Object> getArguments() {
        Map<String, Object> arguments = new HashMap<>();
        arguments.put("name", this.name);
        arguments.put("address", this.address);
        arguments.put("email", this.email);
        arguments.put("age", this.age);
        arguments.put("salary", this.salary);
        return arguments;
    }

    public abstract UserBuilder setName(String name);

    public abstract UserBuilder setAddress(String address);

    public abstract UserBuilder setEmail(String email);

    public abstract UserBuilder setAge(Integer age);

    public abstract UserBuilder setSalary(Double salary);


}