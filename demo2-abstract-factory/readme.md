抽象工厂模式（Abstract Factory）（Kit）
===
#### 意图
提供一个创建一系列相关或相互依赖对象的接口，而无须指定他们具体的类。

#### 优点
* 来自工厂方法模式的优化，不再需要维护工厂类 **(SenderFactory)** ，只需要每实现一个功能接口 **(MailSender\&SmsSender)** 增加一个相应的工厂类 **(MailSenderFactory\&SmsSenderFactory)** 即可
