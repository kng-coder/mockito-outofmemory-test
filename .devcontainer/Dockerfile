# build時に使用するARGを定義している部分
ARG ubuntu_version
ARG timezone
ARG port_web_server

# https://hub.docker.com/_/ubuntu/
FROM openjdk:17-jdk-slim

#ENV DEBIAN_FRONTEND=noninteractive
#ENV LC_ALL=ja_JP.UTF-8
#ENV LC_CTYPE=ja_JP.UTF-8
#ENV LANGUAGE=ja_JP:jp
#ENV TZ $timezone
#ENV PORT_WEB_SERVER $port_web_server
#ENV APP_CODE_PATH_CONTAINER $app_code_path_container

# Ubuntu base setting (locale と timezone と デバッグによく使用するものを入れる)
#RUN sed -i'' 's/archive.ubuntu.com/jp.archive.ubuntu.com/' /etc/apt/sources.list
#RUN apt-get update \
#    && apt-get -y -q install \
    # devtool
#    vim netcat git curl wget zip unzip sudo net-tools \
    # pkg-config libgtk-3-dev cmake ninja-build gnupg gcc libc-dev clang software-properties-common \
#    python3-pip libnss3 libpq-dev postgresql-client

RUN apt-get update
RUN apt-get -y install curl zip git visualvm
RUN curl -s "https://get.sdkman.io" | bash
RUN echo ". $HOME/.sdkman/bin/sdkman-init.sh; sdk install gradle" | bash
