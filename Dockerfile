FROM ubuntu:16.04

<<<<<<< HEAD
RUN mkdir -p /app

COPY ./wat.sh /app

WORKDIR /app

CMD ["bash", "wat.sh"]
=======
CMD ["echo","hello world"]
>>>>>>> 0a8df2500ef68c6f259e0d3a61346f0ca7aee6ce
