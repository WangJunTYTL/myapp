Serializable
-----------------

Java序列化与反序列化：指可以把一个对象的状态保存起来，比如可以存储到磁盘或在网络上进行传输，也可以通过保存的数据恢复该对象的状态
通过ObjectInputStream与ObjectOutputStream完成

Read an object from the ObjectInputStream.  The class of the object, the
     * signature of the class, and the values of the non-transient and
     * non-static fields of the class and all of its supertypes are read.
     * Default deserializing for a class can be overriden using the writeObject
     * and readObject methods.  Objects referenced by this object are read
     * transitively so that a complete equivalent graph of objects is
     * reconstructed by readObject.

## 序列化的方式常见的有两种：

1. 通过Java提供的对象流的方式，可以把对象转成字节码
2. 通过转Json的方式，把对象转成Json串

## 两种方式各有特点

通过字节码方式：如果对象需要序列化需要继承Serializable接口，public 、protect、private修饰的属性都可以被序列化，当然也就可以反序列化，也就是对象的任何状态都可以被恢复
通过Json方式：首先对象可以不再继承Serializable接口，可被保存的状态有限：只可以是public字段修饰的属性，泛型不支持序列化，但Json易于查看，独立于各种婆编程语言之外。









