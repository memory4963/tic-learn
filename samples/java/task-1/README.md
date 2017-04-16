# Java task-1 解答

> _by zzhoujay_

```
/**
 * Java 中class关键字用来定义类，并且一切逻辑的进行都需要依赖类
 * Java 规范：一个文件只定义一个public类，public 类名和文件名需要相同
 * private关键词不能修饰外部类（想想为什么）
 **/
public class Hello{
    /**
     * Java程序的入口为main函数，是Java程序首先执行的地方
     * main函数由于没有返回值，所以返回类型为void（为什么？)
     * 由于main函数是JVM虚拟器调用的所以必须为public访问权限，且main函数的执行不依赖于Hello类的对象，
     * 故为static静态方法。
     * main函数有一个String数组作为参数，该参数即在程序运行时输入的参数，
     * 例：java Hello test1 test2,其中的test1和test2即为main函数的参数，
     * Java中可以使用可变参数代替数组所以此处写成了String...args
     **/
    public static void main(String...args){
        /**
         * System是Java标准库中的一个类，out为它的一个共有静态变量，是一个输出流，
         * out的println方法是打印出参数说对应的字符串输出到控制台并换行，
         * 若参数不为String类型则会调用参数的toString方法输出。
         **/
        System.out.println("Hello World");
    }
}
```