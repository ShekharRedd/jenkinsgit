FROM ubuntu:16.04

WORKDIR /app


COPY wat.sh /app/



CMD ["bash", "/app/wat.sh"]
