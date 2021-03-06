# 微博系统项目概述
简单的微博系统，包含最基础单元的功能点。

> 开发语言基于java（jdk1.8版本），db存储基于 mysql5.6，nosql 使用 redis，服务部署运行在 linux+tomcat。

## 一. 项目周期
项目周期分为三个阶段

1. 基于 spring boot，整合最稳定/最流行/最通用的开发技术，完成微博系统的基础功能点开发。（核心在于服务端，至于何种方式的展示类型不重点关注）
    
    > 涉及到的技术点：spring boot, spring, mybatis, mysql, redis, restful api design, jwt, AOP ...
     
2. 引入 spring cloud，实现服务的拆分及调用，探索及实践微服务架构

3. 待定，取决于第二阶段情况

## 二. 系统业务模块说明
![image](https://raw.githubusercontent.com/mntfun/linker/master/linker-doc/weibo-business-modulev1.0.png)

## 三. 第一版系统架构图
![image](https://raw.githubusercontent.com/mntfun/linker/master/linker-doc/weibo-sys-v1.0.jpeg)

## 四. 项目命名/结构/规范……
1. 项目名：linker
2. 结构：
    * linker-common: 公共模块，提供基础组件定义、操作工具类等
    * linker-service: 服务模块，提供各模块业务处理
    * linker-api: 接口模块，向外暴露 http restful 接口
3. 规范：参照 [Alibaba-Java-Coding-Guidelines](https://alibaba.github.io/Alibaba-Java-Coding-Guidelines/) 

## 五. DB设计
[linker.db](https://github.com/mntfun/linker/blob/master/linker-doc/linker.svg)

## 六. API设计
> TODO