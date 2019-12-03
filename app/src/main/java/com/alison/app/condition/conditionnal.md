## case1
```java
@Configuration
@Conditional({OrderCondition.class})
public class BeanConfig {
    @Bean(name = "order")
    public Order order() {
        return new Order(1, "Air", "Apple air");
    }

    @Bean("orderdetail")
    public Orderdetail orderDetail() {
        return new Orderdetail(1L, "购物者", 1L);
    }
}
```
可以通过ApplicationContext获取对应的bean，对应的实例



