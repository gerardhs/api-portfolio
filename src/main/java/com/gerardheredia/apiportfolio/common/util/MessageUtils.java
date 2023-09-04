package com.gerardheredia.apiportfolio.common.util;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

@Component
public class MessageUtils {
	
	private final MessageSource messageSource;

    public MessageUtils(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    /* Get message from messages.properties */
    public String getMessage(String messageKey, Object... params) {
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage(messageKey, params, locale);
    }

}
