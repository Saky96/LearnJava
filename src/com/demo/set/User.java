package com.demo.set;

import java.util.*;

public class User {
    String username;
    String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return username.length();
    }

    public static void main(String[] args) {
        List<User> u1 = new ArrayList<>();
        u1.add(new User("jack", "jack@email.com"));
        u1.add(new User("mat", "matt@email.com"));
        u1.add(new User("mat", "matt@email.com"));

//        System.out.println(u1);

        Set<User> uSet = new HashSet<>();
        uSet.addAll(u1);

//        for (User user: uSet){
//            System.out.println(user.username);
//        }

        Iterator<User> setIterator = uSet.iterator();

        while (setIterator.hasNext()){
            System.out.println(setIterator.next().username);
        }

    }
}
