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
