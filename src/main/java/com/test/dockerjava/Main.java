package com.test.dockerjava;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientBuilder;
import com.github.dockerjava.core.DockerClientConfig;

public class Main {
    public static void main(String[] args) {
        DockerClientConfig config = DefaultDockerClientConfig.createDefaultConfigBuilder()
                .withDockerHost("unix:///var/run/docker.sock")
                .withDockerTlsVerify(false)
                .withRegistryUrl("https://index.docker.io/v1/")
                .build();


        DockerClient client = DockerClientBuilder.getInstance(config).build();
        client.listImagesCmd().exec().forEach(System.out::println);
    }
}
