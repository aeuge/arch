FROM mongo:latest

# Define mountable directories.
VOLUME ["/data/db:/data/db"]
#VOLUME ["/data/db"]
VOLUME ["/etc/timezone:/etc/timezone"]
VOLUME ["/etc/localtime:/etc/localtime"]

# Define working directory.
#WORKDIR /data/db

# Define default command.
CMD ["mongod"]

# Expose ports.
#   - 27017: process
#   - 28017: http
EXPOSE 27017
#EXPOSE 28017