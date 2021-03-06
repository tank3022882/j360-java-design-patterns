代理模式（Proxy）（Surrogate）
===
#### 意图
代理模式是对象的结构模式。代理模式给某一个对象提供一个代理对象，并由代理对象控制对原对象的引用。

#### 使用场景
当无法或不想直接访问某个对象或存在困难时可以通过一个代理对象来间接访问，为了保证客户端使用的透明性，委托对象与代理对象需要实现相同接口。

#### 优点
* 给对象增加了本地化的扩展性，增加了存取操作控制

#### 缺点
* 会产生多余的代理类

#### 总结
不同于装饰者模式，代理模式关注代理对象的施加控制；而装饰者模式关注对象本身功能的增强。