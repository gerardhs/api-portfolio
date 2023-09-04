package com.gerardheredia.apiportfolio.common.util;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse<T> {
	
	private int status;
	private String message;
	private T data;
	
	public static <T> ApiResponse<T> success(T data, String message) {
        return new ApiResponse<>(HttpStatus.OK.value(), message, data);
    }
	
	public static <T> ApiResponse<T> error(HttpStatus status, String message) {
        return new ApiResponse<>(status.value(), message, null);
    }

}
