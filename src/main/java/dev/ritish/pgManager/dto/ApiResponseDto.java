package dev.ritish.pgManager.dto;

import java.time.Instant;

public record ApiResponseDto<T>(
    boolean success,
    String message,
    int status,
    T data,
    Instant timestamp,
    String path) {

  public static <T> ApiResponseDto<T> success(
      String message,
      int status,
      T data,
      String path) {

    return new ApiResponseDto<>(
        status < 300 ? true : false,
        message,
        status,
        data,
        Instant.now(),
        path);
  }

}
