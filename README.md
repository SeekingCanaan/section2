# section2

| 请求方法 | 请求路径    | 备注               |
| -------- | ----------- | ------------------ |
| get      | /person     | 查询所有人员数据   |
| post     | /person     | 添加人员数据       |
| put      | /person     | 更新指定id人员数据 |
| delete   | /person     | 删除所有人员数据   |
| get      | /person/:id | 查询指定id人员数据 |
| delete   | /person/:id | 删除指定id人员数据 |

整体流程：接口请求 --> controller层 --> service层接口实现类 --> dao层接口 --> mapper.xml --> postgresql 数据库 --> pojo封装的实体类层 --> service实现类 --> controller层 --> 返回数据

## 遇到的问题

1. 运行时sql语法报错，原因是表名要加双引号
2. Docker和Dockerfile运用不熟练，中间遇到很多小问题最后都通过网上查找资料解决了，最终的Dockerfile文件构建过程可能不完善，最终还要再通过几条Docker命令才完成postgresql的镜像构建。
