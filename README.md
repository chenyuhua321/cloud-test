# cloud-test

#### 介绍
spring cloud练习

#### 软件架构
parent ---基础jar包集合

common ---统一返回参数

code-server ---验证码服务

mail ---邮件服务

user-server--- 用户服务

config-server ---配置中心

eureka-server ---注册中心A

eureka-server-B ---注册中心B

gateway---网关




#### 配置说明

**host配置**：

```
127.0.0.1 EurekaServerA
127.0.0.1 EurekaServerB
127.0.0.1 www.test.com
```

**nginx配置**：

```
location /static {
			alias D:/download/5ec3c03c5bb03/assets/log-form/1/;
            autoindex on;
		}
		
location /api {
			proxy_pass http://EurekaServerA:9002;
}
```

详细可见https://gitee.com/chenyuhua321/cloud-test/blob/master/conf/nginx.conf

**数据库sql配置**：

https://gitee.com/chenyuhua321/cloud-test/blob/master/conf/lagou.sql



#### 使用说明

1. #### 注册测试

   <iframe height=498 width=510 src="https://gitee.com/chenyuhua321/cloud-test/raw/master/video/register.flv">

   <video src="https://gitee.com/chenyuhua321/cloud-test/blob/master/video/register.flv"></video>

#### 2.登录测试

 <video src="D:\拉钩作业\cloud-test\video\login.flv"></video>

#### 3.token测试

<video src="D:\拉钩作业\cloud-test\video\cookie.flv"></video>

#### 4.ip防爆刷测试

<video src="D:\拉钩作业\cloud-test\video\ip.flv"></video>

6.  https://gitee.com/gitee-stars/)
