package com.xtl.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 31925
 * @className User
 * @description TODO
 * @date 2022/5/11 14:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    public User(int id, String name, int age) {
        this.id=id;
        this.name=name;
        this.age=age;
    }
    private Integer id;
    private String name;
    private Integer age;
}
