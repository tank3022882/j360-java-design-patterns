外观模式（Facade）
===
#### 意图
外观模式(也成为门面模式)要求一个子系统的外部与其内部的通信必须通过一个统一的对象进行。它提供一个高层次的接口，使得子系统更易于使用。

#### 使用场景
* 为复杂系统提供一个简单统一的接口
* 当需要构建一个层次结构的子系统时，使用外观模式定义子系统中每层的入口点。通过接口进行通信，简化了子系统之间的关系。

#### 优点
* 使用方便，使用外观模式客户端完全不需要知道子系统的实现过程；
* 降低客户端与子系统的耦合；
* 更好的划分访问层次；

#### 缺点
* 减少了可变性和灵活性；
* 在不引入抽象外观类的情况下，增加新的子系统可能需要修改外观类或客户端的源代码，违背了“开闭原则”；