# decorator-pattern
装饰器模式


装饰器模式在源码中的应用

装饰器模式在源码中也应用得非常多，在 JDK 中体现最明显的类就是 IO 相关的类，如 BufferedReader、InputStream、OutputStream

在 Spring 中的 TransactionAwareCacheDecorator 类我们也可以来尝试理解一下，这个类主要是 用来处理事务缓存的，来看一下代码:

`public class TransactionAwareCacheDecorator implements Cache {
     private final Cache targetCache;
     public TransactionAwareCacheDecorator(Cache targetCache) {
        Assert.notNull(targetCache, "Target Cache must not be null");
        this.targetCache = targetCache;
     }
     public Cache getTargetCache() {
        return this.targetCache;
     }
 ... 
 }`
 
装饰器模式和代理模式对比

从代理模式的 UML 类图和通用代码实现上看，代理模式与装饰器模式几乎一模一样。代理模式的 Subject 对应装饰器模式的 Component，代理模式的 RealSubject 对应装饰器模式的 ConcreteComponent，代理模式的 Proxy 对应装饰器模式的 Decorator。确实，从代码实现上看，代 理模式的确与装饰器模式是一样的(其实装饰器模式就是代理模式的一个特殊应用)，但是这两种设计 模式所面向的功能扩展面是不一样的:
装饰器模式强调自身功能的扩展。Decorator 所做的就是增强 ConcreteComponent 的功能(也有 可能减弱功能)，主体对象为 ConcreteComponent，着重类功能的变化;

代理模式强调对代理过程的控制。Proxy 完全掌握对 RealSubject 的访问控制，因此，Proxy 可以决定对 RealSubject 进行功能扩展，功能缩减甚至功能散失(不调用 RealSubject 方法)，主体对象为 Proxy;

装饰器模式的优缺点

优点: 

1、装饰器是继承的有力补充，比继承灵活，不改变原有对象的情况下动态地给一个对象扩展功能，即 插即用。

2、通过使用不同装饰类以及这些装饰类的排列组合，可以实现不同效果。 

3、装饰器完全遵守开闭原则。
缺点:

1、会出现更多的代码，更多的类，增加程序复杂性。

2、动态装饰时，多层装饰时会更复杂。