package com.test.dockerjava;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientBuilder;
import com.github.dockerjava.core.DockerClientConfig;

public class Main {

    protected static final String DOCKER_SOCK_PATH = "/var/run/docker.sock";
    private static final String SOCKET_LOCATION = "unix://" + DOCKER_SOCK_PATH;

    public static void main(String[] args) {
        DockerClientConfig config = DefaultDockerClientConfig.createDefaultConfigBuilder()
                .withDockerHost(SOCKET_LOCATION)
                .withDockerTlsVerify(false)
                .withRegistryUrl("https://index.docker.io/v1/")
                .build();


        DockerClient client = DockerClientBuilder.getInstance(config).build();
        client.listImagesCmd().exec().forEach(System.out::println);
    }
}
