## 博客介绍


<p align="center">
   基于Springboot + Vue3 开发的前后端分离博客
</p>

<p align="center">
   <a target="_blank" href="https://github.com/ttkican/Blog">
      <img src="https://img.shields.io/badge/JDK-8-green"/>
      <img src="https://img.shields.io/badge/springboot-2.5.0-green"/>
      <img src="https://img.shields.io/badge/vue-3.x-green"/>
      <img src="https://img.shields.io/badge/mysql-8.0.26-green"/>
      <img src="https://img.shields.io/badge/redis-3.2.100-green"/>
      <img src="https://img.shields.io/badge/mybatis--plus-3.4.3-green"/>
      <img src="https://img.shields.io/badge/jwt-0.9.0-green"/>
      <img src="https://img.shields.io/badge/swagger2-2.9.2-green"/>
      <img src="https://img.shields.io/badge/fastjson-1.2.33-green"/>
   </a>
</p>

**Github 地址：** [https://github.com/Leloz00/leloz-blog](https://github.com/Leloz00/leloz-blog)

## 本地运行

1. MySQL版本为`8.0.26`，npm版本为`8.1.2`，node版本为`v16.13.2`
2. SQL 文件位于根目录下的`leloz-blog.sql`，将其中的数据导入到自己本地数据库中
3. 修改后端配置文件中的数据库等连接信息
4. 项目启动后，使用`admin`管理员账号登录后台，密码为`1234`

## 项目特点

- 后台管理基于若依二次开发，含有侧边栏，历史标签，面包屑等
- 前后端分离，Docker Compose 一键部署
- 采用 RABC 权限模型
- 支持动态权限修改、动态菜单和路由
- 发布评论、回复评论
- 文章搜索支持关键字高亮分词
- 文章编辑使用 Markdown 编辑器
- 含有最新评论、文章目录、文章推荐和文章置顶功能
- 采用 Restful 风格的 API，注释完善，代码遵循阿里巴巴开发规范，有利于开发者学习

## 技术介绍

**前端：** Vue3 + Vue Router + Element UI 

**后端：** SpringBoot + Mysql + Redis + Maven + Nginx + Docker + Swagger2 + MyBatisPlus + Jwt + Fastjson

## 开发环境

| 开发工具              | 说明               |
| --------------------- | ------------------ |
| IDEA                  | Java 开发工具 IDE  |
| VSCode                | Vue 开发工具 IDE   |
| Navicat               | MySQL 远程连接工具 |
| Redis Desktop Manager | Redis 远程连接工具 |
| Xshell                | Linux 远程连接工具 |
| Xftp                  | Linux 文件上传工具 |

| 开发环境 | 版本    |
| -------- | ------- |
| OpenJDK  | 8       |
| MySQL    | 8.0.26  |
| Redis    | 3.2.100 |

## 后续计划

- [ ] 整合 EasyExcel 导出 Excel
- [ ] 第三方登录使用 JustAuth
- [ ] 博客文章导入导出
- [ ] 移动端文章目录
- [ ] 图片瀑布流布局
- [ ] B 站追番页
- [ ] B 站图床
- [ ] 聊天室
