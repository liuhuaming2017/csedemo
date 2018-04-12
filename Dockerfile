FROM 100.125.16.65:20202/hwcse/as-go:1.8.5

COPY ./test02 /home
COPY ./conf /home/conf
RUN chmod +x /home/test02

CMD ["/home/test02"]