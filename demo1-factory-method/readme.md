工厂方法模式（Factory Method）（Virtual Constructor）
===
#### 意图
建立一个工厂类 **(SenderFactory)**，定义一个对实现了同一接口 **(Sender)** 的类 **(MailSender\&SmsSender)** 进行实例化创建的方法。

#### 优点
* 只需通过工厂类 **(SenderFactory)** 获取想要的对象实例并使用，而不用关心获取的实际对象类型和实现过程。

#### 缺点
* 每增加一个实现类 **(MailSender\&SmsSender\&...)** ，都需要去维护修改工厂类 **(SenderFactory)** 的方法