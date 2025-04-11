FROM rockylinux:8

RUN dnf update -y && \
    dnf install -y java-17-openjdk-devel git maven wget unzip && \
    dnf clean all

ENV JAVA_HOME=/usr/lib/jvm/java-17-openjdk
ENV PATH=$JAVA_HOME/bin:$PATH

WORKDIR /workspace

CMD ["/bin/bash"]
