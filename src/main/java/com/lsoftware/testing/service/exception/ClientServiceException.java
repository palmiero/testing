package com.lsoftware.testing.service.exception;

abstract class ClientServiceException extends RuntimeException {

    ClientServiceException() {
    }

    ClientServiceException(String message) {
        super(message);
    }

    ClientServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
