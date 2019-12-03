package com.alison.app.condition.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author alison
 * @Date 2019/12/1  11:52
 * @Version 1.0
 * @Description
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Integer id;
    private String name;
    private String description;
}
