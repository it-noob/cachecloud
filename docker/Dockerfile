#################################
#version: 1.2
#desc: cachecloud 镜像
#################################
FROM anapsix/alpine-java:8u181b13_jdk

MAINTAINER itnoob

ENV CACHECLOUD_VERSION 1.2
ENV base_dir /opt/cachecloud-web
WORKDIR ${base_dir}
COPY cachecloud-bin-1.2.tar.gz /opt
RUN apk --update add tar bash && \
       cd /opt && \
       tar -xvf cachecloud-bin-1.2.tar.gz  && \
       mkdir -p ${base_dir}/logs && \
       rm -rf /opt/cachecloud-bin-1.2.tar.gz
VOLUME ${base_dir}
COPY start-container.sh ${base_dir}
ENTRYPOINT ["bash","start-container.sh"]
EXPOSE 8585