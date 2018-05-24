## GroovyDemo

### 问题记录
发现在eclipse中egit老是提交不了代码到github，进入如下两步修改：
1. 修改eclipse.ini文件加入如下参数
-Dhttps.protocols=TLSv1,TLSv1.1,TLSv1.2

2. eclipse->window->preferences->team->git->configuration
   add entry -> 设置key为http.sslVerify，值为false
   
如果eclipse默认是1.8jdk的环境则不会有问题
