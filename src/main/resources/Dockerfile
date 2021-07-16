FROM library/postgres
MAINTAINER jinheyang

# 初始化PostgreSQL
ENV POSTGRES_USER root
ENV POSTGRES_PASSWORD root
ENV POSTGRES_DB postgres

# 容器运行时监听的端口
EXPOSE 5432

# 构建镜像
# docker build -f ./Dockerfile -t jhy/pgsql .

# docker images 查看镜像
# 创建容器 docker run -it -p (指定宿主机端口):5432 -v /var/lib/postgresql/jhy_PostgreSQL_1.0.0_data:/var/lib/postgresql/data oy/pgsql
#   docker run -it -p 5433:5432 -v /var/lib/postgresql/jhy_PostgreSQL_1.0.0_data:/var/lib/postgresql/data oy/pgsql

# docker ps 查看运行的容器
# 输入 pwd
# 输入 psql postgres(初始化的数据库名)

# 在idea内连接
    # host: 0.0.0.0
    # port: 之前指定宿主机端口
    # 用户名: root (初始化时的用户名)
    # 密码: root (初始化时的密码)
    # 数据库: postgres (初始化时的数据库)
