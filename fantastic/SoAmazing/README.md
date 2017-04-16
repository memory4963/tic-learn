# So Amazing !!!

> 代码生成图片的游戏，生成了Amazing的图片了不要忘记在群里共享哦

### 原理

编写一个颜色生成器，生成图片每个点的颜色值

### 例子

下面是我简单的生成器
```
package com.tic;

import java.awt.*;

/**
 * Created by zhou on 15-12-15.
 */
public class MyGenerator implements ColorGenerator {
    @Override
    public int generator(int i, int j) {
        int c = (int) (Math.sqrt(i * i + j * j) / (200 * Math.sqrt(2)) * 256);
        return new Color(c, c, c).getRGB();
    }

    @Override
    public int width() {
        return 200;
    }

    @Override
    public int height() {
        return 200;
    }
}
```
然后执行SoAmazin.jar：
```
java -jar SoAmazing.jar ~/MyGenerator.java com.tic.MyGenerator ~/example.png
```
（SoAmazing.jar在libs文件夹中,SoAmazing.jar 接受三个参数，依次是你写的颜色生成器源文件完整路径、
源文件的类的全名、输出图片路径）

就会生成example.png啦
![example](img/example.png)

### 注意

自己写的Generator必须实现`ColorGenerator`或实现它的两个抽象子类
`InterestingColorGenerator`、`FantasticColorGenerator`

为了大家方便写代码，提供了`ColorGenerator.jar`，里面有上面的三个接口/类

### 然后

* 生成更加炫酷的图片
* 生成图片的原理？
* 动态编译/加载类？
* 更好的玩法？

_by zzhoujay_