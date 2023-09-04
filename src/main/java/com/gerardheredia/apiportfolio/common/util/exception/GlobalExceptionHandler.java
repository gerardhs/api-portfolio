package com.gerardheredia.apiportfolio.common.util.exception;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gerardheredia.apiportfolio.common.constants.MessageConstants;
import com.gerardheredia.apiportfolio.common.util.ApiResponse;

@ControllerAdvice
public class GlobalExceptionHandler {

	private final MessageSource messageSource;

	public GlobalExceptionHandler(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@ExceptionHandler(Exception.class)
	@ResponseBody
	public ApiResponse<?> handleGlobalException(Exception ex) {
		return ApiResponse.error(HttpStatus.INTERNAL_SERVER_ERROR,
				messageSource.getMessage(MessageConstants.ERROR_UNKOWN, null, LocaleContextHolder.getLocale()));
	}

}
