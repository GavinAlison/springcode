package com.alison.app.condition.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author alison
 * @Date 2019/12/1  11:54
 * @Version 1.0
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orderdetail {

    private Long id;

    private String desc;

    private Long orderId;

}
