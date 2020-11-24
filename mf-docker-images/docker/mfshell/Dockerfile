#alphine-image is not working here-I can not start basg scripts with alphine - don't lnow what is missing
FROM adoptopenjdk/openjdk11:jre-11.0.8_10

ADD ./mfshell /mfshell
RUN mkdir /mfshell/envconfig
ADD ./dac.res /mfshell/envconfig
ADD ./runner.sh /mfshell

ENV DAC_RES_PATH=/mfshell/envconfig

WORKDIR /mfshell/

#java call has to be wrapped to get arguments from outside the container
ENTRYPOINT ["./runner.sh"]
