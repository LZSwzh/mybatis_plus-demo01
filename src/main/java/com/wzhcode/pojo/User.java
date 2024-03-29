package com.wzhcode.pojo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
