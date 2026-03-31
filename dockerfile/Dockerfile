# Ubuntu 22.04 base image
FROM ubuntu:22.04

# Set the environment variable for non-interactive
ENV DEBIAN_FRONTEND=noninteractive

# Install packages
RUN apt-get update && apt-get install -y \
    software-properties-common \
    build-essential \
    wget \
    curl \
    libssl-dev \
    zlib1g-dev \
    libbz2-dev \
    libreadline-dev \
    libsqlite3-dev \
    llvm \
    libncurses5-dev \
    libncursesw5-dev \
    xz-utils \
    tk-dev \
    libffi-dev \
    liblzma-dev \
    python3-openssl \
    git \
    ca-certificates \
    tzdata \
    jq \
    vim \
    openjdk-17-jdk

# Set JAVA_HOME
ENV JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
ENV PATH=$JAVA_HOME/bin:$PATH

# Set the timezone
RUN ln -fs /usr/share/zoneinfo/Asia/Seoul /etc/localtime && \
    dpkg-reconfigure --frontend noninteractive tzdata

# Install python3.10
RUN add-apt-repository ppa:deadsnakes/ppa
RUN apt-get install -y python3.10 python3.10-dev python3.10-distutils

# Install latest pip
RUN curl https://bootstrap.pypa.io/get-pip.py -o get-pip.py
RUN python3.10 get-pip.py

# Set the python3.10 as default python
RUN ln -s /usr/bin/python3.10 /usr/bin/python

# Git clone the repository
RUN git clone https://github.com/andthemomentoflife/artifact_pig.git

# Set the working directory
WORKDIR /artifact_pig

# Install pythonparser
RUN git clone https://github.com/GumTreeDiff/pythonparser.git /opt/pythonparser \
    && cd /opt/pythonparser \
    && pip install -r requirements.txt \
    && cp pythonparser /tmp

ENV PATH=$PATH:/tmp

# Install the requirements
RUN pip install -r src/requirements.txt

# Set the entrypoint
CMD ["bash"]