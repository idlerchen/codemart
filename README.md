# codemart
www.codemart.com
## 项目介绍
----
codemart项目是在学习javaEE之后，利用JavaEE的规范些的项目，模仿的网站是www.codemart.com
爬取的该网站的页面，根据mvc模式写的项目，
该项目业务：码市项目，用于需求者发布自己的需求，程序员作为开发者通过完善自己的信息，申请项目，需求者筛选开发者并取得合作，完成项目。
----
![1](https://github.com/idlerchen/codemart/blob/master/WebContent/readme_img/5.png)
## 相关技术
架构：mvc架构
项目中利用接口编程，反射机制，简化大量sql代码及servlet代码
model:dao/service 数据/业务模型，利用阿帕奇开源jar包较多(dbutils jdbc)
control：servlet session cookie (beanutils)
view:html.css部分前端功能实现
          jquery/js ajax页面的交互
          jstl el表达式，页面的渲染

## 项目功能
----
1.登录注册，（注册选择身份注册）注册后可通过用户名、手机号、邮箱号登录
2.查看项目列表，排序，查询功能
3.发布需求，修改需求（需求者），筛选申请者
4.完善履历，申请项目（开发者）

## 项目部分截图
----
项目列表
![1](https://github.com/idlerchen/codemart/blob/master/WebContent/readme_img/1.png)
项目详情
![2](https://github.com/idlerchen/codemart/blob/master/WebContent/readme_img/2.png)
发布需求这查看申请项目情况
![3](https://github.com/idlerchen/codemart/blob/master/WebContent/readme_img/3.png)
开发者参与项目
![4](https://github.com/idlerchen/codemart/blob/master/WebContent/readme_img/4.png)
