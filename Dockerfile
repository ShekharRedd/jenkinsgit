FROM ubuntu:16.04

COPY wat.sh /app/

WORKDIR /app

CMD ["bash", "wat.sh"]
