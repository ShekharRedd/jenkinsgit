FROM ubuntu:16.04

RUN mkdir -p /app

COPY ./wat.sh /app

WORKDIR /app

CMD ["bash", "wat.sh"]
