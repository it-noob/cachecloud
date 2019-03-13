## 制作 dockerfile
cd 到 docker 目录，执行 `docker build -t cachecloud:1.2 .` 制作镜像

## 启动 cachecloud 容器

```bash
run -itd -p 8585:8585 -e cachecloud_db_url="jdbc:mysql://ip:port/cache_cloud" -e cachecloud_db_user="user" -e cachecloud_db_password="pwd" --name cachecloud cachecloud:1.2
```