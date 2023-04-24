FROM ubuntu:16.04

RUN mkdir -p /app

COPY . /app

WORKDIR /app

CMD ["bash", "wat.sh"]
