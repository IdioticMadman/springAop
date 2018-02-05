# Spring AOP的学习

##AOP相关概念
### AOP是什么
    1. 是一种编程范式，不是一种编程语言
    2. 是解决特定的问题，不能解决所有问题
    3. 是OOP的补充，不是替代
### AOP的初衷
    1. 解决代码重复性问题
    2. 关注点分离
        - 分平分离：展示层->服务层->持久层
        - 垂直分离：模块划分（订单、库存等）
        - 切面分离：分离功能性需求与非功能性需求
### AOP的好处
    1. 集中处理某一关注点/横切逻辑
    2. 可以很方便的添加/删除关键点
    3. 侵入性少，增强代码的可读性及可维护性

### AOP应用场景
    * 权限控制
    * 缓存控制
    * 事务控制
    * 审计日志
    * 性能监控
    * 分布式追踪
    * 异常处理
    以上的功能，大部分都是非功能性需求
    
## spring AOP的语法

### Aspect注解
    * 常用的三个注解
        1. @Aspect: 标注当前类为一个切面的类
        2. @PointCut: 需要横切的点 什么类，什么方法，什么参数，即方法的标注
        3. @Advice: 切入点的执行时机，方法执行之前，之后等等
    
